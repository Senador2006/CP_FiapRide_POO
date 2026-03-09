package br.com.fiapride.model;

public class Veiculos {

    // Atributos
    private String nome;
    private String placa;
    private double gasolina;

    // Construtor
    public Veiculos(String nome, String placa) {
        this.nome=nome;
        this.placa=placa;
    }

    // Métodos
    public void adicionaGasolina(int litros){
        gasolina = gasolina + litros;
    }

    public void gastaGasolina(double litros){
        gasolina = gasolina - litros;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
}
