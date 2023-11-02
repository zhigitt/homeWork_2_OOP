import java.util.Arrays;

import static java.lang.StringTemplate.STR;

public class MyClass {
    String name;
    String surName;
    int age;
    String[] sabaktar;
    String food;

    public MyClass() {
    }

    public MyClass(String name, String surName, int age, String[] sabaktar, String food) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.sabaktar = sabaktar;
        this.food = food;
    }

    public void getInfo() {
        System.out.println(STR. """

             Form
                Name: \{ name }
                Sur name: \{ surName }
                Age: \{ age }
                Sabaktar: \{ Arrays.toString(sabaktar) }
                Favorite-f: \{ food }
                """ );
    }
}


