public class Student {
    private String name;
    private int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    @Override
    public String toString() {
        return name + ": " + score;
    }
    
    public static void main(String[] args) {
        Student tom = new Student("Tom", 85);
        System.out.println(tom);
    }
}
