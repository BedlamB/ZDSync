import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by vickys on 30/07/14.
 */
public class JDBCConnector {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;


        String url = "jdbc:postgresql://localhost/brandwatch-crawler.db";
        String user = "brandwatch";
        String password = "brandwatchpwd";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT id,name FROM clients WHERE enabled ORDER BY id desc");

            if (rs.next()) {
                System.out.println(rs.getString(2));
            }

        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(ex.getName());
            ex.printStackTrace();
            //lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

               // Logger lgr = Logger.getLogger(Version.class.getName());
               // lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}