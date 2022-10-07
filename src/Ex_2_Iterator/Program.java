package Ex_2_Iterator;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(1);
//        nums.add(12);
//        nums.add(123);
//        nums.add(1234);
//        nums.add(12345);
//
//        Iterator<Integer> iter = nums.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        //#region Ex_2.Worker Iterator
//        Worker worker = new Worker("Name", "Surname", 25, 4345);
//
//        Iterator<String> components = worker;
//        while (components.hasNext()){
//            System.out.println(worker.next());
//        }
        //#endregion

        //#region Ex_2.Ex_2.Beverage Iterator

        Beverage latte = new Coffee();
        latte.addComponent(new Milk("Milk"));
        latte.addComponent(new Beans("Beans"));

        Iterator<Ingredient> iterator = latte;
        while (latte.hasNext()){
            System.out.println(iterator.next());
        }

        //#endregion
    }
}
