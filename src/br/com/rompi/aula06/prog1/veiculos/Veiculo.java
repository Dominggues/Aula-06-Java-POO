package br.com.rompi.aula06.prog1.veiculos;

interface Veiculo {
    int VELOCIDADE_MAXIMA_URBANA = 60;
    String COMBUSTIVEL_PADRAO = "Gasolina";

    void acelerar();
    void frear();
    void ligar();
    void desligar();

    default void buzinar() {
        System.out.println("Beep! Beep!");
    }

    // Método estático
    static void mostrarRegras() {
        System.out.println("Regras de trânsito devem ser respeitadas!");
    }
}