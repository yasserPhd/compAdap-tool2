package pack;

import java.util.LinkedList;

import javax.swing.JOptionPane;



public class Secondmain {
	//String []tr={"axc"};
	static StackL pile = new StackL();
	static Listtuple file = new Listtuple();
	static Listtuple utilfile = new Listtuple();
	static Listtuple too=new Listtuple();
	static Ensemblet ensblt=new Ensemblet();
	public static  String t0="";//"";
	public static String t="";
	public static String z="";
	static Resulttable res;
	public static String [][]jt=new String[Table.l][3];
	public static void setArray(String[][]m,String t){
		t0=t;
		for(int i=0;i<m.length;i++)
			for(int j=0;j<3;j++)
				jt[i][j]=m[i][j];
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
		   for(int j=0;j<jt.length;j++){
			   if(f[i].equals(jt[j][0])){
				 if(existstring(jt[j][1],ter)){
					 ls.push(jt[j][2]);
					 //l=l+1;
					 /*f[i]="vide";*/} 
				}
		      }
		  
		
		
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
			for(int i=0;i<jt.length;i++){
				if(existstring(jt[i][1],terme))
				   d.push(jt[i][0]);
						}
			 for(int f=0;f<d.lenght();f++){
				 if(onstp.equals(""))
					 onstp=onstp+d.valueAt(f);
				 else
				 onstp=onstp+"x"+d.valueAt(f);}
						
				return onstp;
			}
	
