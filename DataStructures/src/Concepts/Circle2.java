package Concepts;

/**
 *
 * @author Wilson Soto
 */
public class Circle2 extends Point2 {

    private double radius;

    public Circle2() {
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param radiusValue 
     */
    public Circle2(int x, int y, double radiusValue) {
        super(x, y);
        setRadius(radiusValue);
        }

    public void setRadius(double radiusValue) {
        radius = (radiusValue < 0.0 ? 0.0 : radiusValue);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * getRadius();
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public String getName() {
        return "Circle";
    }

    public String toString() {
        return "Center = " + super.toString() + "; Radius = " + getRadius();
    }

}
