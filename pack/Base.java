package pack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Base {
    
    /** Creates a new instance of connection */
    private Connection conn=null;
   
   
    public Base() {
		}
		
    public boolean dbConnect(){
	boolean ok = false;              
	try {
             try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             }
             catch(ClassNotFoundException ex){                                        
                ok = false;
             }
             conn=DriverManager.getConnection("jdbc:odbc:webservice");
             ok = true;
        }
        catch (SQLException e) {
             ok = false;
        }
	return ok;
   }
   
    
    public boolean dbDisconnect() {
 	boolean ok;              
	try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn.close();
            ok = true;
        }
        catch (Exception e) {
            ok = false;
	}
	return ok;
    }
    
    
    public Connection getConn() {
	return conn;
    }
	 
  /*  public static void main(String[]args ) {
    	Base b =new Base();
    }*/
}


