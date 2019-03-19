/****************************************************************************
* Project 4 - CarFacts
****************************************************************************
* This project determines a number of different facts about cars given some input data about various cars.
*_____________________________________________________
* Yashna Nainani
* March 14, 2019
* CMSC 255 - Section 004
****************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CarFacts{

  /*
   * The main method will first call method printHeading to print out the header
   * Then it will call method inputData.
   */
    
  public static void main(String [] args) throws FileNotFoundException {
    printHeading();
    inputData();
  }

  /*
   * Asks the user for a file name and will use this file to read in the car data from the file, one item at a time
   * Separates the data in the file by tabs with the exception of the make & model of the car, which can be read in as one item
   */

  public static void inputData() {
    try {
      Scanner reader = new Scanner(System.in);
      System.out.print("Input Data File Name: ");
      String inputData = reader.next();
      reader.close();
      
      File inputFile = new File(inputData);
      reader = new Scanner(inputFile);
      PrintWriter out = new PrintWriter("CarFactsOutput.txt");

      /* 
      * Declare and initialize variables
      */
      
      int numMiles = 0;
      double tankSize = 0;
      int price = 0;
      double drivabilityScore = 0;
      String makeModel = "";
      double mileageRating;
      double overallValue;
      String currentName = "";

      String bestCarGas = "";
      int currentMiles = 0;
      double maxMiles = 0;

      String bestCarPrice = "";
      double currentPrice = 0;
      double minPrice = 10000000000000.0;

      String bestCarValue = "";
      double currentValue = 0;
      double maxValue = 0;
      int count = 0;

      /*
      * use delimiter to tab through the data
      */
      out.printf("Output: \n");
      reader.useDelimiter("\t");

      /*
      * while loop that calls mileageRating and overallValue methods
      * Reads the tabs and calculate the best gas mileage rating, the best price, and the best overall value
      */
      while (reader.hasNext()) {

        makeModel = reader.next().trim();
        numMiles = reader.nextInt();
        tankSize = reader.nextDouble();
        price = reader.nextInt();
        drivabilityScore = reader.nextDouble();

        mileageRating = calcMileageRating(numMiles, tankSize);
        overallValue = calcOverallValue(mileageRating, price, drivabilityScore);

        
        if(mileageRating > maxMiles) {
            maxMiles = mileageRating;
            bestCarGas = makeModel;
          }

        if (minPrice > price) {
          minPrice = price;
          bestCarPrice = makeModel;
         }

        if (maxValue < overallValue) {
            maxValue = overallValue;
            bestCarValue = makeModel;
          }
          count++;

        /*
        * calls displayData method
        */
        displayData(makeModel, mileageRating, overallValue, out);
        }
      
      /*
      * prints out cars with the best gas mileage rating, best price, and best overall value 
      */
      out.printf("\n\n\n");
      out.printf("The car with the best gas mileage rating is %s with a rating of %.2f\n", bestCarGas, maxMiles);
      out.printf("The car with the best price is %s with a price of: $%.2f\n", bestCarPrice, minPrice);
      out.printf("The car with the best overall value is %s with a rating of: %.2f\n", bestCarValue, maxValue);
      

      /*
      * close scanner reader and printwriter out
      */
      reader.close();
      out.close();
    }

      /*
      * catches exceptions
      */
      catch (Exception e) {
      e.printStackTrace();
    }
  }

  /*
  * method "printHeading" to print out the header for this project
  */
  public static void printHeading() {
    System.out.println("Yashna Nainani");
    System.out.println("Project 4 - CarFacts");
    System.out.println("This project determines a number of different facts about cars given some input data about said cars.");
    System.out.println("March 17, 2019");
    System.out.println("CMSC 255 Section 004");
    System.out.println();
  }

  /*
  * create method calcMileageRating
  * number of miles divided by tank size
  * returns mileage rating
  */
  public static double calcMileageRating(int numMiles, double tankSize) {

      double mileageRating = (numMiles / tankSize);
      return mileageRating;
   }

   /*
   * create method calcOverallValue
   * passes in the mileage rating, the car’s cost, and the drivability score
   * returns overall value
   */
   public static double calcOverallValue(double mileageRating, int price, double drivabilityScore) {

      double overallValue = (0.35 * mileageRating + 0.4 * price + 0.25 * drivabilityScore);
      return overallValue;
   }
   /*
   * create method displayData
   * Outputs make/model of car, gas mileage, and overall value to CarFactsOutput.txt
   */

   public static void displayData(String makeModel, double mileageRating, double overallValue, PrintWriter out) {
      out.printf("%-20s\t %-6.2fmpg\t Value:\t %-10.2f\n", makeModel, mileageRating, overallValue);

     
   }


}