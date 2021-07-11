package ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box( double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private boolean isNegative(double number){
        return number <= 0;
    }

    private void setLength(double length){
        if (isNegative(length)) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width){
        if (isNegative(width)) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height){
        if (isNegative(height)) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return 2 * (this.width * this.height) +
                2 * (this.length * this.height) +
                2 * (this.width * this.length);
    }

    public double calculateLateralSurfaceArea(){
        return 2 * (this.length * this.height) +
                2 * (this.width * this.height);
    }

    public double calculateVolume(){
        return this.length * this.width * this.height;
    }

    @Override
    public String toString(){
        return String.format("Surface Area - %.2f%n" +
                "Lateral Surface Area - %.2f%n" +
                "Volume – %.2f",
                calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
