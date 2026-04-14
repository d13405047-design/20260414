public class Main {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        
        // Calculate the sum of all scores
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        
        // Calculate the average
        double average = (double) sum / scores.length;
        
        // Print the result
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
