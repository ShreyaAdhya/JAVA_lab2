import java.util.*;

class ReverseStr 
{
  public static void rev(String word)
  {
    int l=word.length();
    for(int i=(l-1);i>=0;i--)
       System.out.print(word.charAt(i));  
  }
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);  
    System.out.print("Enter : ");
    String word = scan.nextLine(); 
    rev(word);
  }    
   
}