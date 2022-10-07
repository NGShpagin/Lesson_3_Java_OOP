package Homework_Ex_1_Figures;

public class Ellipse extends Figure {
    protected double majorRadius;
    protected double minorRadius;

    public double getMajorRadius(double majorRadius) {
        return majorRadius;
    }

    public double getMinorRadius(double minorRadius) {
        return minorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * majorRadius * minorRadius;
    }
}
