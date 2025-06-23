public class MinMax {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
