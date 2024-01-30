//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(9, 7);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println(triangle.areaCalculator());
        System.out.println(rectangle.areaCalculator());
    }
}