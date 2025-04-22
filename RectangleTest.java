
public class RectangleTest {
    
    public static void main(String[] args){
        
        Rectangle r1 = new Rectangle(4 , 40);
        Rectangle r2 = new Rectangle(3.5 , 35.9);
        
        
        System.out.println("Rectangle 1's area: "+ r1.getArea());
        System.out.println("Rectangle 1's width is 4");
        System.out.println("Rectangle 1's length is 40");
        System.out.println("Rectangle 1's perimeter: "+ r1.getPerimeter());
        System.out.println("Rectangle 2's area: "+ r2.getArea());
        System.out.println("Rectangle 2's width is 3.5");
        System.out.println("Rectangle 2's length is 35.9");
        System.out.println("Rectangle 2's perimeter: "+ r2.getPerimeter());
        
        
    }
    
}
