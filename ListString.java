package pack;


	import java.util.LinkedList;
import java.util.LinkedList;

public class ListString {

		private LinkedList list = new LinkedList();
		
		public void push(String v) {
		list.addLast(v);
		}
		public String get() {
		return (String)list.removeFirst();}
		public String valueAt(int i){
			return (String)list.get(i);
		}
		public String first() {
			return (String)list.removeFirst();}
		public int lenght (){
		return list.size();	
		}
		public boolean isEmpty(){
			return list.isEmpty();
			}
		public boolean exist(String v){
			return list.contains(v);
		}
		
		public static void main(String[] args) {
			ListString p=new ListString();
			p.push("2");
			p.push("3");
			//System.out.println(p.get());
			//p.first();
			//System.out.println(p.lenght());
			System.out.println(p.valueAt(0));
			System.out.println(p.get());
		}
		
}
