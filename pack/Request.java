package pack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Request {
	 private static Connection conn;
		private Base maBase = new Base();
		public static String mon = Composition_adapt.splitServiceRequest(Composition_adapt.request)[0] ;
		public static String mon2 = Composition_adapt.splitServiceRequest(Composition_adapt.request)[1] ;
		public static Webservice wsm;
		public static Listwebservice lws  = new Listwebservice();;
		public Request(){
	        //Connexion à la base de données
	        maBase.dbConnect();
	        //Indique si la connexion est valide
	        conn = maBase.getConn();
	    }
	  public  Listwebservice search_for_services_to_compose (){
		    
	        String myquery = null;
	        Statement st = null;
	        ResultSet rs = null;
	       // String webservice="";
	       // String  input="";
	        //String typein = "";
	       // String nameOp = "";
	       // String output = "";
	        //String typeOut = "";
	        try {
	            //Exécution de la requête
	            st = conn.createStatement();
	            rs = st.executeQuery("select * FROM Table1 WHERE input = '"+ mon + " ' OR output = '" + mon2 + "'");
	             while(rs.next()){
	             wsm = new Webservice(); 
	             wsm.wsn = rs.getString("webservice") ;
	            // System.out.println(wsm.wsn);
	            wsm.input= rs.getString("input"); ;
	            wsm.typeIn = rs.getString("typeIn"); ;
	            wsm.setOp = rs.getString("nameOP");
	            wsm.output = rs.getString("output"); ;
	            wsm.typeout = rs.getString("typeOut") ;
	            lws.push(wsm);
	           // System.out.println("("+ wsm.wsn+","+wsm.input+"," + wsm.output+")");
	            
	            }
	            
	         // System.out.println("("+ webservice+","+input+"," + output+")");
	          
	            
	        }
	            
	            
	        catch (Exception e) {
	            System.out.println(e.toString());
	            
	        }
			
	        return lws; 	
	}
	  public  void affiche(Listwebservice l){
			for (int i=0;i<l.lenght();i++)
			System.out.println(l.valueAt(i).wsn);
		}
	  public void update(Webservice ws){
		  String req = null;
	        Statement st = null;
	        try{
	            req="UPDATE Table1  SET  nameOP='" +ws.setOp+"' , typeOut='"+ws.typeout+"' WHERE webservice='"+ws.wsn+"'";
	            st = conn.createStatement();
	            int rs = st.executeUpdate(req);
	            conn.close();  
	            
	        }
	        catch(SQLException e){
	            System.out.println(e.toString());
	        }
	    }
	 
	    public void insertWebservice( Webservice ws){
	    	
	        String req = null;
	        Statement st = null;
	        
	       
	        
	        try{
	            req="INSERT INTO Table1 VALUES ('"+ws.wsn+"','"+ws.input+"','"+ws.typeIn+"','"+ws.setOp+"','"+ws.output+"','"+ws.typeout+"')";
	            st = conn.createStatement();
	            int rs = st.executeUpdate(req);
	            conn.close();  
	            
	        }
	        catch(SQLException e){
	            System.out.println(e.toString());
	        }
	    }
	 
	 public static void main(String[]args){
		 Request r=new Request();
		//r.insertWebservice("ws14", "ae", "String","ae_to_gr","gr","String");
		// System.out.println(""+ mon + ","+ mon2  );
		/* Webservice wsj = new Webservice();
		 wsj.input ="fr";
		 wsj.output ="de";
		 wsj.setOp="fr_to_de";
		 wsj.typeIn ="String";
		 wsj.typeout = "Int";
		 wsj.wsn="ws18";
		 //Listwebservice lws = new Listwebservice() ;
		 
		 //System.out.println(lws.lenght());
		 //r.affiche(r.search_for_services_to_compose());
		 r.insertWebservice(wsj);*/
		 Request2 r2=new Request2();
		 //r2.consulter();
		 Webservice wsj = new Webservice();
		 wsj.input ="fr";
		 wsj.output ="de";
		 wsj.setOp="fr_to_def";
		 wsj.typeIn ="String";
		 wsj.typeout = "float";
		 wsj.wsn="ws4";
		// r.update(wsj);
		r2.consulter();
		 //r.affiche(r.search_for_services_to_compose());
		   
		 
	 }
}


