package problem19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CountingSundays {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date startdatum = null;
		Date enddatum = null;
		try {
			startdatum = sdf.parse("01/01/1901");
			enddatum = sdf.parse("31/12/2000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<Date> tage = new ArrayList<Date>();
	    Calendar kalender = new GregorianCalendar();
	    kalender.setTime(startdatum);
	    
	    while(kalender.getTime().before(enddatum)) {
	        Date temptag = kalender.getTime();
	        tage.add(temptag);
	        kalender.add(Calendar.DATE,1);
	    }
	    int zaehler = 0;
	    for(Date d:tage) {
	    	if(d.getDay()==0 & d.getDate()==1) {
	    		zaehler++;
	    	}
	    }
	    System.out.println(zaehler);
	}
	//Antwort: 171
}