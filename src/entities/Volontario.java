package entities;

import interfaces.Timbrare;

public class Volontario implements Timbrare {

    private String nome;
    private int età;
    private String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il suo turno");
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCV() {
        return CV;
    }
}
