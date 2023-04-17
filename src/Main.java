import java.util.HashSet;
class Main{
  public static boolean checkDuplicate(int[] array){
    int length = array.length;
    boolean check=false;
   HashSet<Integer> nums = new HashSet<Integer>();
   for(int i=0;i<length;i++){
    if(nums.contains(array[i])){
      check = true;
    }
    else{
      nums.add(array[i]);
    }
   } 
   return check;   
  }
  public static void main(String[] args){
    int[] array = {1,2,3,4,5,3};
    System.out.println(checkDuplicate(array));
  }
}