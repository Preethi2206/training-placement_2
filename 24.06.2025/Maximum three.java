public class MaxThree {
    public static void main(String[] args) {
        int a = 5, b = 8, c = 3;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum: " + max);
    }
}
