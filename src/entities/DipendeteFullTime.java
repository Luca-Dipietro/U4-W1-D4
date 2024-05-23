package entities;

import enums.TipoDipartimento;

public class DipendeteFullTime extends Dipendente {
    
    public DipendeteFullTime(String matricola, double stipendio, TipoDipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
