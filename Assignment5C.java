//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 5C
//Level Map Creator

import java.util.Scanner;

public class Assignment5C {
    //This program creates a simple Level Map Creator tool
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting the user to enter a widtha and height for 2D array, reading input, initialing input variables
        System.out.print("[FYE Level Map Creator]\nEnter a level map width: ");
        int width = keyboardInput.nextInt();
        System.out.print("Enter a level map height: ");
        int height = keyboardInput.nextInt();

        //Initializing map 2D array  with user input for width and height, then printing the array
        String[][] map = new String[height][width];

        //Loop filling the 2D array with asterisks
        for(int rows = 0; rows < height ; rows++){
            for(int columns = 0; columns < width ; columns++){
                map[rows][columns] = ("*");
            }
        }

        printArray(map, height, width);

        int menu_choice = 0;

        //Do while loop printing menu until user inputs 4 to Quit
        do {
            //Prints user menu, prompts user for selection, reads selection, stores selection in variable
            System.out.print("Options\n1. Clear Level\n2. Add Platform\n3. Add Items\n4. Quit\nEnter a choice: ");
            menu_choice = keyboardInput.nextInt();
            System.out.println();

            int x;
            int y;

            //Switch statement that carries out menu selection
            switch(menu_choice){
                case 1: System.out.println("[Clear Level]");
                    for(int rows = 0; rows < height ; rows++){
                        for(int columns = 0; columns < width ; columns++){
                            map[rows][columns] = ("*");
                        }
                    }

                    printArray(map, height, width);
                    System.out.println();
                    break;
                case 2: System.out.print("[Add Platform]\nEnter X Coordinate: ");
                    x = keyboardInput.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    y = keyboardInput.nextInt();
                    System.out.print("Enter Length: ");
                    int length = keyboardInput.nextInt();

                    if(length > width || length > (width - x)){
                        System.out.println("This platform won’t fit in the level!");
                    }
                    else{
                        for(int columns = x; columns < x + length; columns++){
                            map[y][columns] = ("=");
                        }
                    }
                    printArray(map, height, width);
                    break;
                case 3: System.out.print("[Add Item]\nEnter X Coordinate: ");
                    x = keyboardInput.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    y = keyboardInput.nextInt();

                    if(x > width && y > height || x > width || y > height){
                        System.out.println("This is not a valid location!");
                        printArray(map, height, width);}
                    else{
                        map[y][x] = ("0");
                        printArray(map, height, width);
                    }
                    break;
                case 4: printArray(map, height, width);
                    System.out.println("Goodbye!");
                    break;
            }
        } while (menu_choice != 4);
    }

    //Method to print the 2D array
    public static void printArray(String[][] map, int height, int width){
        for(int row = 0; row < height; row++){
            for(int column = 0; column < width; column++){
                System.out.print(map[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
