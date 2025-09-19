package br.com.rompi.aula06.prog1.veiculos.impl;

import br.com.rompi.aula06.prog1.veiculos.VeiculoTerrestre;

public class Moto extends VeiculoTerrestre {
    private boolean temCarenagem;
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.temCarenagem = false;
    }

    // Implementação obrigatória dos métodos abstratos
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Moto " + marca + " acelerando rapidamente! 🏍️💨");
            if (cilindradas > 600) {
                System.out.println("VROOOOOOM! Moto potente!");
            }
        } else {
            System.out.println("Ligue a moto primeiro!");
        }
    }

    @Override
    public void frear() {
        System.out.println("Moto " + marca + " freando com cuidado... 🛑");
    }

    // Implementação dos métodos de manutenção
    @Override
    public void trocarOleo() {
        System.out.println("Trocando óleo da moto " + marca + "... 🔧");
    }

    @Override
    public void verificarPneus() {
        System.out.println("Verificando pressão dos 2 pneus... ⚡");
    }

    // Método específico da moto
    public void empinar() {
        if (ligado) {
            System.out.println("Moto " + marca + " empinando! 🏍️↗️");
        } else {
            System.out.println("Não é possível empinar com a moto desligada!");
        }
    }
}