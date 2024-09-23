public class Person {

    //Attribute
    private String name;
    private int age;

    //Referenzen

    //Konstruktor
    public Person() { // = "Peter"
        helloSagen(15)
        helloSagen(name); //= 15

    }
    //Methoden
    public void helloSagen(age, name){
        System.out.println("Hi, my name is "+name);
        System.out.println("and I am "+age );
    }
}
