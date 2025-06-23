public class SumEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 5 even numbers: " + sum);
    }
}
