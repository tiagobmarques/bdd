package bdd.tax.calculation.service;

import java.math.BigDecimal;

public class TaxCalculation {
    public BigDecimal revenue;
    public BigDecimal tax;

    public TaxCalculation(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public void calculate() {
        BigDecimal rate;
        if (revenue.compareTo(BigDecimal.valueOf(180000)) <= 0) {
            rate = ((revenue.multiply(BigDecimal.valueOf(4))).divide(revenue));
        }else if (revenue.compareTo(BigDecimal.valueOf(180000.01)) >= 0 & revenue.compareTo(BigDecimal.valueOf(360000)) <= 0) {
            rate = ((revenue.multiply(BigDecimal.valueOf(7.30))).subtract(BigDecimal.valueOf(5940)).divide(revenue));
        }else if (revenue.compareTo(BigDecimal.valueOf(360000.01)) >= 0 & revenue.compareTo(BigDecimal.valueOf(720000)) <= 0) {
            rate = ((revenue.multiply(BigDecimal.valueOf(9.50))).subtract(BigDecimal.valueOf(13860)).divide(revenue));
        }else if (revenue.compareTo(BigDecimal.valueOf(720000.01)) >= 0 & revenue.compareTo(BigDecimal.valueOf(1800000)) <= 0) {
            rate = ((revenue.multiply(BigDecimal.valueOf(10.70))).subtract(BigDecimal.valueOf(22500)).divide(revenue));
        }
        else {
            rate = BigDecimal.valueOf(0);
        }
        tax = revenue.multiply(rate).divide(BigDecimal.valueOf(100));
    }

}
