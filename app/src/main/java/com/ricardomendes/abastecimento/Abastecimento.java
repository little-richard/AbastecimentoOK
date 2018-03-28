package com.ricardomendes.abastecimento;

public class Abastecimento {
    private double gasolina, alcool, media, melhorEscolha;
    public Abastecimento(){

    }

    public double melhorEscolha(String gasolina, String alcool){
        this.gasolina = Double.parseDouble(gasolina);
        this.alcool = Double.parseDouble(alcool);
            melhorEscolha = this.gasolina*0.7;
            return melhorEscolha;
    }

    public double getAlcool(){
        return alcool;
    }

    public double Media(String kms, String qtde) {
        double km = Double.parseDouble(kms);
        double litros = Double.parseDouble(qtde);
        media = km / litros;
        return media;
    }
}
