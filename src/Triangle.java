public class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        double area = (base * height) / 2;

        return area;
    }
}
