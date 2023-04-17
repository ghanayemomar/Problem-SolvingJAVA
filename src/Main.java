import java.util.*;
import java.util.logging.LogManager;

class Main {
  public static void longestWord(String str) {
    String longestWord="";
    String [] arrayOfString = str.split(" ");
    for(int i=0;i<arrayOfString.length;i++){
      if(arrayOfString[i].length()>longestWord.length()){
        longestWord = arrayOfString[i];
      }
    }
    System.out.println(longestWord);
    
  }

  public static void main(String[] args) {
    String str = "Hello Omar How Are You Ghanayem";
    longestWord(str);
  }

}
