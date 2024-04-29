package Tests;

public class Ex1 {
    private String level;

    public static void main(String[] args) {
        var q = new Ex1();
        System.out.println("Level:" + q.level);
    }

    public Ex1(){
        this("Easy");
    }

    public Ex1(String level){
        level = level;
    }
}
