public class DaysMonth_9 {
    public static void main(String[] args) {

        for (int month = 1; month <= 12; month++) {

            System.out.println("Month " + month);

            int days = 31;

            if (month == 2) {
                days = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            }

            for (int day = 1; day <= days; day++) {
                System.out.print(day + " ");
            }

            System.out.println();
        }
    }
}