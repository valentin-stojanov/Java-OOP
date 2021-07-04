package PointInRectangle;

public class Rectangle {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean contains(Point point) {
        if (this.x1 <= point.getX() && point.getX() <= this.x2) {
            if (this.y1 <= point.getY() && point.getY() <= this.y2) {
                return true;
            }
        }
        return false;
    }
}
