import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/**
 * Created by gerdhung-chu on 9/08/17.
 */
public class JdbcTest {
    public static void main (String []Args){

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            //1. Get a connection to database
            myConn = DriverManager.getConnection ("jdbc:mysql:localhost:3306/employees", "root", "NuRgu?8EvCss");
            System.out.print("Database connection successful! \n");

            //2. create a statement
            myStmt = myConn.createStatement();

            //3. Excecute SQL Query

            myRs = myStmt.executeQuery("Select * from emploees");

            //4. Process the result set

            while (myRs.next()){
                System.out.print(myRs.getString("last name") + ", " + myRs.getString("first name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
