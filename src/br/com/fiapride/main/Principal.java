package br.com.fiapride.main;
import br.com.fiapride.model.Veiculos;


public class Principal {
    public static void main(String[] args) {

        // Primeiro objeto
        Veiculos veiculo1 = new Veiculos("Carlos", "ABC-1234");


        // Testando metodos
        veiculo1.adicionaGasolina(50);
        System.out.println("Gasolina após adição: " + veiculo1.getGasolina());
        veiculo1.gastaGasolina(33.7);
        System.out.println("Gasolina após gasto: " + veiculo1.getGasolina());

        System.out.println("Dono do veiculo: " + veiculo1.getNome() + "  |  Placa: " + veiculo1.getPlaca() + "  |  Litros de gasolina: " + veiculo1.getGasolina());

    }
}