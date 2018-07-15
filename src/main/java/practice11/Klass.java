package practice11;
import java.util.*;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> memberList = new ArrayList<>();
    private List<AssignLeaderListener> assignLeaderListenerList = new ArrayList<>();
    private List<JoinClassListener> joinClassListenerList = new ArrayList<>();

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
            this.noticeAssignLeaderListener(student);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public boolean vertifyLeader(Student student){
        return this.leader != null && this.leader.is(student);
    }

    public void appendMember(Student student){
        student.changeKlass(this);
        memberList.add(student);
        this.noticeJoinClassListener(student);
    }


    public void addAssignLeaderListener(AssignLeaderListener assignLeaderListener) {
        assignLeaderListenerList.add(assignLeaderListener);
    }

    public void addJoinClassListener(JoinClassListener joinClassListener) {
        joinClassListenerList.add(joinClassListener);
    }

    public void noticeJoinClassListener(Student student){
        for(JoinClassListener joinClassListener : joinClassListenerList){
            joinClassListener.saySomeoneJoinClass(student,this.number);
        }
    }

    public void noticeAssignLeaderListener(Student student){
        for(AssignLeaderListener assignLeaderListener : assignLeaderListenerList){
            assignLeaderListener.saySomeoneBecomeLeader(student,this.number);
        }
    }
}
