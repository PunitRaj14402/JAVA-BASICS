import java.util.Scanner;

class StringChallng1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Email");
        String str = sc.nextLine();
        int i = str.indexOf("@");
        int l= str.length();
        String str1= str.substring( 0,i);
        String str2= str.substring( i+1,l);

        if(str2=="gmail.com")
        {
            System.out.println("Your email is on Gmail");
        }
        else
        {
            System.out.println("Your email is not on Gmail");
        }

        System.out.println("Your username is :" +str1);
        System.out.println("Your Domain name is :" +str2);

        

    }
}