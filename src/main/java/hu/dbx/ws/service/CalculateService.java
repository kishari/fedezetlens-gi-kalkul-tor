package hu.dbx.ws.service;

import hu.dbx.ws.iface.model.*;
import hu.dbx.ws.model.*;
import hu.dbx.ws.util.DroolsHelper;
import hu.dbx.ws.util.Mapper;

import java.util.NoSuchElementException;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebService(serviceName="CalculateService")
@HandlerChain(file = "handlers.xml")
public class CalculateService implements ApplicationContextAware {
	Logger logger = Logger.getLogger(CalculateService.class);
	
	public DroolsHelper droolsHelper;
	
	@Resource
	private WebServiceContext context;
	private ApplicationContext applicationContext = null;

	@WebMethod
	public QueryV1 calcMabiszPremium(@WebParam(name="query")QueryV1 query) {
		logger.debug("MABISZ calculate started.");
		try {
			Query q = getDroolsHelper().compute(Mapper.mapIn(query));			
			
			logger.debug("MABISZ calculate finished.");
			
			QueryV1 result = Mapper.mapOut(q);
			return result;
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@WebMethod(exclude = true)
	public DroolsHelper getDroolsHelper() {
		if (droolsHelper == null) {
			droolsHelper = (DroolsHelper)getWebApplicationContext().getBean("droolsHelper");
		}
		return droolsHelper;
	}
	
	@WebMethod(exclude = true)
	public void setDroolsHelper(DroolsHelper droolsHelper) {
		this.droolsHelper = droolsHelper;
	}
	
	@WebMethod(exclude = true)
    private ApplicationContext getWebApplicationContext() throws IllegalStateException {
        if (applicationContext == null) {
            ServletContext servletContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
            applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        }
        return applicationContext;
    }

	@Override
	@WebMethod(exclude = true)
	public void setApplicationContext(ApplicationContext appCtx)
			throws BeansException {
		this.applicationContext = appCtx;
	}
	
	
}
