public class StudentScoreUpdater {
    
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
    
    public static void updateScore(Student s, int newScore) {
        if (s != null) {
            s.setScore(newScore);
        }
    }
    
    public static void main(String[] args) {
        Student alice = new Student("Alice", 85);
        Student bob = new Student("Bob", 78);
        Student charlie = new Student("Charlie", 92);
        
        System.out.println("Before update:");
        System.out.println(alice);
        System.out.println(bob);
        System.out.println(charlie);
        
        // Update scores
        updateScore(alice, 90);
        updateScore(bob, 88);
        updateScore(charlie, 95);
        
        System.out.println("\nAfter update:");
        System.out.println(alice);
        System.out.println(bob);
        System.out.println(charlie);
    }
}
