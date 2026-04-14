public class BonusAdder {
    
    public static void addBonus(int[] scores) {
        if (scores == null) {
            return;
        }
        
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }
    
    public static void main(String[] args) {
        int[] scores = {70, 80, 90, 60, 75};
        
        System.out.println("Original scores: " + java.util.Arrays.toString(scores));
        addBonus(scores);
        System.out.println("Scores after bonus: " + java.util.Arrays.toString(scores));
    }
}
