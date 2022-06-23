import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int i;
        int multiply;
        System.out.printf("multiplication Table of %d is :\n",n);
        
        for(i=1;i<=10;i++)
        {
           multiply=n*i;
           
           System.out.printf("%d*%d=%d\n",n,i,multiply);
        }
    }
}