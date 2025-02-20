import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador{

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public  void ligar(String numero) {
        System.out.println("Ligando " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar múscica " + musica);
    }

    public void fazerLigacao(){
        System.out.println("Para qual número deseja ligar? ");

        String numero = scanner.nextLine();
        ligar(numero);
    }

    public void exibindoPagina(){
        System.out.println("Digite o endereço URL da página que deseja abrir: ");
        String url = scanner.nextLine();
        exibirPagina(url);
    }

    public void selecionandoMusica(){
        System.out.println("Digite o nome da música que deseja selecionar: ");
        String musica = scanner.next();
        selecionarMusica(musica);
    }
}
