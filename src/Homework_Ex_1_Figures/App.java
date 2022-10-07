package Homework_Ex_1_Figures;

public class App {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(10);
        System.out.println(sq.getArea());

        Rectangle re = new Rectangle();
        re.setHeight(5);
        re.setWidth(10);
        System.out.println(re.getArea());
    }
}
