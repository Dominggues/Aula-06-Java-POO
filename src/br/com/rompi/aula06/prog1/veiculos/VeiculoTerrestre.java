package br.com.rompi.aula06.prog1.veiculos;

public abstract class VeiculoTerrestre implements Veiculo, Manutencao {
    // Atributos concretos
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean ligado;

    // Construtor
    public VeiculoTerrestre(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    // Método concreto - implementação comum
    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(marca + " " + modelo + " ligado!");
        } else {
            System.out.println("Veículo já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(marca + " " + modelo + " desligado!");
        } else {
            System.out.println("Veículo já está desligado!");
        }
    }

    // Método abstrato - deve ser implementado pelas subclasses
    public abstract void acelerar();
    public abstract void frear();

    // Método concreto específico da classe abstrata
    public void mostrarInfo() {
        System.out.println("=== INFO DO VEÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("======================");
    }
}