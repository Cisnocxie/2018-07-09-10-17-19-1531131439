package practice07;

public class Klass {
    private int number;

    public Klass(int number){
        this.number = number;
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
}
