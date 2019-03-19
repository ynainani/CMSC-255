/****************************************************************************
* Project 2 - MetalArt
****************************************************************************
* This project displays the area and costs of building a model sculpture based on user input for the size of the pyramids andrectangular prism.
*_____________________________________________________
* Yashna Nainani
* February 6, 2019
* CMSC 255 - Section 004
****************************************************************************/
import java.util.Scanner;

public class MetalArt
{

  public static void main(String[] args)
  {
    System.out.println("   ");
    System.out.println("Yashna Nainani");
    System.out.println("Project 2 - MetalArt");
    System.out.println("This project displays the area and costs of building a model sculpture based on user input for the size of the pyramids and rectangular prism. ");
    System.out.println("February 18, 2019");
    System.out.println("CMSC 255 Section 4");
    System.out.println("  ");
    System.out.println("");

    /**********************************************************
	* Enter nameArt, lengthBaseFirst, heightBaseFirst, lengthBaseSecond, heightBaseSecond, heightPrism, lengthPrism, and widthPrism.
	* Enter halfBaseFirst, areaBaseFirst, slantLengthFirst, surfaceAreaFirst, halfBaseSecond, areaBaseSecond, slantLengthSecond, surfaceAreaSecond, surfaceAreaPrism, totalSurfaceArea, and totalCost
    **********************************************************/
    Scanner in = new Scanner(System.in);
    String nameArt;
    double lengthBaseFirst; 		// length of the base of the first pyramid
    double heightBaseFirst; 		// height of the base of the first pyramid
    double lengthBaseSecond; 		// length of the base of the second pyramid
    double heightBaseSecond; 		// height of the base of the second pyramid
    double heightPrism; 			// height of the rectangular prism
    double lengthPrism;			    // length of the rectangular prism
    double widthPrism;				// width of the rectangular prism
    double MATERIAL_COST = 1.67;    // total cost of the material
    
    /****************************************************************
    * Print "Enter the name of the pentagon: " followed by nameArt
    ****************************************************************/
    System.out.print("Enter the name of the pentagon: ");
    nameArt = in.nextLine();

    /****************************************************************
    * Print "The " followed by nameArt, followed by " surface area calculations are: "
    ****************************************************************/
    System.out.println("The " + nameArt + " surface area calculations are:");

    /****************************************************************
    * Print "Enter the length of the base of the first pyramid (inches) " followed by lengthBaseFirst
    ****************************************************************/
    System.out.print("Enter the length of the base of the first pyramid (inches) ");
    lengthBaseFirst = in.nextDouble();

    /****************************************************************
    * Print "Enter the height of the base of the first pyramid (inches) " followed by heightBaseFirst
    ****************************************************************/
    System.out.print("Enter the height of the first pyramid (inches): ");
    heightBaseFirst = in.nextDouble();

    /****************************************************************
    * Print "Enter the length of the base of the second pyramid (inches) " followed by lengthBaseSecond
    ****************************************************************/
    System.out.print("Enter the length of the base of the second pyramid (inches): ");
    lengthBaseSecond = in.nextDouble();

    /****************************************************************
    * Print "Enter the height of the base of the second pyramid (inches) " followed by heightBaseSecond
    ****************************************************************/
    System.out.print("Enter the height of the second pyramid (inches): ");
    heightBaseSecond = in.nextDouble();

    /****************************************************************
    * Print "Enter the height of the rectangular prism (inches) " followed by heightPrism
    ****************************************************************/
    System.out.print("Enter the height of the rectangular prism (inches): ");
    heightPrism = in.nextDouble();

    /****************************************************************
    * Print "Enter the length of the rectangular prism (inches) " followed by lengthPrism
    ****************************************************************/
    System.out.print("Enter the length of the rectangular prism (inches): ");
    lengthPrism = in.nextDouble();

    /****************************************************************
    * Print "Enter the width of the base of the rectangular prism (inches) " followed by widthPrism
    ****************************************************************/
    System.out.print("Enter the width of the rectangular prism (inches): ");
    widthPrism = in.nextDouble();

    /****************************************************************
    * A blank space for extra readability
    ****************************************************************/
    System.out.println();


        /****************************************************************
        * Calculate halfBaseFirst by 1/2 times lengthBaseFirst
        ****************************************************************/
        double halfBaseFirst = ((1/2.0) * lengthBaseFirst);

        /****************************************************************
        * Calculate areaBaseFirst by multiplying halfBaseFirst with the square root of lengthBaseFirst squared minus halfBaseFirst squared.
        ****************************************************************/
        double areaBaseFirst = halfBaseFirst * Math.sqrt((lengthBaseFirst * lengthBaseFirst) - (halfBaseFirst * halfBaseFirst));

        /****************************************************************
        * Calculate the slantLengthFirst (slant length of the first pyramid) by the square root of halfBaseFirst squared added to heightBaseFirst squared.
        ****************************************************************/
        double slantLengthFirst = Math.sqrt((halfBaseFirst * halfBaseFirst) + (heightBaseFirst * heightBaseFirst));

        /****************************************************************
        * Calculate surfaceAreaFirst by areaBaseFirst added to half times 3 times lengthBaseFirst times slantLengthFirst
        ****************************************************************/
        double surfaceAreaFirst = (areaBaseFirst + (0.5) * 3 * lengthBaseFirst * slantLengthFirst);

        /****************************************************************
        * Print "Surface area of the first pyramid: " with the rounded output of surfaceAreaFirst
        * Calculate the rounded output of surfaceAreaFirst
        ****************************************************************/
        System.out.printf("Surface area of the first pyramid: %,.2f square inches", surfaceAreaFirst);

        /****************************************************************
        * Print a blank space
        *****************************************************************/
        System.out.println();

        /****************************************************************
        * Calculate halfBaseSecond by 1/2 times lengthBaseSecond
        ****************************************************************/
        double halfBaseSecond = ((1/2.0) * lengthBaseSecond);

        /****************************************************************
        * Calculate areaBaseSecond by multiplying halfBaseSecond with the square root of lengthBaseSecond squared minus halfBaseSecond squared.
        ****************************************************************/
        double areaBaseSecond = halfBaseSecond * Math.sqrt((lengthBaseSecond * lengthBaseSecond) - (halfBaseSecond * halfBaseSecond));

        /****************************************************************
        * Calculate the slantLengthSecond (slant length of the second pyramid) by the square root of halfBaseSecond squared added to heightBaseSecond squared.
        ****************************************************************/
        double slantLengthSecond = (Math.sqrt((halfBaseSecond * halfBaseSecond) + (heightBaseSecond * heightBaseSecond)));

        /****************************************************************
        * Calculate surfaceAreaSecond by areaBaseSecond added to half times 3 times lengthBaseSecond times slantLengthSecond
        ****************************************************************/
        double surfaceAreaSecond = (areaBaseSecond + (1/2.0) * 3 * lengthBaseSecond * slantLengthSecond);

        /****************************************************************
        * Print "Surface area of the second pyramid: " with the rounded output of surfaceAreaSecond
        * Calculate the rounded output of surfaceAreaSecond
        ****************************************************************/
        System.out.printf("Surface area of the second pyramid: %,.2f square inches", surfaceAreaSecond);

        /****************************************************************
        * Print a blank space
        *****************************************************************/
        System.out.println();



        /****************************************************************
        * Calculate surfaceAreaPrism by 2 times the heightPrism times lengthPrism, added to 2 times lengthPrism times widthPrism, added to 2 times widthPrism times heightPrism
        ****************************************************************/
        double surfaceAreaPrism = (2 * heightPrism * lengthPrism) + (2 * lengthPrism * widthPrism) + (2 * widthPrism * heightPrism);

        /****************************************************************
        * Print "Surface area of the rectangular prism: " with the rounded output of surfaceAreaPrism
        * Calculate the rounded output of surfaceAreaPrism
        ****************************************************************/
        System.out.printf("Surface area of the rectangular prism: %,.2f square inches", surfaceAreaPrism);

        /****************************************************************
        * Print a blank space
        *****************************************************************/
        System.out.println();


        /****************************************************************
        * Calculate the total surface area of the rectangular prism, the first pyramid, and the second pyramid, by surfaceAreaPrism added to surfaceAreaSecond added to surfaceAreaFirst.
        ****************************************************************/
        double totalSurfaceArea = (surfaceAreaPrism + surfaceAreaSecond + surfaceAreaFirst);

        /****************************************************************
        * Print "Total Surface area: " with the rounded output of totalSurfaceArea
        * Calculate the rounded output of totalSurfaceArea
        ****************************************************************/
        System.out.printf("Total Surface area: %,.2f square inches", totalSurfaceArea);

        /****************************************************************
        * Print a blank space
        *****************************************************************/
        System.out.println();

        /****************************************************************
        * Calculate the total cost by multiplying totalSurfaceArea by the cost of the material, which is $1.67 per inch
        ****************************************************************/
        double totalCost = (MATERIAL_COST * totalSurfaceArea);

    	/****************************************************************
    	* Print "The total cost of the material to build: ", followed by nameArt, followed by "is" and then the rounded value of totalCost.
    	* Calculate the rounded output of totalCost
    	****************************************************************/
    	System.out.printf("The total cost of the material to build " + nameArt + " is $%,.2f", totalCost);
        
        /****************************************************************
        * Print a blank space
        *****************************************************************/
        System.out.println();

  }
}