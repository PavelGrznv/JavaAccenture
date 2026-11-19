public class AbstractActivity {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: "
                + rectangle.calculateArea(2, 2, 0));
        System.out.println("Rectangle perimeter: "
                + rectangle.calculatePerimeter(2, 2, 0));

        Circle circle = new Circle();
        circle.setColor("Yellow");

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: "
                + circle.calculateArea(0, 0, 8));
        System.out.println("Circle perimeter: "
                + circle.calculatePerimeter(0, 0, 8));
    }
}