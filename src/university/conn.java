package university;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ums","root","Biswabandita@12345");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
