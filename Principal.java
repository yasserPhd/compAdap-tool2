package pack;

import java.util.LinkedList;



public class Principal {
	//String []tr={"axc"};
	static StackL pile = new StackL();
	static Listtuple file = new Listtuple();
	static Listtuple too=new Listtuple();
	static StackL ensblt=new StackL();
	public static  String t0="axc";
   
	public static String [][]t={{"1","a","b"},
		              {"2","c","d"},
		              {"3","b","a"},
		              {"4","d","c"},
		              {"5","bxc","0"}
	};
	
	public static String onestep(String stm){
		 /*char a=(char)Couple.getCouple(t0).x;
		 char c=(char)Couple.getCouple(t0).y;
		 String q=""+c;
		 String b=""+a;*/
		String onestp="";
		 String tab1[]=stm.split("x");
		 int j=0;
		
		 if(tab1.length==2)
		 for(int i=0;i<=4;i++){
			if(t[i][1].equals(tab1[0])){
				if(onestp.equals("")){
						onestp=onestp+t[i][0];
				        tab1[0]=tab1[1];}
						else
						onestp=onestp+"x"+t[i][0];
							
						
						
				}}
			else
				onestp="";
				    	
				
		return onestp;	
		}
	public static String rew(String str,String alpha){
		String rew="";	
		String tab[]=str.split("x");
		String tab1[]=alpha.split("x");
			  
				boolean a=false;  
				
					for(int j=0;j<tab.length;j++)
						for(int i=0;i<t.length;i++){
					
					if(tab1[j].equals(t[i][0])&&(tab[j].equals(t[i][1]))){
						if(rew.equals("")){
							rew=rew+t[i][2];
							a=true;}
						else{
						rew=rew+"x"+t[i][2];
						a=true;}}
					else{
					if((a==false)&&(i==t.length-1)&&(j==tab.length-1)/*&&(j==tab1.length-1)*/){	
					  rew=str;}}}
					return rew;
						 
				
					
				}
					
	private static void generate_proof_terme(String t,String onsp){
		String t1=rew(t,onsp);
		Tuple t2=new Tuple();;
		t2.a=t;
		t2.b=onsp;
		t2.c=t1;
		too.push(t2);
	
		if(!ensblt.exist(t1))
		  {ensblt.push(t1);
		  pile.push(t1);
		if((Couple.lenght(onsp))==2)
			file.push(t2);}
		
		
		
		
	}
		
				
		
	
	
		
	
	public static void main(String[] args) {
		
		pile.push(t0);
		ensblt.push(t0);
		while(!pile.isEmpty()){
			String t=(String)(pile.pop());
			
			if(onestep(t).equals(""))
			System.out.println("deadlock");
			
			else
				generate_proof_terme(t,onestep(t));
				
			
		}
		
		
			//System.out.println(file.isEmpty());
			//System.out.println(file.lenght());
			//System.out.println(too.lenght());
			//System.out.println(ensblt.pop());
			System.out.println(file.pop().a);
			System.out.println(file.pop().a);
			System.out.println(file.pop().a);
			
			
		
		
		
	 
		// TODO Auto-generated method stub
		
	

}}

