import java.util.Arrays;

class Main{
  public static void reverseString(String str){
    String [] myString = str.split("");
    String temp = "";
    int last=myString.length-1;
    for(int i=0;i<myString.length/2;i++){
      temp = myString[i];
      myString[i]=myString[last-i];
      myString[last-i]= temp;
    }
    System.out.println(Arrays.toString(myString));
  }
  public static void main(String[] args){
    String myString = "Hello World";
    reverseString(myString);
  }
}