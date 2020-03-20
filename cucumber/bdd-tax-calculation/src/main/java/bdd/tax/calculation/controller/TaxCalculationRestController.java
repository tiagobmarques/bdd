package bdd.tax.calculation.controller;

import bdd.tax.calculation.service.TaxCalculation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/tax-calculation")
public class TaxCalculationRestController {

    @PostMapping
    public ResponseEntity<TaxCalculation> getTax(@RequestBody RequestRevenue revenue) {
        TaxCalculation tax = new TaxCalculation(revenue.getRevenue());
        tax.calculate();

        return ResponseEntity.ok(tax);
    }

    @GetMapping
    public Integer get() {
        BigDecimal a;
        BigDecimal b;

        a = BigDecimal.valueOf(2);
        b = BigDecimal.valueOf(1);

        int i = a.compareTo(b);

        return i;
    }
}
