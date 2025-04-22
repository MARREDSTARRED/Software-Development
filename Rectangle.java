
public class Rectangle {
    
    private double width = 1;
    private double length = 1;
    
    Rectangle(){
    }
    
    public Rectangle(double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }
    double getArea(){
        return width * length;
    }
    double getPerimeter(){
        return 2*(width*length);
    }
    public void getSide(double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }
}
