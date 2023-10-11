package org.example.ProvaExamen;



public class Triatleta extends Atleta implements Federacio {

    private Ciclista ciclista;
    private Nadador nadador;
    private Corredor corredor;

    public Triatleta(String nom, String cognom, Ciclista ciclista, Nadador nadador, Corredor corredor) {
        super(nom, cognom);
        this.ciclista = ciclista;
        this.nadador = nadador;
        this.corredor = corredor;
    }

    public Ciclista getCiclista() {
        return ciclista;
    }

    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }

    public Nadador getNadador() {
        return nadador;
    }

    public void setNadador(Nadador nadador) {
        this.nadador = nadador;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

    @Override
    public int numLlicencia() {
        return 0;
    }
}
