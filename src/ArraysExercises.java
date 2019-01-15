import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Eddie");
        people[1] = new Person("Brian");
        people[2] = new Person("Bruce");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = Person.addPerson(people, new Person("Charles"));

        System.out.println(people[3].getName());
    }



}
