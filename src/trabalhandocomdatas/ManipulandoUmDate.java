package trabalhandocomdatas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoUmDate {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07z"));

        System.out.println(sdf.format(d));

        //Somando uma unidade de tempo
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);;
        cal.add(Calendar.HOUR_OF_DAY,4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        //Obtendo uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); //janeiro começa no valor 0

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}