public class PersonApp {
    public static void main(String[] args) {
//        Person student1 = new Person("Juan Candia");
//        System.out.println(student1.getName());
//        student1.sayHello();
//
//        student1.setName("Juan F Candia");
//        System.out.println(student1.getName());
//        student1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false - compares if it's the same object

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person1 == person2); //true because they reference the same object

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName());  //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //Jane - why?
        System.out.println(person2.getName()); //Jane
    }
}
