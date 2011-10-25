package hu.dbx.ws.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Csaba Harangozó
 * Date: 2011.10.25.
 * Time: 11:26
 */
public class PremiumList {
    private List<Premium> premiumList = new ArrayList<Premium>();


	@XmlElement(name = "premium")
	public List<Premium> getPremiumList() {
		return premiumList;
	}

	public void setPremiumList(List<Premium> premiumList) {
		this.premiumList = premiumList;
	}
}
