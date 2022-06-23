import java.util.Scanner;

import java.util.Scanner;

public class ReverseANumber {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number");
     long num=sc.nextInt();
     long rem, rev=0;
     while (num!=0) {
       rem=num%10;
       rev=rev*10+rem;
       num=num/10;  
     }
   System.out.println("Reversed number is "+rev);
    }
}
