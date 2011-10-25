package hu.dbx.ws.iface.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Csaba Harangozó
 * Date: 2011.10.25.
 * Time: 11:29
 */
public class PremiumListV1 {
    private List<PremiumV1> premiumList = new ArrayList<PremiumV1>();

    @XmlElement(name = "premium")
    public List<PremiumV1> getPremiumList() {
        return premiumList;
    }

    public void setPremiumList(List<PremiumV1> premiumList) {
        this.premiumList = premiumList;
    }
}
