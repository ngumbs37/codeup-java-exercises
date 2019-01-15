import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {
    private String name;
    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello "+ this.name);
    }
    public Person(String name){
        setName(name);
    }

    static Person[] addPerson(Person[] people, Person person){
        int arrayLength = people.length;
        people = Arrays.copyOf(people, arrayLength+1);
        people[arrayLength] = person;

        return people;
    }

    public static void main(String[] args) {
        Person person = new Person("Kevin");
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        System.out.println(person.getName());
        person1.sayHello();
        person2.sayHello();
        person2.setName("Jane");
        System.out.println(person2.getName());
        person2.sayHello();
    }
}
