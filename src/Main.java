//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape triangle = new Shape(5, 5);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println(triangle.areaCalculator());
        System.out.println(rectangle.areaCalculator());
    }
}