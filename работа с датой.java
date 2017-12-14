import java.util.Date;

/* Работа с датой 08.11.09
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        String date = "JANUARY 1 2000";
        System.out.println(date + " = " + isDateOdd(date));
    }

    public static boolean isDateOdd(String date) {
        Date yStartTime = new Date();
        yStartTime.setHours(0);
        yStartTime.setMinutes(0);
        yStartTime.setSeconds(0);
        yStartTime.setDate(1);
        yStartTime.setMonth(0);

        Date currentDate = new Date(date);

        long time = currentDate.getTime() - yStartTime.getTime();
        int dayCount = (int) (time/(24*60*60*1000));

        return (dayCount % 2 == 0);
    }
}
