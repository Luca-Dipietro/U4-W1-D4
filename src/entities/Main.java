package entities;

import enums.TipoDipartimento;
import interfaces.Timbrare;

public class Main {
    public static void main(String[] args) {

        /* Dipendente d1 = new Dipendente("01", 2500, TipoDipartimento.VENDITE);
        Dipendente d2 = new Dipendente("02", 1700, TipoDipartimento.PRODUZIONE);
        Dipendente d3 = new Dipendente("03", 2000, TipoDipartimento.AMMINISTRAZIONE);

        Dipendente[] listaDipendenti = {d1, d2, d3};

        for (Dipendente d : listaDipendenti) {
            System.out.println("Matricola Dipendente: " + d.getMatricola());
        }*/

        Dipendente d1 = new DipendeteFullTime("01", 2500, TipoDipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime("02", 20, 15, TipoDipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dirigente("03", 5000, TipoDipartimento.VENDITE);

        Volontario v1 = new Volontario("Luca Dipietro", 26, "Curriculum");
        Volontario v2 = new Volontario("Federico Bernardeschi", 30, "Curriculum");
        Volontario v3 = new Volontario("Ademola Lookman", 26, "Curriculum");

        Timbrare[] listaCheckIn = {d1, d2, d3, v1, v2, v3};

        for (Timbrare t : listaCheckIn) {
            t.checkIn();
        }

        System.out.println();

        Dipendente[] listaDipendenti = {d1, d2, d3};

        for (Dipendente d : listaDipendenti) {
            System.out.println("Matricola Dipendente: " + d.getMatricola() + ", Stipendio: " + d.calculateSalary());
        }
    }
}
