package br.com.fiapride.main;
import br.com.fiapride.model.Veiculos;


public class Principal {
    public static void main(String[] args) {

        // Primeiro objeto
        Veiculos veiculo1 = new Veiculos("Carlos", "ABC-1234");
        veiculo1.setGasolina(50);
        System.out.println("Dono do veiculo: " + veiculo1.getNome() + "  |  Placa: " + veiculo1.getPlaca() + "  |  Litros de gasolina: " + veiculo1.getGasolina());

        // Testando metodos
        veiculo1.adicionaGasolina(50);
        System.out.println("Gasolina após adição: " + veiculo1.getGasolina());
        veiculo1.gastaGasolina(60);
        System.out.println("Gasolina após gasto: " + veiculo1.getGasolina());

        // Testando setters
        veiculo1.setNome("Pedro");
        System.out.println("Novo dono do carro: " + veiculo1.getNome());
        veiculo1.setPlaca("BBB-5678");
        System.out.println("Nova Placa: " + veiculo1.getPlaca());
        veiculo1.setGasolina(50);
        System.out.println("Gasolina Atual: " + veiculo1.getGasolina());
    }
}