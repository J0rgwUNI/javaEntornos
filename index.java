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


                // System.out.println("Calendar of " + year + ":");basdklfasdjkfhasklj

                
            }


        }
     System.out.println();
        //asdhjkfgajs
        //asdhjkfgajs
    for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("1 ");
        }
        System.out.println();
    
    
    }
}}
