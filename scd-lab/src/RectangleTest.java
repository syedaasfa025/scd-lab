public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(15.5);
        rectangle.setWidth(10.2);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}


