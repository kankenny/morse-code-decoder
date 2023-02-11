package binarySearchTrees;

import java.util.Scanner;

public class useMorseCodeTree<T>{
    public static void main(String[] args) {

        MorseCodeTree<String> tree = new MorseCodeTree<>();
        String testCase1 = "•••• • •-•• •-•• ---  •-- --- •-• •-•• -••  -- -•--  -• " +
                           "•- -- •  •• •••  -•- • -• -• • - - •  •--- •- -- • •••  " +
                           "-- •- -•• -•• • •-•• •-";
        // testCase1 is "Hello world my name is Kennette James Maddela"
        // this tests a whole sentence

        String testCase2 = "-•-";
        // testCase2 is "K"
        // this tests a single character

        String testCase3 = "";
        // testCase3 is an empty string
        // this tests an empty string

        String testCase4 = "- •••• •  --•- ••- •• -•-• -•-  -••• •-• --- •-- -•  ••-• --" +
                "- -••-  •--- ••- -- •--• •••  --- •••- • •-•  - •••• •  •-•• •- --•• -•" +
                "--  -•• --- --•";
        // testCase4 is "The quick brown fox jumps over the lazy dog"
        // this tests all characters in the alphabet

        System.out.println(tree.decrypt(testCase1));
        System.out.println(tree.decrypt(testCase2));
        System.out.println(tree.decrypt(testCase3));
        System.out.println(tree.decrypt(testCase4));

        Scanner scnrString = new Scanner(System.in);
        Scanner scnrInt = new Scanner(System.in);
        // Different scanners for two inputs: morse input (String) and menu input (int = 0 to exit)

        int choice = 1;

        do {
            String userInput = null;
            System.out.print("Enter morse code that you want to decrypt: ");
            userInput = scnrString.nextLine();
            System.out.println(tree.decrypt(userInput));
            // bullets = "•" and dashes = "-"

            System.out.print("Enter 0 to stop program, or Any number to continue decrypting: ");
            choice = scnrInt.nextInt();
            System.out.println();

        }while(choice != 0);
        // Decrypt as much as user wants, and exit whenever program asks to enter 0 and user enters 0

        System.out.println("Program Terminated");

    }
}
