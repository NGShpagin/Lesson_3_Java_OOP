package Seminar_Ex_1_UI;

public abstract class Skeleton {
    protected String name;
    protected int length;
    protected int width;

//    protected boolean state = false;

    protected ButtonClick Click(ButtonClick click) {
        return click;
//        System.out.printf("%s clicked\n", this.name);
    }

    protected void Hold(boolean state) {
        state = !state;
        System.out.printf("%s changed to %b\n", this.name, state);
    }

    protected void Slide1() {

    }

    protected void Slide2() {

    }

    protected void check() {

    }
}
