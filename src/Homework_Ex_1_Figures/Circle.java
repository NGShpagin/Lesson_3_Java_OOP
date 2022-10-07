package Homework_Ex_1_Figures;

class Circle extends Figure {
    double r = 0;

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

}
