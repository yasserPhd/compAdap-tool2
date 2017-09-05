package pack;

public class Composition_adapt {
	static Webservice ws ;
	static Webservice ws2 ;
	static boolean compatiblity ; 
	public static String request = "dollars_to_Dz " ;
	
	 public static String []  splitServiceRequest(String R){
		 String [] TR = R.split("_");
		 for(int i=0;i<TR.length;i++)
			 if( TR[i].equals("to") ){
				 TR[i]=TR[i+1];
				 i=i+1;}
		         
				 
		 return TR;
	 }
	 public static boolean check_compatibility(Webservice ws1,Webservice ws2){
		if(ws1.output.equals(ws2.input) ) 
			compatiblity = true;
		else 
			compatiblity = false ;
		return compatiblity ;
			
	 }
	 public static Webservice composite_service(Webservice ws,Webservice ws2){
		 Webservice cws= new Webservice();
		 cws.input=ws.input ;
		 cws.output=ws2.output;
		 cws.setOp = ""+ws.setOp+","+ws2.setOp+"";
		 cws.typeIn =ws.typeIn;
		 cws.typeout =ws2.typeout;
		 cws.wsn="comp("+ ws.wsn+","+ ws2.wsn+")";
		 return cws;
	 }
	 public static boolean check_heterogeneity(Webservice ws1,Webservice ws2){
		 if (ws1.typeout.equals(ws2.typeIn)&&(ws1.output.equals(ws2.input) ))
		    return true ;
		 else 
			 return false ;
		 
	 }
	 public static void resolve_heterogeneity(Webservice ws1,Webservice ws2){
		 if (!ws1.typeout.equals(ws2.typeIn)){
			 ws1.typeout=ws2.typeIn ;
		     Request g = new Request();
		     g.update(ws1);
		     }
	     }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request r = new Request();
	//	Listwebservice lws =r.search_for_services_to_compose();
		//check_compatibility()
		Request rb = new Request();
		Listwebservice lf = rb.search_for_services_to_compose();
		//System.out.println(lf.valueAt(1).typeIn);
		
		//System.out.println(check_heterogeneity(lf.valueAt(0),lf.valueAt(1)));
		
		if (check_heterogeneity(lf.valueAt(0),lf.valueAt(1))){
			r.insertWebservice(composite_service(lf.valueAt(0),lf.valueAt(1)));
			Result r1=new Result();
			r1.jTextField.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).wsn);
			r1.jTextField1.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).input);
			r1.jTextField2.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).output);
	//System.out.println("(" +composite_service(lf.valueAt(0),lf.valueAt(1)).wsn+","+composite_service(lf.valueAt(0),lf.valueAt(1)).input+","+composite_service(lf.valueAt(0),lf.valueAt(1)).output+")");
		}
		else 
		{
		resolve_heterogeneity(lf.valueAt(0),lf.valueAt(1));
		Request rq=new Request();
		rq.insertWebservice(composite_service(lf.valueAt(0),lf.valueAt(1)));
		Result r2=new Result();
		r2.jTextField.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).wsn);
		r2.jTextField1.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).input);
		r2.jTextField2.setText(composite_service(lf.valueAt(0),lf.valueAt(1)).output);}
		//Request2 f=new Request2();
		//f.consulter();
			
		}	
		}
			
			
	

//}
