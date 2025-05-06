public class TestOfExcercise13 {
	/** Main method */
	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		AbGeometricObject[] triangles = {new Triangle(1,1,1), new Triangle(2,2,2), 
			new Triangle(3,3,3), new Triangle(4,4,4), new Triangle(5,5,5)};

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
		for (int i = 0; i < triangles.length; i++) {
		 	System.out.println("\nTriangle #" + (i + 1));
		 	System.out.println("Area: " + triangles[i].getArea());
		 	System.out.println("How to color: " + ((Triangle)triangles[i]).howToColor());
		 } 
	}
}