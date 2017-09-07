package pack;

import java.util.LinkedList;

public class Listint {

	private LinkedList list = new LinkedList();
	public void push(int v) {
	list.addFirst(v);
	}
	public Integer pop() {
	return (Integer)list.removeLast();}
	public boolean isEmpty(){
		return list.isEmpty();
		}
	public boolean exist(int v){
		return list.contains(v);
	}
	public static void main(String[] args) {
		Listint in = new Listint();
		int j=2;
		for(int i = 0; i < 3; i++){
		in.push(j+i);}
		//System.out.println(stack.top());
		//System.out.println(stack.top());
		System.out.println(in.pop());
		System.out.println(in.pop());
		//System.out.println(in.pop());
		System.out.println(in.exist(4));
		

	}

}
