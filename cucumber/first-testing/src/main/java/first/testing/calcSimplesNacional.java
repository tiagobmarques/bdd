package first.testing;

public class calcSimplesNacional {

    private double receita;

    public calcSimplesNacional (double receita) {
        this.receita = receita;
    }

    public double calcula() {
        double aliquota;
        if (receita <= 180000) {
            aliquota = ((receita * 4) / receita);
        }else if (receita >= 180000.01 & receita <= 360000) {
            aliquota = (((receita * 7.30)-5940) / receita);
        }
        else if (receita >= 360000.01 & receita <= 720000) {
            aliquota = (((receita * 9.50)-13860) / receita);
        }
        else if (receita >= 720000.01 & receita <= 1800000) {
            aliquota = (((receita * 10.70)-22500) / receita);
        }
        else {
            aliquota = 0;
        }
        return receita * aliquota / 100;
    }
}
