import java.util.Scanner;
class StringChallng2
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your String");
        String str= sc.nextLine();
        //Removes all special characters from given string...
        System.out.println(str.replaceAll("[^a-zA-Z0-9]+", ""));
        
    }
}
