import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author a4432_asu
 *
 */
public class Telescope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program that reads the input from a file. 
		 * The first entry will be the number of rows scanned,
		 * the second entry will be the number of columns scanned; 
		 */
		
		try {
			Scanner fin = new Scanner(new File("input.in"));
			int rows = fin.nextInt(), cols = fin.nextInt();
			//debug
			System.out.println("rows = " + rows + " cols = " + cols);
			//make the 1-d array
			double [] originalValues = new double[rows*cols];
			//read in the values from the file
			for(int i = 0; i < rows*cols; i++) {
				originalValues[i] = fin.nextDouble();
			}
			//make the 2-D array
			double[][] grid = new double[rows][cols];
			//loop over the rows
			for(int r = 0; r < rows; r++) {
				
				//see if this row is even or odd
				if(r%2 == 0) {
					for(int c = 0; c < cols; c++) {
						
					}
				}
				else {
					//odd row
					for(int c = cols-1; c >= 0; c--) {
						
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.");
			e.printStackTrace();
		}
		
	 
		/*this is followed by the scan values. Create
a 1-d array to hold the input values. Transfer your values to an appropriately sized 2-d array and
display the output in a grid. 
*/

	}

}
