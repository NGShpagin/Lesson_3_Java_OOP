package Ex_3_Iterable;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.addComponent(new Milk("Milk"));
        coffee.addComponent(new Beans("Beans"));
        for (var ingredient : coffee) {
            System.out.println(ingredient);
        }

    }
}
