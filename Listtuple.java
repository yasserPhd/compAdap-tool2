package pack;
import java.util.LinkedList;
import java.util.LinkedList;
public class Listtuple {
	
	
	public  LinkedList list = new LinkedList();
	public void push(Tuple v) {
	list.addLast(v);
	}
	public Tuple valueAt(int i){
		return (Tuple)list.get(i);
	}
	public Tuple pop() {
	return (Tuple)list.removeFirst();}
	public boolean isEmpty(){
		return list.isEmpty();
		}
	public static boolean exist(Tuple t,Listtuple l){
		boolean a=false;
		int i=0;
		while((a==false)&&(i<l.lenght())){
		if(l.valueAt(i).a.equals(t.a)){
			if(l.valueAt(i).b.equals(t.b)){
				if(l.valueAt(i).c.equals(t.c)){
					a=true;}
			}}
		i++;
		}
		
	return a; }
	
	public  int lenght(){
	return list.size();	
	}
	
	public static void main(String[] args) {
		/*Listtuple list=new Listtuple();
		Tuple t=new Tuple();*/ 
		Listtuple fd=new Listtuple();
		Listtuple fc=new Listtuple(); 
		Tuple t1=new Tuple();
		Tuple t2=new Tuple();
		t1.a="a";
		t1.b="b";
		t1.c="c";
		t2.a="d";
		t2.b="e";
		t2.c="f";
		fd.push(t1);
		fd.push(t2);
		//fc.push(t1);
		//fc.push(t2);
		//Tuple m=fd.valueAt(0);
		Tuple m=new Tuple();
		m.a="a";
		m.b="b";
		m.c="c";
		//Tuple h=new Tuple();
		//h=t1;
		//fd.push(t1);
		//fd.push(t1);
		//System.out.println(t1.a);
		System.out.println(exist(m,fd));
		//System.out.println(fd.lenght());
		//System.out.println(fd.pop().c);
		//System.out.println(fd.lenght());
		//System.out.println(fc.lenght());
		/*for(int i=0;i<fd.lenght();i++){
		      Tuple f;
		      f=fd.pop();
		      System.out.println(f.a);
		      System.out.println(f.b);
		      System.out.println(f.c);
		}*/
	    
	}}

