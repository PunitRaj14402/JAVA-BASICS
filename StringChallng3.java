import java.util.Scanner;

import java.util.Scanner;

class StringChallng3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str =sc.nextLine();

        String str1 =str.replaceAll("[^a-zA-Z]+", "");
        int num= str1.length();
        System.out.println("Number of words in given String is :"+num);

    }
}