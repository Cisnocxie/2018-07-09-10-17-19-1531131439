package practice10;

public class Student extends Person{
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(this.klass.vertifyLeader(this)){
            return super.introduce() +" I am a Student. I am Leader of " + klass.getDisplayName() +".";
        }
        return super.introduce() +" I am a Student. I am at " + klass.getDisplayName() +".";
    }

    public boolean is(Student student){
        return student.id == this.id;
    }

    public void changeKlass(Klass klass){
        this.klass = klass;
    }
}
