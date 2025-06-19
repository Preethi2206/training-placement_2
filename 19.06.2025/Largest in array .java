public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest: " + max);
    }
}
