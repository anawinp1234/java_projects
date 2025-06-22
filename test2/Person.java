public class Person {
    int age;
    String name;

    public Person(String personName, int personAge){
        name = personName;
        age = personAge;
    }

    public int personAge(int age){
        return age;
    }
    public String toString(String name){
        return "Hello! My name is " + name + ".";
    }
    public static void main(String[] args) {
        Person personName = new Person("Anawin", 19);
        Person personName2 = new Person ("Anawin Jr", 18);
        System.out.println(personName.toString(personName.name));
        System.out.println("My age is " + personName.personAge(personName.age) + ".");
        System.out.println(personName2.toString(personName2.name));
        System.out.println("My age is " + personName2.personAge(personName2.age) + ".");


    }
}
