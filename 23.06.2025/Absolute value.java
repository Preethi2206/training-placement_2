public class AbsoluteValue {
    public static void main(String[] args) {
        int number = -15;
        int abs = (number < 0) ? -number : number;
        System.out.println("Absolute value: " + abs);
    }
}
