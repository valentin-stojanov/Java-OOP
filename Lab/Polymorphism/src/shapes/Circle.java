package shapes;

public class Circle extends Shape {

    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }


    @Override
    protected void calculatePerimeter() {
        Double result = 2 * Math.PI * radius;
        super.setPerimeter(result);
    }

    @Override
    protected void calculateArea() {
        Double result = Math.PI * radius * radius;
        super.setArea(result);
    }

    public final Double getRadius() {
        return radius;
    }
}
