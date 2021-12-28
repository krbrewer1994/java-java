//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 7A
//what's your grade?

import java.util.Scanner;

public class Assignment7A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("[CSE 131L Grade Calculator]");

        //LABS
        //Lab Array
        int labArraySize = 13;
        float[] labArray = new float[labArraySize];

        System.out.println("Labs");
        //For loop to print grade prompts for each lab
        for (int i = 0; i < labArraySize; i++) {
            System.out.print("Enter Grade #" + (i + 1) + ": ");
            labArray[i] = scan.nextFloat();
        }
        float labAverage = average(labArray, labArraySize);
        float labWeightedPercent = 0.10f;
        float labWeighted = weightedValue(labAverage, labWeightedPercent);

        System.out.println("Weighted Points: " + String.format("%.2f", labWeighted));
        System.out.println();


        //ASSIGNMENTS
        //Assignments Array
        int assignmentArraySize = 8;
        float[] assignmentArray = new float[assignmentArraySize];

        System.out.println("Assignments");
        //For loop to print grade prompts for each assignment
        for (int i = 0; i < assignmentArraySize; i++) {
            System.out.print("Enter Grade #" + (i +1) + ": ");
            assignmentArray[i] = scan.nextFloat();
        }
        float assignmentAverage = average(assignmentArray, assignmentArraySize);
        float assignmentsWeightedPercent = 0.40f;
        float assignmentWeighted = weightedValue(assignmentAverage, assignmentsWeightedPercent);
        System.out.println("Weighted Points: " + String.format("%.2f", assignmentWeighted));
        System.out.println();

        //MIDTERM
        System.out.println("Midterm");
        System.out.print("Enter Grade #1: ");
        float midterm = scan.nextFloat();
        float midtermWeightedPercent = 0.20f;
        float midtermWeighted = weightedValue(midterm, midtermWeightedPercent);
        System.out.println("Weighted Points: " + String.format("%.2f", midtermWeighted));
        System.out.println();


        //EXAM
        System.out.println("Exam");
        System.out.print("Enter Grade #1: ");
        float exam = scan.nextFloat();
        float examWeightedPercent = 0.30f;
        float examWeighted = weightedValue(exam, examWeightedPercent);
        System.out.println("Weighted Points: " + String.format("%.2f", examWeighted));
        System.out.println();

        float finalGrade = labWeighted + assignmentWeighted + midtermWeighted + examWeighted;

        System.out.println("Your final grade for CSE1321L is: " + String.format("%.2f", finalGrade));
    }

    //Method to calculate average value of a category
    public static float average(float[] array, int size){
        float sum = 0;

        //For loop to add all elements in the array
        for(int i = 0; i < size; i++){
            sum = array[i] + sum;
        }

        //Calculation for average
        float average = sum/size;
        return average;
    }

    public static float weightedValue(float average, float percent){
        float weightedValue = average*percent;
        return weightedValue;
    }
}
