//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6C
//Equivalent array??

import java.util.Arrays;
import java.util.Scanner;


public class Assignment6CSummer {
            public static void main(String args[])
            {
                Scanner keyboardInput=new Scanner(System.in);

                int[][] matrix1 = new int[3][3];
                int[][] matrix2 = new int[3][3];
                int[] array1 = new int[9];
                int[] array2 = new int[9];
                int k = 0;
                int c = 0;

                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0;j < 3; j++)
                    {
                        System.out.print("Array 1 slot ("+i+","+j+"):");
                        matrix1[i][j]= keyboardInput.nextInt();
                    }
                }

                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        System.out.print(matrix1[i][j]+" ");
                        array1[k]=matrix1[i][j];
                        k++;
                    }
                    System.out.println();
                }

                for(int i = 0;i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        System.out.print("Array 2 slot ("+i+","+j+"):");
                        matrix2[i][j]=keyboardInput.nextInt();
                    }
                }

                k = 0;

                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3;j++)
                    {
                        System.out.print(matrix2[i][j]+" ");
                        array2[k]=matrix2[i][j];
                        k++;
                    }
                    System.out.println();
                }

                Arrays.sort(array1);
                Arrays.sort(array2);

                for(int i = 0;i < 9; i++)
                {
                    System.out.print(array1[i]+"|");
                    if(array1[i] == array2[i])
                    {
                        c++;
                    }
                }

                System.out.println();

                for(int i = 0; i < 9; i++)
                {
                    System.out.print(array2[i]+"|");
                }

                System.out.println();

                if(c == 9)
                    System.out.println("Arrays are equivalent");
                else
                    System.out.println("Arrays are not equivalent");
            }
        }


