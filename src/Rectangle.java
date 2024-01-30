public class Rectangle implements Shape {
    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        double area = base * height;

        return area;
    }
}
