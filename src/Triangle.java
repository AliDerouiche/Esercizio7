public class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double areaCalculator() {
        double area = (base * height) / 2;

        return area;
    }
}
