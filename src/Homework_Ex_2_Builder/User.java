package Homework_Ex_2_Builder;

public class User {
    //#region requiredParametres
    private String firstName;
    private String lastName;
    //#endregion

    //#region optionalParametres
    private int age;
    private double salary;
    private String birthPlace;
    private int child;
    private String company;
    //endregion

    String string;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.salary = builder.salary;
        this.birthPlace = builder.birthPlace;
        this.child = builder.child;
        this.company = builder.company;
        this.string = builder.string;
    }
    @Override
    public String toString() {
        return string;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;
        private String birthPlace;
        private int child;
        private String company;

        StringBuilder sb = new StringBuilder();
        String string = "User:\n";

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
//            sb.append(String.format("%s %s\n", firstName, lastName));
            string += String.format("firstName: %s\nlastName: %s\n", firstName, lastName);
        }

        public UserBuilder age(int val) {
            this.age = val;
//            sb.append(String.format("age: %d\n", val));
            string += String.format("age: %d\n", val);
            return this;
        }

        public UserBuilder salary(double val) {
            this.salary = val;
//            sb.append(String.format("salary: %d\n", val));
            string += String.format("salary: %d\n", val);
            return this;
        }

        public UserBuilder birthPlace(String val) {
            this.birthPlace = val;
//            sb.append(String.format("birthPlace: %s\n", val));
            string += String.format("birthPlace: %s\n", val);
            return this;
        }

        public UserBuilder child(int val) {
            this.child = val;
//            sb.append(String.format("child: %d\n", val));
            string += String.format("child: %d\n", val);
            return this;
        }

        public UserBuilder company(String val) {
            this.company = val;
//            sb.append(String.format("company: %s\n", val));
            string += String.format("company: %s\n", val);
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
