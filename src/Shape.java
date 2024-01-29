public class Shape {
    double base;
    double height;

    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double areaCalculator() {
        double area = (base * height) * 2;
        return area;
    }

}
