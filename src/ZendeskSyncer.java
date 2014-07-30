import java.util.ArrayList;

/**
 * Created by vickys on 30/07/14.
 */
//public class ZendeskSyncer {

//    import java.util.ArrayList;
//
//    public class Main {
//
//
//
//
//        public static void main (String args[]) {
//
//            ArrayList<Organization> zendeskOrgs = new ArrayList<Organization>();
//            ArrayList<User> zendeskUsers = new ArrayList<User>();
//
//            ArrayList<Organization> brandwatchOrgs = new ArrayList<Organization>();
//
//            //connect to jdbc
//            //load orgs as csv
//
//            // for each record make a new object
//            Organization bwOrg = new Organization(client_id, name, external_id, salesforce_id);
//            brandwatchOrgs.add(bwOrg);
//
//            // get zemdesk orgs and put them in list
//            Organization zdOrg = new Organization(client_id, name, external_id, salesforce_id);
//            zendeskOrgs.add(zdOrg);
//
//            //create orgs from scratch, with external id and salesforce id already
//            implemented
//            //yes, build the json for our orgs in the db and call the create endpoint
//            // only need to do this once
//            // curl -v -u {email_address}:{password}
//            https://{subdomain}.zendesk.com/api/v2/organizations/create_many.json \
//            // -H "Content-Type: application/json" -X POST -d '{"organizations": [{"name":
//            "Org1"}, {"name": "Org2"}]}'
//
//
//    http://stackoverflow.com/questions/11260628/how-to-find-the-differences-between-t
//    wo-array-lists-based-on-a-property
//
//            // leaves us with only orgs we need to create;
//            createList = bwOrgs.removeAll(zdOrgs);
//
//    // build jsn list of orgs to create
//    // call multi-create endpoint
//
//    // leaves us with only orgs we need to disable;
//    disableList = zdOrgs.removeAll(bwOrgs);
//
//    for each (org in disableList)  org.enabled = false;
//    call zd update org endpoint (org.id)
//
//    for each (org in brandwatchOrgs){
//        for each zendesk org{
//            if bwOrg.name = zd.name {
//                if bwOrg.enabled = false
//                zdOrg.enabled = false;
//                zdOrg.external_id = bwOrg.external_id;
//
//            }
//        }
//    }
//
//    getBWuers
//            getZDusers
//// do same as above but with users ie add to list, remove all to get difference
//    for each user is zd zendeskUsers
//    bwuserlist.get(user.username)
//    zdusers.user.organizationId = bwuserlist.id;
//
//}
//
//
//
//
//}
