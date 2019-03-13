import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab8 {
	public static void main(String [] args) {
		try {
			/*
			* Use scanner to enter and read file name 
			*/
			Scanner reader = new Scanner(System.in);
			System.out.print("What is the file name? ");
			String inFile = reader.next();
			reader.close();
			File infile = new File(inFile);
			reader = new Scanner(infile).useDelimiter("\t");
			PrintWriter output = new PrintWriter ("soccerSummary.txt");
			
			/*
			* Declare and initialize variables 
			*/
			boolean has_min = false;
			int max_score = 0;
			int min_score = 0;
			int score_current = 0;
			double average_current = 0;
			String max_Team = "";
			String min_Team = "";
			String current = "";
			double total_Average = 0;
			int count = 0;
			/*
			* While loop to read and loop through the text file 
			* Use if statements to check to see if the goal is a min or max 
			*/
			while (reader.hasNext()) { 
				current = reader.next();
				score_current = reader.nextInt();
				average_current = reader.nextDouble();
				total_Average += average_current;
				if (!has_min) {
					min_score = score_current;
					has_min = true;
				}
				if (min_score > score_current) {
					min_score = score_current;
					min_Team = current;
				}
				if (score_current > max_score) {
					max_score = score_current;
					max_Team = current;
				}
				count +=1;
			}
			/*
			* Calculate total average 
			*/
			total_Average = total_Average/count;
			
			/*
			* Print max team and score, min team and score, and total average of goals scored
			*/
			output.printf(" %s %s %d \n", "Maximum goals scored: ", max_Team, max_score);
			output.printf(" %s %s %d \n", "Minimum goals scored: ", min_Team, min_score);
			output.printf(" %s %.2f \n", "Average shots per game: ", total_Average);
			reader.close();
			output.close();
			
				
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
