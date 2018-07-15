package practice06;

public class Teacher extends Person{
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age, int klass){
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    Teacher(String name,int age){
        super(name,age);
        this.name = name;
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        if(klass == 0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class " + klass + ".";
    }
}
