package br.com.rompi.aula06.prog1.veiculos;

interface Manutencao {
    void trocarOleo();
    void verificarPneus();

    default void revisao() {
        System.out.println("Realizando revisão geral...");
        trocarOleo();
        verificarPneus();
    }
}