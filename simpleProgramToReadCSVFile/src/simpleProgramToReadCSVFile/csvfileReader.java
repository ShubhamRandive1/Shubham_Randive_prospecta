package simpleProgramToReadCSVFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;


public class csvfileReader {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		// TODO Auto-generated catch block
		
		Scanner sc = new Scanner(new File("A:\\JAVAPROJECTS\\demo.csv"));
		
	    sc.useDelimiter(",");
	    
	    while (sc.hasNext()) {
	    	
	      System.out.print(sc.next());
	      
	    }
	    sc.close();
	  

	}
	
	
	public static void writeData(String filePath)
	{
	  
	  
	    File file = new File("A:\\JAVAPROJECTS\\\\demo.csv");
	  
	    try {
	      
	        FileWriter outputfile = new FileWriter(file);
	  
	       
	        CSVWriter writer = new CSVWriter(outputfile);
	  
	     
	        List<String[]> data = new ArrayList<String[]>();
	        data.add(new String[] { "A", "B", "C" });
	        data.add(new String[] { "A1", "A2", "A3" });
	        data.add(new String[] { "B1", "B2", "B3" });
	        data.add(new String[] { "C1", "C2", "C3" });
	        data.add(new String[] { "1 5 3 =5+A1", "2 7 8 =A2+B2","3 9 =4+5 =C2+B3" });
	        writer.writeAll(data);
	  
	   
	        writer.close();
	    }
	    catch (IOException e) {
	      
	        e.printStackTrace();
	    }
	}

}
