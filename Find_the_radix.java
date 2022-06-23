import java.util.Scanner;

import java.util.Scanner;

public class Find_the_radix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        String num= sc.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Number is Binary : Radix is 2");
        }
        
        else if(num.matches("[0-7]+"))
           {
                System.out.println("Number is octal : Radix is 8");
            }

            else if(num.matches("[0-9]+"))
           {
                System.out.println("Number is Binary : Radix is 10");
            }

            else if(num.matches("[0-9A-F]+"))
           {
                System.out.println("Number is Hexadecimal : Radix is 16");
            }

           else
           {
               System.out.println("Invalid number");
           }



    }
}
