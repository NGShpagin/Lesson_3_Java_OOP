package Seminar_Ex_1_UI;

public class Form {
    private int x = 0;
    private int y = 0;
    StringBuilder sb = new StringBuilder();

    public Form(String name, int length, int width){

    }

    public void addComponent(Skeleton skeleton, int x1, int y1){
        x += x1 + skeleton.length;
        y += y1 + skeleton.width;

        System.out.printf("%s added\n", skeleton.name);
        sb.append(String.format("%s, x: %d, y: %d\n", skeleton.name, x, y));
    }

    public void addComponent(Skeleton skeleton){
        this.addComponent(skeleton, x, y);
    }

    public void viewComponents(){
        System.out.println(sb);
    }
}
