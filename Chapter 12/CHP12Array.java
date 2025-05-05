
package chp12array;

import java.util.Random;
import java.util.Scanner;
public class CHP12Array {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      	int n = 100;
        int[] arr = new int[n];

        // Create a Random object 
        Random random = new Random();

        // Assign random values to the array
        for (int i = 0; i < n; i++) {
            
          	// Generate a random integer 
            // between INT_MIN and INT_MAX
            arr[i] = random.nextInt(100); 
        }
System.out.println("Enter a cell number from 1 to 100: ");
    int uN = input.nextInt();{
        if (uN > 100 || uN < 1)
            System.out.println("Out of Bounds");
                    }
        if (uN >= 0 && uN < arr.length) {
            System.out.println("The element at index " + uN + " is: " + arr[uN]);
        }
    }
}
