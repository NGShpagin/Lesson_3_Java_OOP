package Homework_Ex_1_Figures;

class Circle extends Ellipse {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        super.majorRadius = radius;
        super.minorRadius = radius;
        this.radius = radius;
    }

    @Override
    public void setMajorRadius(double majorRadius) {
        super.setMajorRadius(majorRadius);
        super.majorRadius = majorRadius;
        this.radius = majorRadius;
    }

    @Override
    public void setMinorRadius(double minorRadius) {
        super.getMinorRadius(minorRadius);
        super.minorRadius = minorRadius;
        this.radius = minorRadius;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

}
