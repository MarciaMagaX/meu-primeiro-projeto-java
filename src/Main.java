// Importamos ferramentas que o Java nos oferece para gerar números aleatórios e ler o que o usuário digita.
import java.util.Random;
import java.util.Scanner;

// Esta é a nossa classe, a "planta" do nosso programa.
class JogoAdivinhacao {

    // Este é o método principal. É aqui que a execução começa!
    public static void main(String[] args) {

        // 1. GERANDO O NÚMERO SECRETO
        // Cria um gerador de números aleatórios.
        Random gerador = new Random();
        // Pede ao gerador um número inteiro entre 0 e 99, e soma 1. Resultado: 1 a 100.
        int numeroSecreto = gerador.nextInt(100) + 1;

        // 2. PREPARANDO PARA LER A ENTRADA DO JOGADOR
        // Cria um "leitor" para o que o usuário digitar no teclado.
        Scanner leitor = new Scanner(System.in);

        // Mensagem inicial para o jogador.
        System.out.println("***********************************");
        System.out.println(" Bem-vinda ao Jogo de Adivinhação! ");
        System.out.println(" Tente adivinhar o número de 1 a 100");
        System.out.println("***********************************");

        int palpite; // Variável para guardar o palpite do jogador.

        // 3. O LOOP DO JOGO
        // O comando 'while (true)' cria um loop infinito. Só vamos sair dele com um 'break'.
        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = leitor.nextInt(); // Lê o número que o jogador digitou.

            // 4. A LÓGICA DE COMPARAÇÃO (IF/ELSE)
            if (palpite == numeroSecreto) {
                // Se acertou...
                System.out.println("Parabéns! Você acertou!");
                break; // 'break' quebra o loop e encerra o jogo.
            } else if (palpite < numeroSecreto) {
                // Se o palpite for menor...
                System.out.println("Seu palpite foi muito baixo. Tente um número maior.");
            } else {
                // Se não for igual nem menor, só pode ser maior...
                System.out.println("Seu palpite foi muito alto. Tente um número menor.");
            }
        }

        // Fecha o leitor para liberar recursos do sistema. Boa prática!
        leitor.close();
        System.out.println("Fim do jogo!");
    }
}
