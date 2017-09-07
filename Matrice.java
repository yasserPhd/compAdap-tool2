package pack;

public class Matrice {
	static Listtuple file = new Listtuple();
	static Listtuple too=new Listtuple();
	public static String t0="axc";
	
	public static String [][]t={{"1","a","b"},
        {"2","c","d"},
        {"3","b","a"},
        {"4","d","c"},
        {"5","bxc","0"}};
        
        
public static boolean existEfface(String m,String[] r){
	boolean a=false;
	for(int k=0;k<r.length;k++)
		if(m.equals(r[k])){
			a=true;
	        r[k]="vide";}
	return a;
	
}
public static boolean existTuple(Tuple t,Listtuple tau){
	boolean c=false;
	int i=0;
	while( (i<tau.lenght())||(c==true)){
		if(existstringEqual(t.a,tau.valueAt(i).a))
			if(existstringEqual(t.b,tau.valueAt(i).b)){
				if(existstringEqual(t.a,tau.valueAt(i).c)){
					c=true;
					i=i+1;
				}
					
			}
			
	}
	return c;	
}
public static boolean existstring(String terme,String tab){
	boolean a=false;
	int cn=0;
	String[] f=tab.split("x");
	String[] d=terme.split("x");
	for(int i=0;i<d.length;i++){
		if(exist(d[i],f))
				cn=cn+1;
		
	if(cn==d.length)
		a=true;
	}
	return a;		
}
public static boolean existstringEqual(String terme,String tab){
	boolean a=false;
	int cn=0;
	String[] f=tab.split("x");
	String[] d=terme.split("x");
	if(d.length==f.length){
	for(int i=0;i<d.length;i++){
		if(exist(d[i],f))
				cn=cn+1;
		
	if(cn==d.length)
		a=true;
	}
	}
	return a;		
}
public static boolean exist(String m,String[] r){
	boolean a=false;
	for(int k=0;k<r.length;k++)
		if(m.equals(r[k])){
			a=true;
			
	        }
	return a;
	
}
public static String rewG(String ter,String alp ){
	String rew="";
	int l=0;
	ListString ls=new ListString();
	String []f=alp.split("x");
	for(int i=0;i<f.length;i++)
	   for(int j=0;j<t.length;j++){
		   if(f[i].equals(t[j][0])){
			 if(existstring(t[j][1],ter)){
				 ls.push(t[j][2]);
				 //l=l+1;
				 /*f[i]="vide";*/} 
			}
	      }
	  
	//System.out.println(l);
	//System.out.println(f[1]);
	
	for(int k=0;k<ls.lenght();k++)
		if(rew.equals(""))
			rew=rew+ls.valueAt(k);
		else
			rew=rew+"x"+ls.valueAt(k);
	return rew;
			
			
}
	public static String onestepG(String terme){
		ListString d=new ListString();
		String onstp="";
		String[]r=terme.split("x");
		for(int i=0;i<t.length;i++){
			if(existstring(t[i][1],terme))
			   d.push(t[i][0]);
					}
		 for(int f=0;f<d.lenght();f++){
			 if(onstp.equals(""))
				 onstp=onstp+d.valueAt(f);
			 else
			 onstp=onstp+"x"+d.valueAt(f);}
					
			return onstp;
		}
 public static String rewseq(String terme,String beta){
	String rew="";
String[] tab1=beta.split("x");
String[] tab=terme.split("x");
if(tab1.length==1){
	
	for(int j=0;j<tab.length;j++)
	  for(int i=0;i<t.length;i++){
		  if((t[i][0].equals(beta))&&(tab[j].equals(t[i][1])))
			  tab[j]=t[i][2];
	  }
	  for(int i=0;i<tab.length;i++){
		  if(rew.equals(""))
			  rew=rew+tab[i];
		  else
			  rew=rew+"x"+tab[i];}
		  for(int i=0;i<t.length;i++){
				if((t[i][1].equals(terme))&&(t[i][0].equals(beta)))
					rew=t[i][2];}
		  
		     
	  
}
	
	
	
return rew;	
}
	
public static ListString onestepseq(String stm){
	ListString s=new ListString();
	  boolean b=false;
	  String arr[]=stm.split("x");
	for(int i=0;i<t.length;i++){
		if(t[i][1].equals(stm)){
			b=true;
			s.push(t[i][0]);}}
	   
	   if(arr.length>1){ 
	for(int j=0;j<arr.length;j++)
		for(int i=0;i<t.length;i++)
		{
	
		if(t[i][1].equals(arr[j]))
			s.push(t[i][0]);
		
		}
	   
	   }
return s;}	

public static String onestep(String t0){
char a=(char)Couple.getCouple(t0).x;
char c=(char)Couple.getCouple(t0).y;
String q=""+c;
String b=""+a;
int j=0;
String onestp="";
for(int i=0;i<=4;i++)
if(t[i][1].equals(b)){
	if(onestp.equals("")){
			onestp=onestp+t[i][0];
	        b=q;}
			else
			onestp=onestp+"x"+t[i][0];
				
			
			
	}
	    	
	
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

					
					  
		
				
		
	
	
		
	
	public static void main(String[] args) {
		/*Tuple t=new Tuple();
		t.a="axv";
		t.b="rxc";
		t.c="rxv";
		file.push(t);
		too.push(t);
		System.out.println(too.pop().a);
		System.out.println(file.pop().a);
		
		
		System.out.println("la reponse est:"+onestep(t0));
		
		System.out.println(rew("bxd","3x4"));*/
		/*ListString m=onestepseq("a");
		int l=m.lenght();
		//System.out.println(l);
		for(int i=0;i<l;i++)
			System.out.println(m.get());*/
		//System.out.println(rewseq("axc", "2"));
		//System.out.println(rewG("axc","1x2" ));
		//System.out.println(existstring("cxa","axc"));
		//System.out.println(existstringEqual("cxa","axc"));
		Listtuple ta=new Listtuple();
		Tuple tj=new Tuple();
		Tuple tj2=new Tuple();
		tj.a="axc";
		tj.c="1x2";
		tj.c="bxd";
		tj2.a="exf";
		tj2.b="3x4";
		tj2.c="axb";
		Tuple ls=new Tuple();
		ls.a="cxa";
		ls.b="2x1";
		ls.c="dxb";
		ta.push(tj);
		ta.push(tj2);
		//System.out.println(existTuple( ls,ta));
		//System.out.println(f.lenght());
		//for(int i=0;i<onestepG("axc").lenght();i++)
	     //System.out.println(onestepG("zxg"));
		
		/*String []v={"axc","axd","e"};
		System.out.println(existRemplace("e",v,"f"));
		System.out.println(v[2]);*/
	}

}
