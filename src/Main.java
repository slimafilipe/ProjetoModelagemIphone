import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        System.out.println("======== iPhone ==========");
        int option;
        while (true) {
            System.out.println("1 - Fazer uma ligação");
            System.out.println("2 - Atender");
            System.out.println("3 - Correio de Voz");
            System.out.println("4 - Adicionar nova aba no Navegador");
            System.out.println("5 - Exibir página no Navegador");
            System.out.println("6 - Atualizar página no Navegador");
            System.out.println("7 - Reproduzir música");
            System.out.println("8 - Pausar múscia");
            System.out.println("9 - Selecionar música");
            System.out.println("0 - Desligar iPhone");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> iphone.fazerLigacao();
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioVoz();
                case 4 -> iphone.adicionarNovaAba();
                case 5 -> iphone.exibindoPagina();
                case 6 -> iphone.atualizarPagina();
                case 7 -> iphone.tocar();
                case 8 -> iphone.pausar();
                case 9 -> iphone.selecionandoMusica();
                case 0 -> {
                    System.out.println("Desligando iPhone...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção ínvalida");
            }


        }
    }



}