public class CenturyCheck {
    public static void main(String[] args) {
        int year = 1900;
        if (year % 100 == 0)
            System.out.println(year + " is a Century Year");
        else
            System.out.println(year + " is not a Century Year");
    }
}
