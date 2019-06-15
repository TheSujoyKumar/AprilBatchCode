package pack5_Selenium;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		String currentTime = dateFormat.format(date);
		System.out.println(currentTime);
        
	}

}
