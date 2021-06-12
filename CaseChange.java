import java.util.*;

class CaseChange 
{
  public static void change(String word,int o)
  {
    if(o==1)  
    System.out.print("In Upper Case : "+ word.toUpperCase());
    else
    System.out.print("In Lower Case : "+ word.toLowerCase());
  }
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);  
    System.out.print("Enter String: ");
    String word = scan.nextLine(); 
    System.out.print("Select '1' for UpperCase and '2' for LowerCase : ");
    int o = scan.nextInt(); 
    change(word,o);
  }    
   
}