package practice09;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.getId() &&
                age == person.getAge() &&
                name.equals(person.getName());
    }

    public String introduce(){
        return "My name is " + name +". I am "+ age + " years old.";
    }
}
