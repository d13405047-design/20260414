public class StudentScoreCounter {
    
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
        
        @Override
        public String toString() {
            return name + ": " + score;
        }
    }
    
    public static int countPassing(Student[] students) {
        if (students == null) {
            return 0;
        }
        
        int count = 0;
        for (Student student : students) {
            if (student != null && student.getScore() >= 60) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Student[] students = {
            new Student("Tom", 85),
            new Student("Jane", 55),
            new Student("Bob", 60),
            new Student("Alice", 45),
            new Student("Charlie", 90),
            new Student("Diana", 70)
        };
        
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("  " + student);
        }
        
        int passingCount = countPassing(students);
        System.out.println("\nNumber of students with score >= 60: " + passingCount);
    }
}
