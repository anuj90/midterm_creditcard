import java.util.Scanner;


public class Main {
	public static void main(String args[])
	{
	long[] a1 = new long[14];
	boolean fn;
	
	Scanner in = new Scanner(System.in);
	 System.out.println("Enter the credit card number:" );
      long num = in.nextLong();
      
      int size = CheckDigit.getSize(num);
      if(size < 13 || size > 16)
      {
    	  System.out.println("Invalid card number" );
    	  
      }
    //  fn = CheckDigit.first_num(num, size);
      int t_even = CheckDigit.sum_even(num);
      int t_odd = CheckDigit.sum_odd(num);
      
      int t = t_even + t_odd;
      
      if(t % 10 == 0)
      {
    	  System.out.println("It is Valid. ");
    	  CheckDigit.first_num(num, size);
      }
      else
    	  System.out.println("It is Invalid. ");


	}
}
