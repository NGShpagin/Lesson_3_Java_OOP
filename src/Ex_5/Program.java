package Ex_5;

public class Program {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.addComponent(new Milk("Milk"));
        coffee.addComponent(new Beans("Beans1"));
        coffee.addComponent(new Beans("Beans1"));
        for (var ingredient : coffee) {
            System.out.println(ingredient);
        }

    }
}
