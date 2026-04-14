public class StudentGradeAdjustment {
    
    static class Student {
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
        
        public void setScore(int score) {
            this.score = score;
        }
        
        @Override
        public String toString() {
            return name + ": " + score;
        }
    }
    
    public static void curve(Student s) {
        if (s != null && s.getScore() < 60) {
            s.setScore(s.getScore() + 10);
        }
    }
    
    public static void main(String[] args) {
        Student tom = new Student("Tom", 85);
        System.out.println("Before curve: " + tom);
        curve(tom);
        System.out.println("After curve: " + tom);
        
        Student jane = new Student("Jane", 55);
        System.out.println("\nBefore curve: " + jane);
        curve(jane);
        System.out.println("After curve: " + jane);
        
        Student bob = new Student("Bob", 50);
        System.out.println("\nBefore curve: " + bob);
        curve(bob);
        System.out.println("After curve: " + bob);
    }
}
