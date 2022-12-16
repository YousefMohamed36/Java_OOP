import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int rows ;
        int columns;
     Scanner s = new Scanner(System.in);
        System.out.println("please enter the number of rows of array : ");
        rows = s.nextInt();
        System.out.println("please enter the number of columns of array :");
        columns = s.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("enter the matrix please : ");
        for(int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < columns ; j++){
                arr[i][j] = s.nextInt();

            }
        }
        System.out.println("the matrix is ");
        for(int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < columns ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("the transpose of matrix is ");
        for(int i = 0 ; i < columns ; i++){
            for (int j = 0 ; j < rows ; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}