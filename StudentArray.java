public class StudentArray {
    
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
    }
    
    public static void main(String[] args) {
        // Create an array of 3 Student objects
        Student[] students = {
            new Student("Alice", 95),
            new Student("Bob", 87),
            new Student("Charlie", 92)
        };
        
        // Print all students' names and scores using a loop
        System.out.println("Student Information:");
        System.out.println("-".repeat(30));
        
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getScore());
        }
    }
}
