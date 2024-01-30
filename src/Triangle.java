public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double areaCalculator() {
        double area = (base * height) / 2;

        return area;
    }
}
