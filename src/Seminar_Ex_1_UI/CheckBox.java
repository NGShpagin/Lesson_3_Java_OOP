package Seminar_Ex_1_UI;

public class CheckBox extends Skeleton {
    boolean state = false;
    public CheckBox(String name, int length, int width){
        super.name = name;
        super.length = length;
        super.width = width;
    }

    public void hold(){
        boolean state1 = this.state;
        super.Hold(state1);
    }
}
