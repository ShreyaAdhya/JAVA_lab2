import java.util.*;

class PrintName
{
  public static void Print(String name,int n)
  {
      for(int i=0;i<n;i++)
        System.out.println(name); 
  }
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);  
    System.out.print("What is your name : ");
    String name = scan.nextLine(); 
    System.out.print("How many times do you want to print the name : ");
    int n = scan.nextInt();
    Print(name,n);
  }    
   
}