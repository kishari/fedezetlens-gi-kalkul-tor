package hu.dbx.ws.util;

import hu.dbx.ws.model.*;
import hu.dbx.ws.model.State.States;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.pool.ObjectPool;
import org.drools.runtime.rule.FactHandle;
import org.drools.runtime.StatefulKnowledgeSession;
import org.joda.time.DateTime;

public class DroolsHelper {
	private ObjectPool pool;
	
	public DroolsHelper(){}
	
	public static final void main(String[] args) 
			throws NoSuchElementException, IllegalStateException, Exception { }
	
	public Query compute(Query query) throws NoSuchElementException, IllegalStateException, Exception {
		StatefulKnowledgeSession ksession = (StatefulKnowledgeSession)pool.borrowObject();
		
		AgendaLogger agendaLogger = new AgendaLogger();
		ksession.addEventListener( agendaLogger );
		
		Collection facts = new ArrayList();
		facts.add(query);
		facts.add(new State(States.WF_START));
				
		Vehicle v = query.getVehicle();
		facts.add(v);

        int startYear = getYear(query.getStartDate());
        int endYear = getYear(query.getEndDate());

        if (startYear != 0 && endYear != 0) {
            for (int i = startYear; i <= endYear; i++) {
                facts.add(new Premium(i, null, null, null));
            }
        }
		
		Collection<FactHandle> factHandles = insertFacts(facts, ksession);
		ksession.fireAllRules();
		
		ksession.removeEventListener( agendaLogger );

		retractHandles(factHandles, ksession);
		pool.returnObject(ksession);
		
		ksession.dispose();
		
		return query;
	}

	private Collection<FactHandle> insertFacts(Collection facts, StatefulKnowledgeSession ksession){
		Collection<FactHandle> handles = new ArrayList<FactHandle>();
		for (Object o : facts){
			handles.add(ksession.insert(o));
		}
		return handles;
	}
	
	private void retractHandles(Collection<FactHandle> handles, StatefulKnowledgeSession ksession){
		for(FactHandle h : handles) {
			ksession.retract(h);
		}
	}

	public ObjectPool getPool() {
		return pool;
	}

	public void setPool(ObjectPool pool) {
		this.pool = pool;
	}

    private int getYear(Date d) {
	    if (d != null) {
		    DateTime date = new DateTime(d);
		    return date.getYear();
	    }

	    return 0;
    }

}
