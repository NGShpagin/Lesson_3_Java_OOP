package Homework_Ex_2_Builder;

public class App {
    public static void main(String[] args) {
        User user1 = new User
                .UserBuilder("Ivan", "Ivanov")
                .age(23)
                .company("ASE")
                .build();
        System.out.println(user1);

    }
}
