public class CharCount {
    public static void main(String[] args) {
        String str = "Java is fun";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ')
                count++;
        }
        System.out.println("Character count (excluding spaces): " + count);
    }
}
