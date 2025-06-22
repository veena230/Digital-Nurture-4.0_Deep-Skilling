package com.forecast;
public class FinancialForecast {
    private double[] historicalSales;
    private double growthRate;
    public FinancialForecast(double[] historicalSales, double growthRate) {
        this.historicalSales = historicalSales;
        this.growthRate = growthRate;
    }
    public double forecastNextYear() {
        double lastYearSales = historicalSales[historicalSales.length - 1];
        return lastYearSales * (1 + growthRate);
    }
    public double[] forecastNextNYears(int years) {
        double[] forecast = new double[years];
        double current = historicalSales[historicalSales.length - 1];
        for (int i = 0; i < years; i++) {
            current *= (1 + growthRate);
            forecast[i] = current;
        }
        return forecast;
    }
}
