package entities;

import enums.TipoDipartimento;
import interfaces.Timbrare;


public abstract class Dipendente implements Timbrare {
    private String matricola;
    private double stipendio;
    private TipoDipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, TipoDipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente " + matricola + " ha iniziato il suo turno");
    }

}


