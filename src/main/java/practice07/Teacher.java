package practice07;

public class Teacher extends Person{
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name,int age,Klass klass){
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name,int age){
        super(name,age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        if(klass == null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach " + klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student){
        if(student.getKlass().equal(klass)){
            return super.introduce() +" I am a Teacher. I teach "+ student.getName() +".";
        }else{
            return super.introduce() +" I am a Teacher. I don't teach "+ student.getName() +".";
        }
    }
}
