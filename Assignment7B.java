//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 7A
//Caesar Cipher

import java.util.Scanner;

public class Assignment7B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String againChoice = "Y";

        do{
            System.out.println("Enter your message:");
            String message = scan.nextLine();
            
            System.out.print("Enter the offset value: ");
            int offset = scan.nextInt();
            scan.nextLine();
            System.out.println();

            if (validation(message, offset)) {
                String encryptedMessage = encrypts(message, offset);
                System.out.println("Your secret message is...\n" + encryptedMessage);
            } else {
                System.out.println("Sorry, we can only process messages with letters and spaces, " +
                        "and the offset must be between 0 and 26.\n");
            }

            System.out.print("Do you want to encrypt another message? ");
            againChoice = scan.next();

        } while (againChoice.equalsIgnoreCase("y"));
        System.out.println("Closing out...");
    }


    public static boolean validation(String message, int offset){
        if (offset < 0 || offset > 26) {
            return false;
        }

        for(char letter : message.toCharArray()){
            if (letter < 65 || (letter > 90 && letter < 97) || letter > 122 && letter != ' ')
                return false;

        }
        return true;
    }

    public static String encrypts(String message, int offset){
        String encrypted = "";

        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) == ' '){
                encrypted+="";
                continue;
            }
            int value = (int) message.charAt(i);
            if (value + offset <= 90){
                encrypted+= (char)(value + offset);
            }else {
                value = 65 + (offset - (91 - value));
                encrypted += (char) value;
            }
        }
        return encrypted;
    }
}
