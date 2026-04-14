public class MinimumScoreFinder {
    
    public static int findMinimum(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] scores1 = {85, 92, 78, 95, 88, 76};
        System.out.println("Array: " + java.util.Arrays.toString(scores1));
        System.out.println("Minimum score: " + findMinimum(scores1));
        
        int[] scores2 = {45, 67, 23, 89, 12, 56};
        System.out.println("\nArray: " + java.util.Arrays.toString(scores2));
        System.out.println("Minimum score: " + findMinimum(scores2));
        
        int[] scores3 = {100};
        System.out.println("\nArray: " + java.util.Arrays.toString(scores3));
        System.out.println("Minimum score: " + findMinimum(scores3));
    }
}