	public static boolean contain(String[]v,String q){
		boolean exist=false;
		for(int i=0;i<v.length;i++){
			if(v[i].equals(q))
				exist=true;}
		return exist;
	}
	public static boolean containLS(ListString l,String m){
		boolean existL=false;
		
		for(int i=0;i<l.lenght();i++){
			String[] retur=new String[l.valueAt(i).length()];
			retur=l.valueAt(i).split("x");
			for(int j=0;j<retur.length;j++){
				if(m.equals(retur[j]))
					existL=true;
			}
		}	
				
		return existL;
	}
	public static ListString succmeth(String ter,String alp){
		ListString succ=new ListString();
		for(int i=0;i<utilfile.lenght();i++){
	Tuple l=new Tuple();
	l=utilfile.valueAt(i);
	if((ter.equals(l.a))&&(alp.equals(l.b)))
		z=l.c;
	}
	
	for(int j=0;j<utilfile.lenght();j++)
	{
		Tuple t2=new Tuple();
		t2=utilfile.valueAt(j);
		if(z.equals(t2.a))
			succ.push(t2.b);
			
	}
	return succ;	
}
	public static void check_hide(String term,String alph){
		String[] betaarr=alph.split("x");
		ListString p=new ListString();
		String t1,t2,b;
		  Tuple tp=new Tuple();
		  Tuple tp2=new Tuple();
	for(int i=0;i<betaarr.length;i++){                                                                        
			 b=betaarr[i];
			 t1=rewseq(term,b);
			 p=onestepseq(t1);
			
			                  
		for(int j=0;j<p.lenght();j++){
			if(!(contain(betaarr,p.valueAt(j)))&&(!(containLS(succmeth(term,alph),p.valueAt(j))))){
				
				      tp.a=term;
				      tp.b=b;
				      tp.c=t1;
				      too.push(tp);
				      t2=rewseq(t1,p.valueAt(j));
				      tp2.a=t1;
				      tp2.b=p.valueAt(j);
				      tp2.c=t2;
				      
				    
				      if(!Listtuple.exist(tp2, too)){
				    	  if(!ensblt.exist(t1))
				            ensblt.push(t1);
				    	  if(!ensblt.exist(t2))
				    		  ensblt.push(t2);
				      too.push(tp2);
				      pile.push(t2);
				    
				    	}
				      generate_proof_terme(t2,onestepG(t2));
		} }
				       
			}	
		}
			
	
	public static String rewseq(String terme,String beta){
		String rew="";
	String[] tab1=beta.split("x");
	String[] tab=terme.split("x");
	if(tab1.length==1){
		
		for(int j=0;j<tab.length;j++)
		  for(int i=0;i<jt.length;i++){
			  if((jt[i][0].equals(beta))&&(tab[j].equals(jt[i][1])))
				  tab[j]=jt[i][2];
		  }
		  for(int i=0;i<tab.length;i++){
			  if(rew.equals(""))
				  rew=rew+tab[i];
			  else
				  rew=rew+"x"+tab[i];}
			  for(int i=0;i<jt.length;i++){
					if((jt[i][1].equals(terme))&&(jt[i][0].equals(beta)))
						rew=jt[i][2];}
			  
			     
		  
	}
		
		
		
	return rew;	
	}
	public static ListString onestepseq(String stm){
		ListString s=new ListString();
		  boolean b=false;
		  String arr[]=stm.split("x");
		for(int i=0;i<jt.length;i++){
			if(jt[i][1].equals(stm)){
				b=true;
				s.push(jt[i][0]);}}
		   
		   if(arr.length>1){ 
		for(int j=0;j<arr.length;j++)
			for(int i=0;i<jt.length;i++)
			{
		
			if(jt[i][1].equals(arr[j]))
				s.push(jt[i][0]);
			
			}
		   
		   }
	return s;}	
	public static String onestep(String stm){
		 /*char a=(char)Couple.getCouple(t0).x;
		 char c=(char)Couple.getCouple(t0).y;
		 String q=""+c;
		 String b=""+a;*/
		String onestp="";
		 String tab1[]=stm.split("x");
		 int j=0;
		
		 if(tab1.length==2)
		 for(int i=0;i<jt.length;i++){
			if(jt[i][1].equals(tab1[0])){
				if(onestp.equals("")){
						onestp=onestp+jt[i][0];
				        tab1[0]=tab1[1];}
						else
						onestp=onestp+"x"+jt[i][0];
							
						
						
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
						for(int i=0;i<jt.length;i++){
					
					if(tab1[j].equals(jt[i][0])&&(tab[j].equals(jt[i][1]))){
						if(rew.equals("")){
							rew=rew+jt[i][2];
							a=true;}
						else{
						rew=rew+"x"+jt[i][2];
						a=true;}}
					else{
					if((a==false)&&(i==jt.length-1)&&(j==tab.length-1)/*&&(j==tab1.length-1)*/){	
					  rew=str;}}}
					return rew;
						 
				
					
				}
					
	private static void generate_proof_terme(String te,String onsp){
		
		if(onestepG(te).equals("")){
			JOptionPane d = new JOptionPane();
			JOptionPane.showMessageDialog(d, 
			         "dead lock ",
			         " dead lock ",
			         JOptionPane.WARNING_MESSAGE);}
		else{
		String t1=rewG(te,onsp);
		Tuple t2=new Tuple();;
		t2.a=te;
		t2.b=onsp;
		t2.c=t1;
		if(!Listtuple.exist(t2, too))
		too.push(t2);
	
		if(!ensblt.exist(t1)){
		  ensblt.push(t1);
		  pile.push(t1);}
		  if(Couple.lenght(onsp)==2){
			file.push(t2);
			utilfile.push(t2);
			}}}
		
		
		
		
	
		
				
		
	
	
		
	
	public static void main(String[] args) {
		
		pile.push(t0);
		ensblt.push(t0);
		while(!pile.isEmpty())/*&&(pile.lenght()==1))*/{
			 t=(String)(pile.pop());
		
			//System.out.println(t+","+onestep(t)+","+rew(t,onestep(t)));
			//System.out.println(rew(t,onestep(t)));
			if(onestepG(t).equals("")){
				JOptionPane d = new JOptionPane();
				JOptionPane.showMessageDialog(d, 
				         "dead lock ",
				         " dead lock ",
				         JOptionPane.WARNING_MESSAGE);}
			
			else
				generate_proof_terme(t,onestepG(t));
				
			
		
		}
		while(!file.isEmpty()){
			
		//utilfile=file;
			Tuple tg=new Tuple();
			tg=file.pop();
			check_hide(tg.a,tg.b);
		}
		/*Tuple fd=new Tuple();
		fd=file.pop();
		System.out.println(fd.a);
		System.out.println(too.lenght());*/
		//System.out.println(file.lenght());
		//System.out.println(too.lenght());
		//System.out.println(ensblt.lenght());
		//System.out.println(ensblt.valueAt(2));
		//System.out.println(too.valueAt(3).a);
		//System.out.println(file.valueAt(0).a);
			//System.out.println(file.isEmpty());
		
			//System.out.println(ensblt.lenght());
			//ListString k=succmeth("axc","1x2");
			//System.out.println(k.lenght());
			//System.out.println(k.valueAt(0));
			
			//System.out.println(ensblt.valueAt(1));
			//Tuple tab2[]=new Tuple[] ;
		    res=new Resulttable();
			for(int i=0;i<too.lenght();i++){
				res.remplirt(too.valueAt(i).a, i, 0);
				res.remplirt(too.valueAt(i).b, i, 1);
				res.remplirt(too.valueAt(i).c, i, 2);
			}
			res.jTextField.setText(ensblt.lenght()+"");
			res.jTextField1.setText(too.lenght()+"");
			//System.out.println(rewseq("bxc", "5"));
			//System.out.println(file.pop().a);
			//System.out.println(file.pop().c);
			 /*  for(int i=1;i<=too.lenght();i++){
			      Tuple f=new Tuple();
			      f=too.pop();
			      System.out.println(f.a);
			      System.out.println(f.b);
			      System.out.println(f.c);
			}*/
			
			
			
		
		
		
	 
		// TODO Auto-generated method stub
		
	

}}


