import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordChain {

  private final static Character[] letters = { 'a', 'b', 'c', 'd', 'e', 'f',
   'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
   't', 'u', 'v', 'w', 'x', 'y', 'z' };

  public static final ArrayList<Character> alLetters = new ArrayList<Character>(
   Arrays.asList(WordChain.letters));

  public static void main(final String sArgs[]) {

   final WordChain wc = new WordChain();
  final String file = "/home/sameer-d10x/Downloads/wordlist.txt";
  final String start = "cat";
  final String end = "dog";

   if (start.length() != end.length()) {
   System.out.println("length of both the words should be same");
  }

   wc.loadDictionary(file, start.length());
  wc.compute(start, end, 0);
 }

  private final ArrayList<String> wordChain = new ArrayList<String>();
 private final Set<String> dictionary = new HashSet<String>();

 
  private void compute(final String word, final String end, int level) {

 
  List<String> alnew = this.getNext(word, end);
  while (true) {
   if (this.wordChain.size() > 0) {
    break;
   }

 
   final List<String> al = new ArrayList<String>(alnew);
   alnew = new ArrayList<String>();

    for (final String newword : al) {
    
    alnew.addAll(this.getNext(newword, end));
   }

  
   if (level == 26) {
    break;
   }
  }

   System.out.println("Word Chain :");

   for (final String wc : this.wordChain) {
   System.out.println(wc);
  }

  }
  private String getlastword(final String wholeword) {
  final String[] tokens = wholeword.split("_");
  return tokens[tokens.length - 1];

  }
  private List<String> getNext(final String wholeword, final String end) {

   final String word = this.getlastword(wholeword);
  final ArrayList<String> al = new ArrayList<String>();

   for (int i = 0; i < word.length(); i++) {
   for (int j = 0; j < WordChain.alLetters.size(); j++) {
    final char[] newString = word.toCharArray();
    newString[i] = WordChain.alLetters.get(j);
    final String newword = String.valueOf(newString);
    if (newword.equals(end)) {
     this.wordChain.add(wholeword + "_" + newword);
    } else if (!newword.equals(word)
      && !wholeword.startsWith(newword + "_")
      && !wholeword.contains("_" + newword + "_")
      && this.dictionary.contains(newword)) {
     al.add(wholeword + "_" + newword);
    }
   }
  }
  return al;

  }

  private void loadDictionary(final String file, final int length) {

   BufferedReader br = null;
  try {
   br = new BufferedReader(new FileReader(new File(file)));
   String currentline;
   while ((currentline = br.readLine()) != null) {
    if (currentline.length() == length) {
     this.dictionary.add(currentline.toLowerCase());
    }
   }
  } catch (final FileNotFoundException e) {
   e.printStackTrace();
  } catch (final IOException e) {
   e.printStackTrace();
  } finally {
   if (br != null) {
    try {
     br.close();
    } catch (final IOException e) {
     e.printStackTrace();
    }
   }
  }
 }
}

