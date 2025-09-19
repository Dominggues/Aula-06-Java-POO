package br.com.rompi.aula06.prog1.veiculos;

public abstract class VeiculoPesado extends VeiculoTerrestre {
    protected double capacidadeCarga;

    public VeiculoPesado(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Método concreto específico para veículos pesados
    public void carregarCarga(double peso) {
        if (peso <= capacidadeCarga) {
            System.out.println("Carregando " + peso + " toneladas...");
        } else {
            System.out.println("ERRO: Peso excede capacidade máxima de " + capacidadeCarga + " toneladas!");
        }
    }

    // Método abstrato específico
    public abstract void ativarFreioDeEstacionamento();
}