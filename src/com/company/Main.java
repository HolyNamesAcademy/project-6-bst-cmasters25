package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BST tree = new BST();
        Start(tree);
    }

    /**
     * Wait for and execute commands from the user
     */
    public static void Start(BST tree) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

                System.out.println("Commands:");
                System.out.println("\t'add'");
                System.out.println("\t'remove'");
                System.out.println("\t'check for'");
                System.out.println("\t'preorder'");
                System.out.println("\t'inorder'");
                System.out.println("\t'postorder'");
                System.out.println("\t'quit'");

                System.out.println("Enter a command:");
                String command = scanner.next();

                switch (command) {
                    case "add": {
                        System.out.println("Enter the number to enter:");
                        int num = scanner.nextInt();
                        boolean val = tree.add(num);
                        if (val)
                            System.out.println("Item successfully added.");
                        else
                            System.out.println("Item is already in tree.");

                        break;
                    }
                    case "remove": {
                        System.out.println("Enter the number to remove:");
                        int num = scanner.nextInt();
                        boolean val = tree.remove(num);
                        if (val)
                            System.out.println("Item successfully removed.");
                        else
                            System.out.println("No such item to remove.");
                        break;
                    }
                    case "check for": {
                        int num = scanner.nextInt();
                        boolean val = tree.contains(num);
                        if (val)
                            System.out.println("Item is in BST.");
                        else
                            System.out.println("Item is not in BST.");
                        break;
                    }
                    case "preorder": {
                        tree.displayPreOrder();
                        break;
                    }
                    case "inorder": {
                        tree.displayInOrder();
                        break;
                    }
                    case "postorder": {
                        tree.displayPostOrder();
                        break;
                    }


                    case "quit": {
                        return;
                    }
                    default: {
                        System.out.println("Command not found.");
                        break;
                    }
                }



        }
    }
}
