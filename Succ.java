package pack;

public class Succ {
	static StackL pile = new StackL();
	static Listtuple file = new Listtuple();
	static Listtuple too=new Listtuple();
	static Ensemblet ensblt=new Ensemblet();
	public static  String t0="axc";//"";
	public static String t="";
	public static String z="";
	public static String [][]jt={{"1","a","b"},//new String[5][3]
		              {"2","c","d"},
		              {"3","b","a"},
		              {"4","d","c"},
		              {"5","bxc","0"}
	};
	
	public static boolean contain(String[]v,String q){
		boolean exist=false;
		for(int i=0;i<v.length;i++){
			if(v[i].equals(q))
				exist=true;}
		return exist;
	}
	/*public static boolean containLS(ListString l,String m){
		boolean existL=false;
		for(int i=0;i<l.lenght();i++){
			if(l.valueAt(i).equals(m))
				existL=true;}
		return existL;
	}*/
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
			 ListString s=succmeth("axc","1x2");
			//System.out.println(p.valueAt(1));
			System.out.println(s.lenght());
			//System.out.println(/*(!(contain(betaarr,p.valueAt(0)))&&(*/(containLS(s,p.valueAt(0))));                  
		/*for(int j=0;j<p.lenght();j++){
			if(!(contain(betaarr,p.valueAt(j)))&&(!(containLS(succmeth(term,alph),p.valueAt(j))))){
				     
				      tp.a=term;
				      tp.b=b;
				      tp.c=t1;
				      too.push(tp);
				      t2=rewseq(t1,p.valueAt(j));
				      ensblt.push(t1);
				      ensblt.push(t2);
				      tp2.a=t1;
				      tp2.b=p.valueAt(j);
				      tp2.c=t2;
				      too.push(tp2);
				      pile.push(t2);
				      //generate_proof_terme(onestep(t2));
		} }*/
				       
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
				  rew=rew+"x"+tab[i];
		  }
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
	public static ListString succmeth(String ter,String alp){
		ListString succ=new ListString();
		for(int i=0;i<file.lenght();i++){
	Tuple l=new Tuple();
	l=file.valueAt(i);
	if((ter.equals(l.a))&&(alp.equals(l.b)))
		z=l.c;
	}
	
	for(int j=0;j<file.lenght();j++)
	{
		Tuple t2=new Tuple();
		t2=file.valueAt(j);
		if(z.equals(t2.a))
			succ.push(t2.b);
			
	}
	return succ;	
}
	public static void main(String[] args) {
		Tuple t=new Tuple();
		Tuple t2=new Tuple();
		Tuple t3=new Tuple();
		t.a="axc";
		t.b="1x2";
		t.c="bxd";
		t2.a="bxd";
		t2.b="3x4";
		t2.c="axc";
		/*t3.a="bxd";
		t3.b="5x2";
		t3.c="dxf";*/
		file.push(t);
		file.push(t2);
		//file.push(t3);
		/*while(!file.isEmpty()){*/
			Tuple tg=new Tuple();
			//tg=file.pop();
			//check_hide(tg.a,tg.b);
			
		//}
		ListString k=succmeth("axc","1x2");
		
		System.out.println(k.lenght());
		
		System.out.println(k.valueAt(0));
		/*String g[]={"1","2"};
		String o="2";
		System.out.println(contain(g,o));*/
		//System.out.println(too.lenght());
		//System.out.println(too.valueAt(0).b);
		/*ListString h=new ListString();
		String s="axc";
		String s2="bxd";
		String s3="exf";
		h.push(s);
		h.push(s2);
		h.push(s3);
		System.out.println(containLS( h, "e"));*/
		
		//System.out.println(too.lenght());
		
		//ListString m=succmeth("axc","1x2");
		//System.out.println(m.lenght());
		//System.out.println(Couple.toElement(m.valueAt(0))[0]);
		//System.out.println(m.valueAt(1));
		
		// TODO Auto-generated method stub

	}

}
