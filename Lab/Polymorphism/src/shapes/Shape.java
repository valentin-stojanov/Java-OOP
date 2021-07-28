package shapes;


public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public Double getArea() {
        if (area == null) {
            calculateArea();
        }
        return area;
    }

    public Double getPerimeter() {
        if (perimeter == null) {
            calculatePerimeter();
        }
        return perimeter;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();
}
