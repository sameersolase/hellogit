import java.io.*;

import java.util.*;

public class Anagrams {

    public static void main(String[] args) {

   try{
        Scanner s = new Scanner(new File("/home/svt-dt-026/Downloads/wordlist.txt"));

      ArrayList<String> words = new ArrayList<String>();

while (s.hasNext()) {

        words.add(s.next());

 }

   HashMap<String, ArrayList<String>> map = new HashMap<>();

      for (String str : words) {

    char[] ch = str.toCharArray();

      Arrays.sort(ch);

       String key = new String(ch).toLowerCase();
 
  if (map.get(key) != null) {

          map.get(key).add(str.toLowerCase());
          
  }     else{

       ArrayList<String> anagList = new ArrayList<>();

     anagList.add(str);


    map.put(key, anagList);
            }
        }
  Scanner sc = new Scanner(System.in);

  String str = sc.nextLine();

    char[] key = str.toCharArray();

     Arrays.sort(key);

    str = new String(key).toLowerCase();

           
   System.out.println(map.get(str));
  }
         catch (Exception e) {


  System.out.println(e);

    }


        }
        } 
        
    



     

