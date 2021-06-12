import java.util.Scanner;  

class DNAseq
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);  
    System.out.print("Enter DNA sequence : ");
    String seq = scan.nextLine();  
	
    String dna = seq.toUpperCase();
    int l= dna.length();
	
    System.out.println("DNA sequence is: " + dna);  
    System.out.println("DNA sequence length is: " +l);
	
	//to check if the sequence is a DNA sequence or not
	for(int i=0;i<l;i++)
    {
       if (dna.charAt(i)!='A'&& dna.charAt(i)!='T' && dna.charAt(i)!='G' && dna.charAt(i)!='C')
       {
          System.out.println("The character at position "+i+" is not a DNA base!");
       }    
    }
  }
}
