import java.io.*;
import java.util.Scanner;
import java.util.Arrays; 
  
public class Create {
    public static void main(String args[])
    {
  
        try {
  
            
       File f= new File("/home/sameer-d10x/Downloads/wordlist.txt");
BufferedReader br= new BufferedReader(new FileReader(f));
String readLine ="";

int str=0;
System.out.println("Read");
while ((readLine = br.readLine())!=null) {
       
 char[] Str = readLine.toCharArray(); 
   Arrays.sort(Str);  
          
               
             System.out.println();
              System.out.println(readLine.toLowerCase());
        }
    

      }  catch (Exception e) {
            System.out.println(e);
        
    }
}

           
}




