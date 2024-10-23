import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniChatBot bot = new MiniChatBot();

        System.out.println(bot.mensagemInicial());

        boolean jorge = true;

        while (jorge) {
            System.out.print("\nUsuário: ");
            String mensagem1 = sc.next();

            if (mensagem1.contains("Olá") || mensagem1.contains("Oi") || mensagem1.contains("Fala baiano")) {
                System.out.println("MiniChatBot: " + bot.mensagemDeSaudacao());
            } else if (mensagem1.contains("Como você está?") || mensagem1.contains("Está tudo bem por aí?") || mensagem1.contains("Está tudo bem?") || mensagem1.contains("Tudo certo com você?")) {
                System.out.println("MiniChatBot: " + bot.estadoFisicoEMental());
            } else if (mensagem1.contains("Qual é o seu nome?") || mensagem1.contains("Como você se chama?") || mensagem1.contains("Posso saber seu nome?") || mensagem1.contains("Qual é o seu nome mesmo?") || mensagem1.contains("Pode me dizer seu nome?")) {
                System.out.println("MiniChatBot: " + bot.meuNome());
            } else if (mensagem1.contains("Sair")) {
                jorge = false;
            } else {
                System.out.println("MiniChatBot: " + bot.euNaoEntendiQueEleFalou());
            }
        }

    }

}