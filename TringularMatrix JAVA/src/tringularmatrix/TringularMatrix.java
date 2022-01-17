package tringularmatrix;
import java.util.Scanner;
public class TringularMatrix 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scan.nextInt();
        System.out.println("---------------------------------------");
        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        System.out.println("Enter First array : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter value for coloum "+(j+1)+" of row "+(i+1)+" : ");
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Enter Second Array : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter value for coloum "+(j+1)+" of row "+(i+1)+" : ");
                b[i][j]=scan.nextInt();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Array after Multiplication");
        int c[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                c[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.printf( "%5d", c[i][j]);
            }
            System.out.println();
        }

        int rows = c.length;
        int cols = c[0].length;

        if (rows != cols) 
        {
            System.out.println("---------------------------------------");
            System.out.println("Matrix should be a square matrix");
        } 
        else
        {
            System.out.println("----------------------------------------");
            System.out.println("Upper triangular matrix: ");
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if (i > j)
                    {
                        System.out.printf( "%5s", "0");
                    } 
                    else
                    {
                         System.out.printf( "%5d", c[i][j]);
                    }
                }
                System.out.println();
            }
        }
        if (rows != cols)
        {
            System.out.println("Matrix should be a square matrix");
        } 
        else
        {
            System.out.println("---------------------------------------");
            System.out.println("Lower triangular matrix: ");
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if (j > i)
                    {
                        System.out.printf( "%5s", "0");
                    } 
                    else
                    {
                        System.out.printf( "%5d", c[i][j]);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("---------------------------------------");
    }  
}
