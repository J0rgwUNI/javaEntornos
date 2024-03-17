package javaPracticas;
import java.util.Calendar;

public class index {
    public static void main(String[] args) {
        int year = 2024;
        int month = Calendar.JANUARY; // January is represented by 0

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Calendar of " + year + ":");

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if (day % 7 == 0) {
                System.out.println();
            }
        }
    }
}
