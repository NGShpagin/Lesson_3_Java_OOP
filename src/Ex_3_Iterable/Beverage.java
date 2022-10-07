package Ex_3_Iterable;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    List<Ingredient> components;
    int index;
    public Beverage(){
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }
}
