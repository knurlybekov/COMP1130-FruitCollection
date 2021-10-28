package com.company;
import java.util.Scanner;

public class GroupE_FruitSalad {
    enum Topping { //  Om
        WHIPPED_CREAM, CHOCOLATE, LEMON_JUICE
    } // Deva
    public static void main(String[] args) {
        String userInput = "";
        boolean run;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want a salad?  Y or N");
        userInput = scan.next();
        while (!userInput.matches("[YyNn]")){  // Karen and Nikolay
            System.out.println("Incorrect input");
            run = true;
            userInput = scan.next();
        }
        if(userInput.matches("[Nn]")){          // User does not want more actions
            System.out.println("You placed "+ total+" orders. Thakn you!" );
            System.out.println("Do you wish to exit the program? [Y/Any other key]");
            String choice = scan.next();
            if (choice.toLowerCase().equals("y")) {  // Stop the program
                run = false;
                System.exit(0);
            }
        }
        while (run = true) { // Karen and Nikolay
            Peach peach = new Peach();
            Sapodilla sapodilla = new Sapodilla();
            Tangerine tangerine = new Tangerine();
            BlueBerry blueberry = new BlueBerry();
            System.out.println("Welcome to Team E Fruit Salad Maker. \n Please enter how many grams of Peach do you want in your salad?");
            peach.setPeachWeight(scan.nextDouble());
            System.out.println("Alright, and how much grams of Sapodilla do you want in your salad?");
            sapodilla.setWeight(scan.nextDouble());
            System.out.println("We got you pal, and how much grams of Tangerine do you want in your salad?");
            tangerine.setTangerineWeight(scan.nextDouble());
            System.out.println("Excellent, and how much grams of Blueberry do you want in your salad?");
            blueberry.setBlueBerryWeight(scan.nextDouble());
            double amount = peach.getPeachWeight() + sapodilla.getWeight() + tangerine.getTangerineWeight() + blueberry.getBlueBerryWeight();
            if (peach.getPeachWeight() < 0 || sapodilla.getWeight() < 0 || tangerine.getTangerineWeight() < 0 || blueberry.getBlueBerryWeight() < 0) {
                System.out.println("Please, enter the number, which is more or equals 0");
            }
            if (amount == 0) {
                System.out.println("Your salad is empty because you have not ordered any of fruits");
            } else {
                System.out.println("Thank you for your order! Your fruit salad is ready. Total weight of your salad is " + amount + "\n Ingredients:");
                if (peach.getPeachWeight() > 0) {
                    System.out.println("Peach");
                }
                if (sapodilla.getWeight() > 0) {
                    System.out.println("Sapodilla");
                }
                if (tangerine.getTangerineWeight() > 0) {
                    System.out.println("Tangerine");
                }
                if (blueberry.getBlueBerryWeight() > 0) {
                    System.out.println("Blueberry");
                }
                System.out.println("\n\n-------- Choose Your Toppings --------"); // Deva and Om
                System.out.println("\nPress 1. WHIPPED CREAM | 2. CHOCHOLATE | 3. LEMON JUICE  | 4. NO TOPPING : ");
                int toppings = scan.nextInt();
                switch (toppings){ // Om and Deva
                    case 1:
                        System.out.println("Your Toppings: " + Topping.WHIPPED_CREAM);
                        break;
                    case 2:
                        System.out.println("Your Toppings: " + Topping.CHOCOLATE);
                        break;
                    case 3:
                        System.out.println("Your Toppings: " + Topping.LEMON_JUICE);
                        break;
                    case 4:
                        System.out.println("Toppings: " + "Huh! No Toppings Selected :(");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                total += 1;
                System.out.println("Do you want to order another salad?  Y or N");
                userInput = scan.next();
                while (!userInput.matches("[YyNn]")){
                    System.out.println("Incorrect input");
                    userInput = scan.next();
                }
                // User does not want more actions
                if(userInput.matches("[Nn]")){
                    System.out.println("You placed "+ total+" orders. Thakn you!" );
                    System.out.println("Do you wish to exit the program? [Y/Any other key]");
                    String choice = scan.next();
                    // Stop the program
                    if (choice.toLowerCase().equals("y"))
                        run = false;
                    System.exit(0);
                }
            }
        }
        scan.close();
    }
}
