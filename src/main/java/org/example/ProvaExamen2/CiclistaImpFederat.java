package org.example.ProvaExamen2;

public class CiclistaImpFederat extends Atleta implements CiclistaI,Federacio{
    @Override
    public String getBici() {
        return null;
    }

    @Override
    public void setbici(String bici) {

    }

    @Override
    public int numLlicencia() {
        return 0;
    }
}
