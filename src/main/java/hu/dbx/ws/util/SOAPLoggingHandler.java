package hu.dbx.ws.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.Serializer;

import org.apache.log4j.Logger;

public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {
	private static Logger logger = Logger.getLogger(SOAPLoggingHandler.class);
	
	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
	}
	
    private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
            smc.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        
        if (outboundProperty.booleanValue()) {
        	logger.debug("Outgoing message:");
        } else {
        	logger.debug("Incoming message:");
        }
        
        SOAPMessage message = smc.getMessage();
        try {
        	ByteArrayOutputStream baos = new ByteArrayOutputStream();
        	message.writeTo(baos);
        	logger.debug(format(baos.toString()));
        } catch (Exception e) {
        	logger.error("Exception in handler", e);
        }
    }
    
    private String format(String xml) throws ParsingException, IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serializer serializer = new Serializer(out, "UTF-8");
        serializer.setIndent(4);
        serializer.write(new Builder().build(xml, ""));
        return out.toString();
    }

}
