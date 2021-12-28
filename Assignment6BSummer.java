//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6B
//The Count from Sesame Street would be proud of you.

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment6BSummer {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        int num;

        Scanner keyboardInput = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number or -1 to finish: ");
            num = keyboardInput.nextInt();
            if(num == -1) break;
            array1.add(num);
        }

        System.out.print("|");
        for(Integer ele : array1){
            System.out.print(ele+"|");
        }
        System.out.println();

        mostFrequentNum(array1);
    }

    public static void mostFrequentNum(ArrayList<Integer> array1){

        int[] array2 = new int[100];
        int max = 0;

        for(Integer element : array1){
            array2[element]++;
            if(array2[element] > max)
                max = array2[element];
        }

        System.out.print("There are "+max+" occurrences of ");
        boolean first = true;
        for(int i = 0; i < 100; i++){
            if(array2[i] == max){
                if(first){
                    System.out.print(i);
                    first = false;
                }
                else{
                    System.out.print(", "+i);
                }
            }
        }
        System.out.println();
    }

}