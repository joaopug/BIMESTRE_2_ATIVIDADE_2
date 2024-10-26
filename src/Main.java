import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniChatBot bot = new MiniChatBot();
        String mensagem = "";

        System.out.println(bot.mensagemInicial());

        while (!mensagem.equals("Sair")) {
            System.out.print("\nUsuário: ");
            mensagem = sc.nextLine().trim().toLowerCase();

            if (mensagem.contains("olá") || mensagem.contains("oi") || mensagem.contains("fala baiano")) {
                System.out.println("MiniChatBot: " + bot.mensagemDeSaudacao());
            } else if (mensagem.contains("como você está?") || mensagem.contains("está tudo bem por aí?") || mensagem.contains("está tudo bem?") || mensagem.contains("tudo certo com você?")) {
                System.out.println("MiniChatBot: " + bot.estadoFisicoEMental());
            } else if (mensagem.contains("qual é o seu nome?") || mensagem.contains("como você se chama?") || mensagem.contains("posso saber seu nome?") || mensagem.contains("qual é o seu nome mesmo?") || mensagem.contains("pode me dizer seu nome?")) {
                System.out.println("MiniChatBot: " + bot.meuNome());
            } else if (mensagem.contains("sair")) {
                break;
            } else {
                System.out.println("MiniChatBot: " + bot.euNaoEntendiQueEleFalou());
            }
        }
    }

}