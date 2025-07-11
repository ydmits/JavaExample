package fromJavaRush.tasks;

import java.util.Date;

public class StrFormat {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00

        Date date = new Date();
        System.out.println(String.format(getFormattedStringDate(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";
    }

    public static String getFormattedStringDate() {
        return "%td:%tm:%ty %tH:%tM:%tS";
    }
}
