package entities;

import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical {

   private Boolean musicaTocando;

   public Iphone(String modelo) {
      super("Iphone", modelo);
      this.musicaTocando = false;
   }

   public Boolean getMusicaTocando() {
      return musicaTocando;
   }

   public void setMusicaTocando(Boolean musicaTocando) {
      this.musicaTocando = musicaTocando;
   }

   public void tocar() {
      if (musicaTocando == false) {
         System.out.println("Tocando musica");
         setMusicaTocando(true);
      } else {
         System.out.println("A musica ja esta tocando");
      }
   }

   public void pausar() {
      if (musicaTocando == false) {
         System.out.println("A musica ja esta pausada");
      } else {
         System.out.println("A musica foi pausada");
         setMusicaTocando(false);
      }
   }

   public void selecionarMusica(String musica) {
      System.out.println("A musica " + musica + " foi selecionada");
   }

   public void exibirPagina(String url) {
      System.out.println("A pagina " + url + " foi exibida");
   }

   public void adicionarNovaAba() {
      System.out.println("Uma nova aba do navegador foi adicionada");
   }

   public void atualizarPagina() {
      System.out.println("A pagina atual do navegador foi atualizada");
   }
}
