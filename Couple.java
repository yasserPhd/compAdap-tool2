package pack;

import java.awt.Point;

public class Couple {
	public static String[] toElement(String w){
		char tas[]=w.toCharArray();
		String[] result=new String[tas.length];
		for(int i=0;i<tas.length;i++)
			result[i]=tas[i]+"";
		    
		return result;
	}
	
public static Point  getCouple(String str){
		Point pn=new Point(1,1);
		char[]t=str.toCharArray();
		if(t.length==3){
			if( t[1]=='x'){
		    pn.x=t[0];
		    pn.y=t[2];
		    
				
			    }}
			
			return pn ;}
public static int lenght(String str){
	String[]t=str.split("x");
	return t.length;
}
        public static String setString(char x,char y){
        String  terme=x+"x"+y;
        return terme;}
	public static void main(String[]args){
		
		
		;
		System.out.println((char)getCouple("axd").x);
		System.out.println((char)getCouple("axd").y);
		System.out.println(setString('c','e'));
		System.out.println(lenght("axc"));
		System.out.println(toElement("axc")[0]);
	}
				
}
