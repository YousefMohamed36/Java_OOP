import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int num ;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the nunber of elements of array : ");
        num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("please enter the elements of array : ");
        for(int i =0 ; i < num ; i++)
           {
            a[i] = sc.nextInt();
           }
        max = a[0];
        for(int i =0 ; i < num ; i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("the maximum value of array = " + max);
    }

}