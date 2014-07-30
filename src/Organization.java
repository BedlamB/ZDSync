/**
 * Created by vickys on 30/07/14.
 */
public class Organization {

    private int client_id;
    private String name;
    private int external_id;
    private int salesforce_id;

    public Organization(int client_id, String name, int external_id, int salesforce_id) {
        this.client_id = client_id;
        this.name = name;
        this.external_id = external_id;
        this.salesforce_id = salesforce_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExternal_id() {
        return external_id;
    }

    public void setExternal_id(int external_id) {
        this.external_id = external_id;
    }

    public int getSalesforce_id() {
        return salesforce_id;
    }

    public void setSalesforce_id(int salesforce_id) {
        this.salesforce_id = salesforce_id;
    }
}
