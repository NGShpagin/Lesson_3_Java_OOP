package Ex_4_Comparator;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

        //#region Collections.sort

//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 10; i++){
//            numbers.add(r.nextInt(1, 10));
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

        //#endregion

        //region Comparable<Worker>

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 60),
                    r.nextInt(10000)));
        }
        System.out.println(db);
//        db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
//        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
//        Collections.sort(db); // упорядочивание по возрасту
//        db.sort(new SalaryComparator()); // упорядочивание по зарплате

        System.out.println(db);



        //#endregion
    }
}
