package metodosabstratos.exercicio.entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAualIncome() {
        return anualIncome;
    }

    public void setAualIncome(Double aualIncome) {
        this.anualIncome = aualIncome;
    }

    public abstract Double tax();
}
