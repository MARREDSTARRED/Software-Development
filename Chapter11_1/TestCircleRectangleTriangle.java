package Chapter11_1;
import java.util.Scanner;
public class TestCircleRectangleTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number for side1 of the triangle: ");
    double s1 = input.nextDouble();
    System.out.println("Enter a number for side2 of the triangle: ");
    double s2 = input.nextDouble();
    System.out.println("Enter a number for side3 of the triangle: ");
    double s3 = input.nextDouble();
    
    
    Triangle triangle =
      new Triangle(s1, s2, s3);
    System.out.println("\nA rectangle " + triangle.toString());
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is " + triangle.getPerimeter());
  }
}