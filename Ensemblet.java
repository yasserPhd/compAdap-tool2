package pack;



import java.util.LinkedList;
public class Ensemblet {
private  LinkedList list = new LinkedList();

public void push(String v) {
list.addLast(v);
}
public int lenght (){
	return list.size();	
	}
public Object valueAt(int i){
	return list.get(i);
}
public String pop() {
return (String)list.removeLast();}
public boolean isEmpty(){
	return list.isEmpty();
	}
public boolean exist(String v){
	return list.contains(v);
}

public static void main(String[] args) {
Ensemblet stack = new Ensemblet();

for(int i = 0; i < 3; i++){
stack.push("axc"+i);}
//stack.lenght();
//System.out.println(stack.top());
//System.out.println(stack.top());
//System.out.println(stack.pop());
//System.out.println(stack.pop());
System.out.println(stack.valueAt(2));
System.out.println(stack.lenght());
//System.out.println(stack.pop());*/
}}


