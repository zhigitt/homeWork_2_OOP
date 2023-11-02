import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass person1 = new MyClass();
        person1.name = "Zhigit";
        person1.surName = "Turumbekov";
        person1.age = 20;
        person1.sabaktar = new String[]{"English", "Event", "Pratice"};
        person1.food = "Besh barmak";

        System.out.println(person1.name + "\n" + person1.surName + "\n" + person1.age + "\n" + Arrays.toString(person1.sabaktar) + "\n" + person1.food);


        MyClass person2 = new MyClass("Asan", "Asanov", 25, new String[]{"English", "Event"}, "Lagman");

        person2.getInfo();
    }
}