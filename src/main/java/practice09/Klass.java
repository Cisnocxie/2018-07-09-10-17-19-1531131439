package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number){
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public boolean equal(Klass klass){
        return number == klass.getNumber();
    }

    public void assignLeader(Student student){
        if(this.equal(student.getKlass())){
            this.leader = student;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean vertifyLeader(Student student){
        return this.leader != null && this.leader.is(student);
    }

    public void appendMember(Student student){
        student.changeKlass(this);
    }
}
