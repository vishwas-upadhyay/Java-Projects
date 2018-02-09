package com.vishwas.timeanddate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.*;

public class TimeNDate {

	public static void main(String[] args) {
		long minutes = (long) 4.869276367152733;
		double temp = minutes * 60;
		long second =java.util.concurrent.TimeUnit.MINUTES.toSeconds((long)0.869276);
		
		System.out.println("temp: "+temp+" second: "+second);
		
		
		double d = 4.869276367152733;
		System.out.println("Math.floor( d )"+Math.floor( d ));
	    BigDecimal bd = new BigDecimal( d - Math.floor( d ));
	    bd = bd.setScale(2,RoundingMode.HALF_DOWN);
        Double n = new Double(bd.toString());
        System.out.println("n" +Math.round(n*60));
	}

}
