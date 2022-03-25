import java.io.*;
import java.util.HashMap;
import java.util.*; 
  
public class Create {
 public static void main(String args[])
    {

  try {
  
              File f= new File("/home/sameer-d10x/Downloads/wordlist.txt");
  
  BufferedReader br= new BufferedReader(new FileReader(f));
  
 ArrayList<String> st = new ArrayList<>();
     
 String line ="";
int b=0;
int i =0;
    System.out.println("Read");
 
  while ((line = br.readLine())!=null) {       
          b++;
char str[] = line.toCharArray();
 
  Arrays.sort(str);
  
  st.add(line);


 HashMap<String, String> h = new HashMap<>();
          
       for(int j = 1;j<=b;j++ ){

        h.put(line,str.toString());
}


    System.out.println(h);  


        
     }        
   }     
     catch (Exception e) {
          
         System.out.println(e);
        
    }
}

           
}




