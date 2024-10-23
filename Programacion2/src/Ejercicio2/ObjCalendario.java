package Ejercicio2;



import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjCalendario {
    int hora, minutos, segundos;
    int dia, mes, anio;

    GregorianCalendar cal = new GregorianCalendar();

    public void sacaFecha()
    {
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        anio = cal.get(Calendar.YEAR);
    }

    public String toString()
    {
        hora = cal.get(Calendar.HOUR);
        minutos = cal.get(Calendar.MINUTE);
        segundos = cal.get(Calendar.SECOND);

        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12)?12:hora%12),
                minutos, segundos, (hora <12 ? "AM" : "PM"));
    }



}
