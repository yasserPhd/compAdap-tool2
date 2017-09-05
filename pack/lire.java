package pack;

import java.io.BufferedReader;
import java.io.FileReader;
public class lire{
public static void main(String[] arg){


BufferedReader IN=null;
try{
IN=new BufferedReader(new FileReader("fichiertexte.txt"));
} catch (Exception e){
	 e.printStackTrace();
}
try{
while((IN.readLine())!=null){

System.out.println(""+ IN.readLine());
}
} catch (Exception e){
	 e.printStackTrace();
}

try{
IN.close();
} catch (Exception e){
	 e.printStackTrace();
} 
}
}