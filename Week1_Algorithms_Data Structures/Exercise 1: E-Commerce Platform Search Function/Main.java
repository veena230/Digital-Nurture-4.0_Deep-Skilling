package com.forecast;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		 double[] sales = {50000, 55000, 60500};
	        double growthRate = 0.10; 
	        FinancialForecast forecast = new FinancialForecast(sales, growthRate);

	        double nextYear = forecast.forecastNextYear();
	        System.out.println("Forecast for next year: $" + nextYear);

	        double[] next5Years = forecast.forecastNextNYears(5);
	        System.out.println("Forecast for next 5 years: " + Arrays.toString(next5Years));
	    }
	}
