
import java.io.*;

public class Exercise_17_03 {
	public static void main(String[] args) throws IOException {
		int sum = 0; 

		try ( 
			DataInputStream input = 
				new DataInputStream(new FileInputStream("Exercise17_03.dat")); 
		) {
			
			while (true)
				sum += input.readInt();
		}
		catch (EOFException ex) { 
			System.out.println("Sum of the integers is: " + sum);
		}
	}
}