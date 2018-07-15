package practice10;
import java.util.*;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    private LinkedList<Klass> klasses;

    public Teacher(int id,String name,int age,LinkedList<Klass> klasses){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klasses = klasses;
    }

    public Teacher(int id,String name,int age){
        super(id,name,age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        if(klasses == null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }

        String klassesToString="";

        for(int i=0;i<this.klasses.size();i++){
            klassesToString += this.klasses.get(i).getNumber()+", ";
        }
        klassesToString = klassesToString.substring(0,klassesToString.length()-2);
        return super.introduce()+" I am a Teacher. I teach Class "+klassesToString+".";

    }
    //
    public String introduceWith(Student student){
        for(int i=0;i<this.klasses.size();i++) {
            if (student.getKlass().equal(this.klasses.get(i)))
                return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
        return "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I don't teach "+student.getName()+".";
    }

    public boolean isTeaching(Student student){
        for(int i=0;i<this.klasses.size();i++){
            if(this.klasses.get(i).equal(student.getKlass()))
                return true;
        }
        return false;
    }
}
