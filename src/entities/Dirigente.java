package entities;

import enums.TipoDipartimento;

public class Dirigente extends Dipendente {

    public Dirigente(String matricola, double stipendio, TipoDipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
