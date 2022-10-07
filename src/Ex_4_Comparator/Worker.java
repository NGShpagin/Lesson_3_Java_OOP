package Ex_4_Comparator;

public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        // переписанная логика
//        return Integer.compare(this.salary, o.salary);
        // Логика по умолчанию
        if (this.age > o.age) return 1;
        else if (this.age < age) return -1;
        else return 0;
    }
}
