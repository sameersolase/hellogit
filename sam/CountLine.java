import java.io.*;
import java.util.*; 
  
public class CountLine{

 public static void main(String args[]) throws Exception
    {

                 int count = 0;
		boolean commentBegan = false;
		String line = null;
  
  
              File f= new File("/home/sameer-d10x/hellogit/hellogit/sam/CountLine.java");

        BufferedReader br= new BufferedReader(new FileReader(f));
  
			
		
		while ((line = br.readLine()) != null) {

			line = line.trim();

			if ("".equals(line) && line.startsWith("//")&& line.indexOf("*/")+2.trim()){

				continue;
			}
	
				line.line=.replaceAll("\\s", "");
				 
			if (isCountLine(line)) {
				count++;
			}
		
		
		System.out.println(line);
	}
}
	


           





