import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    String str;
    Scanner s = new Scanner(System.in);
        System.out.println("please enter a string containing ',' : ");
        str = s.next();

        String a = str.replace(",","");
        System.out.println("the new string after removing the comma : " + a);

    }
}