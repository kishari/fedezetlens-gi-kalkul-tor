package hu.dbx.ws.util;

import hu.dbx.ws.model.facts.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.runtime.Environment;
import org.drools.runtime.KnowledgeSessionConfiguration;
import org.drools.runtime.StatefulKnowledgeSession;

public class KnowledgeSessionFactory extends BasePoolableObjectFactory {

	private KnowledgeBase knowledgeBase;
	
	private String csvPath;

	@Override
	public Object makeObject() throws Exception {
		KnowledgeSessionConfiguration config = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
		Environment env = KnowledgeBaseFactory.newEnvironment();
		config.setProperty("drools.keepReference", "false");
		StatefulKnowledgeSession sess = knowledgeBase.newStatefulKnowledgeSession(config, env);
		addFacts(sess);
		
		return sess;
	}
	
	private void addFacts(StatefulKnowledgeSession sess) throws Exception {
		addFacts(sess, BaseTariffDef.class, new String[] {"vehicleType", "value", "validFrom", "validTo"}, getReaderFor("BaseTariffDef"));
		addFacts(sess, AutoBusBaseTariffDef.class, new String[] {"seatingCapacityMin", "seatingCapacityMax", "value", "validFrom", "validTo"}, getReaderFor("AutoBusBaseTariffDef"));
		addFacts(sess, CarBaseTariffDef.class, new String[] {"cubicCapacityMin", "cubicCapacityMax", "powerMin", "powerMax", "value", "validFrom", "validTo"}, getReaderFor("CarBaseTariffDef"));
		addFacts(sess, MotorBikeBaseTariffDef.class, new String[] {"cubicCapacityMin", "cubicCapacityMax", "powerMin", "powerMax", "value", "validFrom", "validTo"}, getReaderFor("MotorBikeBaseTariffDef"));
		addFacts(sess, TruckBaseTariffDef.class, new String[] {"carryingCapacityMin", "carryingCapacityMax", "allowedWeightMin", "allowedWeightMax", "value", "validFrom", "validTo"}, getReaderFor("TruckBaseTariffDef"));
		addFacts(sess, VehicleTypeDef.class, new String[] {"typeCode", "description", "constantName", "value", "validFrom", "validTo"}, getReaderFor("VehicleTypeDef"));
		addFacts(sess, MessageDef.class, new String[] {"code", "severity", "description"}, getReaderFor("MessageDef"));
	}

	private void addFacts(StatefulKnowledgeSession sess, Class clazz, String[] columnNames, Reader in){
		List l = CsvUtil.populateBeansFromCsv(clazz, columnNames, in);
		
		for (Object o : l) {
			sess.insert(o);
		}
	}

	public KnowledgeBase getKnowledgeBase() {
		return knowledgeBase;
	}

	public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
		this.knowledgeBase = knowledgeBase;
	}

	public String getCsvPath() {
		return csvPath;
	}

	public void setCsvPath(String csvPath) {
		this.csvPath = csvPath;
	}
	
	private Reader getReaderFor(String fact) throws FileNotFoundException{
		return new BufferedReader(new InputStreamReader( 
						getClass().getClassLoader().getResourceAsStream(String.format("csv/%s.csv", fact) ) )
				   );
	}

}
