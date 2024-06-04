package DesafioIPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Racionais - Jesus Chorou");

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}