public class ArraySum {
    
    public static int sum(int[] arr) {
        if (arr == null) {
            return 0;
        }
        
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Sum: " + sum(arr1));
        
        int[] arr2 = {5, 15, 25};
        System.out.println("\nArray: " + java.util.Arrays.toString(arr2));
        System.out.println("Sum: " + sum(arr2));
        
        int[] arr3 = {100};
        System.out.println("\nArray: " + java.util.Arrays.toString(arr3));
        System.out.println("Sum: " + sum(arr3));
        
        int[] arr4 = {};
        System.out.println("\nArray: " + java.util.Arrays.toString(arr4));
        System.out.println("Sum: " + sum(arr4));
    }
}
