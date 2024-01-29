public class Rectangle extends Shape {
    public Rectangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double areaCalculator() {
        double area = base * height;

        return area;
    }
}
