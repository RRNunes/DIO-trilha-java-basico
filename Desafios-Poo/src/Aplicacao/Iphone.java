package Aplicacao;

import java.util.Scanner;

import Incerfaces.AparelhoTelefonico;
import Incerfaces.NavegadorInternet;
import Incerfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void atender() {
        System.out.println("Fazendo ligacao...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
        
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
        
    }

    @Override
    public void exibirPaagina() {
        System.out.println("Exibindo pagina..");
        
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;
        do {
            System.out.println("Selecione uma opcao no menu: \n" + "1- Fazer ligacao \n" + "2- Atender Ligacao \n "+
            "3- Iniciar correio de voz \n" + "4- Selecionar musica \n" + "5- Tocar Musica \n" + "6- Pausar musica" + 
            "7- Exibir pagina no navegador \n" + "8- Abrir nova aba \n" + "9- Atualizar pagina \n" + "0- Finalizar");

            opcao = leitor.nextInt();

            switch (opcao) {
            case 1:
                iphone.ligar();
                break;
            case 2:
                iphone.atender();
                break;
            case 3:
                iphone.iniciarCorreioVoz();
                break;
            case 4:
                iphone.selecionarMusica();
                break;
            case 5:
                 iphone.tocar();
                break;
            case 6:
                iphone.pausar();
                break;
            case 7:
                iphone.exibirPaagina();
                break;
            case 8:
                iphone.adicionarNovaAba();
                break;
            case 9:
                iphone.atualizarPagina();
                break;
                case 0:
                    System.out.println("Finalizar...");
                default:
                System.out.println("Digite umm numero de 0 a 9");
                    
            }

        } while (opcao != 0);
        leitor.close();
    }
}
