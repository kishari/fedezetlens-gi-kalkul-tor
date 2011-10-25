package hu.dbx.ws.model;

/**
 * Created by IntelliJ IDEA.
 * User: Csaba Harangozó
 * Date: 2011.10.25.
 * Time: 10:05
 */
public class Param {
    private String key;
    private String value;

    public Param(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
