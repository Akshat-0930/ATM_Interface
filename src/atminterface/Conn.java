
package atmInterface;
import java.sql.*;


public class Conn{
    Connection c;
    Statement s;
    
    public Conn(){
    try{ 
        c=DriverManager.getConnection("jdbc:mysql:///atmInterface","root","Akshat@123");
        s=c.createStatement();
    
    }catch(Exception e){
            System.out.println(e);
} 
    
}
}