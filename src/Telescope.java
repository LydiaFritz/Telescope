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
