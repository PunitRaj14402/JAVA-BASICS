import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int rem,sum=0,count=0;
       while (num!=0)
       {    
        rem=num%10;
        sum=sum+rem;
        num=num/10;
        count=count+1;
       }
        System.out.println("Sum of Digits is " +sum);
        System.out.println("Number of Digits "+count);

    }
}
