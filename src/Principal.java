import br.com.rompi.aula06.prog1.veiculos.VeiculoTerrestre;
import br.com.rompi.aula06.prog1.veiculos.impl.Caminhao;
import br.com.rompi.aula06.prog1.veiculos.impl.Carro;
import br.com.rompi.aula06.prog1.veiculos.impl.Moto;


public class Principal {
        public static void main(String[] args) {
            System.out.println("=== DEMONSTRAÇÃO DE ABSTRAÇÃO ===\n");

            // ERRO: Não é possível instanciar classes abstratas ou interfaces
            // Veiculo veiculo = new Veiculo(); // ERRO!
            // VeiculoTerrestre vt = new VeiculoTerrestre(); // ERRO!

            // 1. CRIANDO OBJETOS DAS CLASSES CONCRETAS
            System.out.println("1. CRIANDO OBJETOS:");
            Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
            Moto moto = new Moto("Honda", "CB600F", 2022, 600);
            Caminhao caminhao = new Caminhao("Volvo", "FH", 2023, 15.5, 3);

            System.out.println();

            // 2. POLIMORFISMO COM ABSTRAÇÃO
            System.out.println("2. POLIMORFISMO COM ABSTRAÇÃO:");
            VeiculoTerrestre[] veiculos = {carro, moto, caminhao};

            for (VeiculoTerrestre veiculo : veiculos) {
                veiculo.mostrarInfo();
                veiculo.ligar();
                veiculo.acelerar();  // Cada um implementa diferente!
                veiculo.frear();     // Cada um implementa diferente!
                veiculo.buzinar();   // Método padrão da interface
                System.out.println();
            }

            // 3. MÉTODOS ESPECÍFICOS
            System.out.println("3. MÉTODOS ESPECÍFICOS:");
            carro.abrirPortas();
            moto.empinar();
            caminhao.carregarCarga(12.0);
            caminhao.ativarFreioDeEstacionamento();
            System.out.println();

            // 4. MANUTENÇÃO (Interface)
            System.out.println("4. MANUTENÇÃO:");
            carro.revisao();    // Método padrão que chama os abstratos
            System.out.println();
            moto.trocarOleo();  // Implementação específica
            moto.verificarPneus();
            System.out.println();

            // 5. MÉTODOS ESTÁTICOS DA INTERFACE
            System.out.println("5. MÉTODO ESTÁTICO:");
           // Veiculo.mostrarRegras();
            System.out.println();

            // 6. DEMONSTRANDO ABSTRAÇÃO EM AÇÃO
            System.out.println("6. ABSTRAÇÃO EM AÇÃO:");
            demonstrarAbstracao(carro);
            demonstrarAbstracao(moto);
            demonstrarAbstracao(caminhao);
        }

        // Método que trabalha com abstração
        // Recebe qualquer VeiculoTerrestre, mas não precisa saber os detalhes
        public static void demonstrarAbstracao(VeiculoTerrestre veiculo) {
            System.out.println("Testando veículo abstrato:");

            // Usamos a interface comum, mas cada objeto se comporta diferente
            veiculo.ligar();
            veiculo.acelerar();  // Comportamento específico de cada classe
            veiculo.frear();     // Comportamento específico de cada classe
            veiculo.desligar();

            System.out.println("Teste concluído!\n");

            // A ABSTRAÇÃO esconde os detalhes de implementação!
            // Não precisamos saber SE é carro, moto ou caminhão
            // Apenas usamos a interface comum
        }
    }