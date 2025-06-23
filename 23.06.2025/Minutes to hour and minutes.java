public class TimeConvert {
    public static void main(String[] args) {
        int totalMinutes = 130;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " hour(s) and " + minutes + " minute(s)");
    }
}
