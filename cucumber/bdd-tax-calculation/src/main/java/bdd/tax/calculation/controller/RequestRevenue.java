package bdd.tax.calculation.controller;

import java.math.BigDecimal;

public class RequestRevenue {

    private BigDecimal revenue;

    public RequestRevenue() {
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "RequestRevenue{" +
                "revenue=" + revenue +
                '}';
    }
}
