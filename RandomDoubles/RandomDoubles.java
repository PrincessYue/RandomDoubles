/*
 * Program description: Creates a file called randomDoubles and writes 10 ints to it. 
 * Pseudocode:
 * Create a new file called randomDoubles
 * If the file doesn't exist create it
 * Use a printwriter to print 10 random doubles
 * Close the file
 * If the file already exists print that the file already exists
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class RandomDoubles {

	//Code the IOException into the main method
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
            //Create the file randomDoubles.txt
		
	        File file = new File("randomDoubles.txt");
	        
	        //Use an if statement to create a file if the file doesn't exist
	        
	        if(!file.exists()){
	           file.createNewFile();
	           
	           //Use PrintWriter to print 10 random doubles to the file
	           
	           PrintWriter out = new PrintWriter(file);
	                for (int i=0; i < 10; i++ )
	        		{double randomDouble = (double)(Math.random() * 11);
	        		out.println(randomDouble);

	            }
	                //Close the file
	                
	                out.close();
	        }
	        
	        //Use an else if statement to print that the file already exists if it does
	        
	        else if (file.exists()) {
	            System.out.println("randomDoubles.txt already exists.");
	        }   
	    }
	
		
		
		
	   
	   		
	    }
	    
	