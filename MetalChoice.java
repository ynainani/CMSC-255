/****************************************************************************
* Project 3 - MetalChoice
****************************************************************************
* This project calculates the cost of building metal art sculptures from customer's input of dimensions, sculpture material choice, name plate material choice.
*_____________________________________________________
* Yashna Nainani
* February 21, 2019
* CMSC 255 - Section 004
****************************************************************************/
import java.util.Scanner;

public class MetalChoice{
    public static void main(String [] args){
    
        System.out.println("Yashna Nainani");
        System.out.println("Project 3 - MetalChoice");
        System.out.println("This project calculates the cost of building metal art sculptures from customer's input of dimensions, sculpture material choice, name plate material choice.");
        System.out.println("February 21, 2019");
        System.out.println("CMSC 255 Section 004");
        System.out.println();

        /*******
        * Declare in as the scanner object for customer's inputs
        * For a sentinel value in a while loop, initialize and declare userInput 
        * Initialize the total cost of all sculptures and declare as 0
        *******/
        Scanner in = new Scanner(System.in);
        String userInput = "yes";
        double totalCost = 0;
        double PROCESSING_FEE = 1.67;
        
        /*******
        * Creates a while loop that does not proceed if the user enters quit to ask user for name, dimensions, material choice, and name plate choice
        * Allows the user to input the name of their (first) sculpture using a String
        * Enter nameLength as a string for future usage
        *******/
        while (!userInput.equals("quit")) {
            System.out.print("Enter the name of your sculpture: ");
            String nameArt = in.next();
            in.nextLine();
            double nameLength = (nameArt.length());

            /*******
            * Enter lengthBaseFirst, heightBaseFirst, lengthBaseSecond, heightBaseSecond, heightPrism, lengthPrism, and widthPrism.
            *******/
            double lengthBaseFirst;         // length of the base of the first pyramid
            double heightBaseFirst;         // height of the base of the first pyramid
            double lengthBaseSecond;        // length of the base of the second pyramid
            double heightBaseSecond;        // height of the base of the second pyramid
            double heightPrism;             // height of the rectangular prism
            double lengthPrism;             // length of the rectangular prism
            double widthPrism;              // width of the rectangular prism

            /*******
            * Uses a while loop that evaluates to true to allow user to input sculpture dimensions
            * Uses a try catch exception to account for a non-numerical input. Should the user input a non-numerical input, the program will prompt the user to enter a numerical value.
            *******/
            while (true) {
                try {
                    System.out.print("Enter the length of the base of the first pyramid (inches): ");
                    lengthBaseFirst = in.nextDouble();
                    System.out.print("Enter the height of the first pyramid (inches): ");
                    heightBaseFirst = in.nextDouble();
                    System.out.print("Enter the length of the base of the second pyramid (inches): ");
                    lengthBaseSecond = in.nextDouble();
                    System.out.print("Enter the height of the second pyramid (inches): ");
                    heightBaseSecond = in.nextDouble();
                    System.out.print("Enter the height of the rectangular prism (inches): ");
                    heightPrism = in.nextDouble();
                    System.out.print("Enter the length of the rectangular prism (inches): ");
                    lengthPrism = in.nextDouble();
                    System.out.print("Enter the width of the rectangular prism (inches): ");
                    widthPrism = in.nextDouble();
                    break;
                }

                catch (Exception e) {
                    String error = in.nextLine();
                    System.out.println("This input is not valid. Please remember to input only numeric values.");
                }
            }
            
            System.out.println("");
            System.out.println("");
            
            /*******
            * Uses a while loop to let user input preferred material type to build the sculpture from.
            *******/
            String sculptureMaterial;
            double materialCost = 0;
            while (true) {
                System.out.println("We offer 3 different types of material to build the sculpture from:");
                System.out.println("Aluminum ($1.50/in), Steel ($2.85/in), Titanium ($4.50/in)");
                System.out.print("Enter your sculpture material: ");
                sculptureMaterial = in.next();
                sculptureMaterial = sculptureMaterial.toLowerCase();
                   
                    /*******
                    * Uses if, else if, and else to determine the cost of the material chosen. 
                    * Should an input that does not match the type of material be entered, the program prompts the user to enter a vaalid input.
                    *******/
                    if (sculptureMaterial.equals("aluminum")){
                    materialCost = 1.50;
                    break;
                    }

                    else if (sculptureMaterial.equals("titanium")){
                    materialCost = 4.50;
                    break;
                    }

                    else if (sculptureMaterial.equals("steel")){
                    materialCost = 2.85;
                    break;
                    }

                    else{
                    System.out.println("");
                    System.out.println("This input is not valid. Please enter a valid input.");
                    System.out.println("");
                    }
            }
            
            System.out.println("");
            System.out.println("");
                   
            /*******
            * Uses a while loop to let user input preferred material type to build the name plate from.
            *******/
            String plateMaterial;
            double plateCost = 0;
            while (true) {
                System.out.println("We offer 3 different types of material to build the name plate from:");
                System.out.println("Bronze ($8.00/in), Silver Plated ($12.50/in), Gold ($19.99/in)");
                System.out.print("Choose your name plate material (if you would like to choose silver plated, please enter silver): ");
                plateMaterial = in.next();
                plateMaterial = plateMaterial.toLowerCase();
                    
                    /*******
                    * Uses if, else if, and else to determine the cost of the material chosen. 
                    * Should an input that does not match the type of material be entered, the program prompts the user to enter a vaalid input.
                    *******/
                    if (plateMaterial.equals("bronze")){
                        plateCost = 8.00;
                        break;
                    }

                    else if (plateMaterial.equals("silver")){
                        plateCost = 12.50;
                        break;
                    }

                    else if (plateMaterial.equals("gold")){
                        plateCost = 19.99;
                        break;
                    }

                    else {
                        System.out.println("");
                        System.out.println("This input is not valid. Please enter a valid input.");
                        System.out.println("");
                    }
            }
            
            System.out.println("");
            System.out.println("");
            
            /*******
            * Uses if, else if, and else to determine the cost of the name plate based off of the length of the name inputted.
            * A nested if statement is used if the length of the name inputted is longer than ten characters and a gold name plate material is chosen.
            * The user receives a $2 discount if the aforementioned parameters are met
            *******/
            double lengthCost = 0;
            if (nameLength < 6) {
                lengthCost = 19.99;
                }
            if (nameLength < 11) {
                lengthCost = 2.50 * (nameLength - 5) + 19.99;
                }
            else {
                if (plateMaterial.equals("gold")) {
                plateCost -= 2;
                }
            lengthCost = 1.85 * (nameLength - 5) + 19.99;
            }
            
            /*******
            * Calculates and prints out the surface area of each part of the sculpture
            * Calculates and prints out the total surface area of the sculpture
            * Calculates and prints out the total cost of the sculpture
            * Increments the sculpture costs as the program loops for more sculptures the customer may want to purchase
            * Allows user to continue to create another sculpture or quit to calculate total cost of all inputted sculptures.
            *******/
            double halfBaseFirst = ((1/2.0) * lengthBaseFirst);
            double areaBaseFirst = halfBaseFirst * Math.sqrt((lengthBaseFirst * lengthBaseFirst) - (halfBaseFirst * halfBaseFirst));
            double slantLengthFirst = Math.sqrt((halfBaseFirst * halfBaseFirst) + (heightBaseFirst * heightBaseFirst));
            double surfaceAreaFirst = (areaBaseFirst + (0.5) * 3 * lengthBaseFirst * slantLengthFirst);
            System.out.printf("Surface area of the first pyramid: %,.2f square inches", surfaceAreaFirst);
            System.out.println();

            double halfBaseSecond = ((1/2.0) * lengthBaseSecond);
            double areaBaseSecond = halfBaseSecond * Math.sqrt((lengthBaseSecond * lengthBaseSecond) - (halfBaseSecond * halfBaseSecond));
            double slantLengthSecond = (Math.sqrt((halfBaseSecond * halfBaseSecond) + (heightBaseSecond * heightBaseSecond)));
            double surfaceAreaSecond = (areaBaseSecond + (1/2.0) * 3 * lengthBaseSecond * slantLengthSecond);
            System.out.printf("Surface area of the second pyramid: %,.2f square inches", surfaceAreaSecond);
            System.out.println();

            double surfaceAreaPrism = (2 * heightPrism * lengthPrism) + (2 * lengthPrism * widthPrism) + (2 * widthPrism * heightPrism);
            System.out.printf("Surface area of the rectangular prism: %,.2f square inches", surfaceAreaPrism);
            System.out.println();

            double totalSurfaceArea = (surfaceAreaPrism + surfaceAreaSecond + surfaceAreaFirst);
            System.out.printf("Total surface area: %,.2f square inches", totalSurfaceArea);
            System.out.println();
            System.out.println();

            double sculptureCost = totalSurfaceArea * materialCost + plateCost + lengthCost + PROCESSING_FEE;
            System.out.println("Please note that the total cost of the sculpture includes a $1.67 processing fee.");
            System.out.printf("Total cost of the sculpture: $%,.2f", sculptureCost);
            totalCost += sculptureCost;
            System.out.println(); 
            
            System.out.print("If you would like to create another sculpture, enter any key. If not, please enter 'quit'. ");
            userInput = (in.next()).toLowerCase();
        }
        /*******
        * Exits while loop and prints out the total cost of all sculptures.
        *******/
        System.out.printf("Total cost: $%,.2f", totalCost);
        System.out.println("");
    }
}