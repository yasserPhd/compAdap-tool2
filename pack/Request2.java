package pack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Request2 {
	 private Connection conn;
	private Base maBase = new Base(); 
	public Request2(){
        //Connexion à la base de données
        maBase.dbConnect();
        //Indique si la connexion est valide
        conn = maBase.getConn();
    }
  public void consulter (){
        String myquery = null;
        Statement st = null;
        ResultSet rs = null;
        String webservice="";
        String  input="";
        String typein = "";
        String nameOp = "";
        String output = "";
        String typeOut = "";
        try {
            //Exécution de la requête
            st = conn.createStatement();
            rs = st.executeQuery("select * from Table1");
            
            		
            //Table t=new Table();
            
            while(rs.next()){
            
           // myquery=  "SELECT * FROM stock";
            	//for(int j=0;j<i;j++){
            webservice=rs.getString("webservice");
            input=rs.getString("input");
            typein=rs.getString("typeIn");
            nameOp=rs.getString("nameOP");
            output= rs.getString("output");
            typeOut = rs.getString("typeOut");
            
           //Table.t.remp
            //for(int i=0;i<100;i++){
           
            //rs.next();
            
           System.out.println("("+ webservice+","+input+"," +typein+ ","+ nameOp+ ","+output+","+typeOut+" )");
            
            
        }
            //System.out.println(i); 
            //System.out.println(myquery);
            
            //}
      
        }
        catch (Exception e) {
            System.out.println(e.toString());
            
        }
        
}
  public void update(Webservice ws){
	  String req = null;
        Statement st = null;
        try{
            req="UPDATE Table1 SET nameOP = '" +ws.setOp + "' , typeOut = '" + ws.typeout+ "' WHERE webservice = '"+ ws.wsn +"' )";
            st = conn.createStatement();
            int rs = st.executeUpdate(req);
            conn.close();  
            
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
    }
 
  public static void main(String[]args){
		 Request2 r=new Request2();
		 
		 //r.creerStock("flan", 20, 5, 3);
		/* Webservice df=new Webservice();
		 df.input ="ae";
		 df.output="gr";
		 df.setOp = "ae_to_RG";
		 df.typeIn = "String";
		 df.typeout= "Int";
		 df.wsn="ws1";
		 r.update(df);*/
		   r.consulter();
		 
	 }
}
