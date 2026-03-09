package br.com.fiapride.model;

public class Veiculos {

    // Atributos
    private String nome;
    private String placa;
    private int gasolina;

    // Construtor
    public Veiculos(String nome, String placa, int gasolina) {
        this.nome=nome;
        this.placa=placa;
        this.gasolina=gasolina;
    }

    // Métodos
    public void adicionaGasolina(int litros){
        gasolina = gasolina + litros;
    }

    public void gastaGasolina(int litros){
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

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}
