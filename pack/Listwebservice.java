
package pack;
import java.util.LinkedList;
import java.util.LinkedList;
public class Listwebservice {
	
	
	public  LinkedList list = new LinkedList();
	public void push(Webservice v) {
	list.addLast(v);
	}
	public Webservice valueAt(int i){
		return (Webservice)list.get(i);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
		}
	
	
	
	public  int lenght(){
	return list.size();	
	}
	 public static void main(String[]args){
		 Webservice ws= new Webservice();
		 Listwebservice l = new Listwebservice();
		 ws.input = "in";
		 ws.output = "out";
		 ws.setOp = "op";
		 ws.typeIn= "string";
		 ws.typeout= "int";
		 ws.wsn="ws1";
		 Webservice ws2 = new Webservice();
		 ws2.input = "in2";
		 ws2.output = "out2";
		 ws2.setOp = "op2";
		 ws2.typeIn= "string2";
		 ws2.typeout= "int2";
		 ws2.wsn="ws2";
		 l.push(ws);
		 l.push(ws2);
		 for(int i=0;i<l.lenght();i++){
			 System.out.println(l.valueAt(i).wsn);
		 }
		 
		 
	 }
	
	
	}
	
