package entities;

import enums.TipoDipartimento;

public class DipendentePartTime extends Dipendente {

    private double oreLavorative;
    private double pagaOraria;

    public DipendentePartTime(String matricola, double oreLavorative, double pagaOraria, TipoDipartimento dipartimento) {
        super(matricola, oreLavorative * pagaOraria, dipartimento);
        this.oreLavorative = oreLavorative;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return (oreLavorative * pagaOraria) * 4;
    }
}
