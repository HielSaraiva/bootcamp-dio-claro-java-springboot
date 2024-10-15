package apps;

import entities.Iphone;

public class App {
   public static void main(String[] args) {

      Iphone myIphone = new Iphone("15 Pro Max");

      System.out.println(myIphone.getMarca());
      System.out.println(myIphone.getModelo());
      System.out.println(myIphone.getMusicaTocando());

      myIphone.ligar("(__) 9____-____");
      myIphone.atender();
      myIphone.iniciarCorreioVoz();

      myIphone.exibirPagina("github.com/HielSaraiva");
      myIphone.adicionarNovaAba();
      myIphone.atualizarPagina();

      myIphone.tocar();
      myIphone.pausar();
      myIphone.selecionarMusica("Melissa");
   }
}
