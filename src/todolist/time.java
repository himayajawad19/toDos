package todolist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {

    public void go() {

        Date currentDate = new Date();
        String formatDateStr = "dd-MM-yyyy";
        DateFormat formatDate = new SimpleDateFormat(formatDateStr);
        String formattedDateStr = formatDate.format(currentDate);
        System.out.println(formattedDateStr);
    }

    public static void main(String[] args) {
        time obj = new time();
        obj.go();
    }
}
