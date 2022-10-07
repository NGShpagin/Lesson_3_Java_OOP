package Seminar_Ex_1_UI;

public class Button extends Skeleton implements ButtonClick {

    public Button(String name, int length, int width, ButtonClick click){
        super.name = name;
        super.length = length;
        super.width = width;
    }

    public void click(ButtonClick click){
        super.Click(click);
    }

}
