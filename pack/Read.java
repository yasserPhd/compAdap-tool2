package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read { 
	public static void main(String[] args){ 
	
	try
	{
	    File f = new File ("me.txt");
	    FileReader fr = new FileReader (f);
	    BufferedReader br = new BufferedReader (fr);
	 
	    try
	    {
	        String line = br.readLine();
	 
	        while (line != null)
	        {
	            System.out.println (line);
	            line = br.readLine();
	        }
	 
	        br.close();
	        fr.close();
	    }
	    catch (IOException exception)
	    {
	        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
	    }
	}
	catch (FileNotFoundException exception)
	{
	    System.out.println ("Le fichier n'a pas été trouvé");
	}

}}
