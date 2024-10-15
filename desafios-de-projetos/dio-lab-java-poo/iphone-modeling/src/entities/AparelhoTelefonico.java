package entities;

public class AparelhoTelefonico {

   private String marca;
   private String modelo;

   public AparelhoTelefonico(String marca, String modelo) {
      this.marca = marca;
      this.modelo = modelo;
   }

   public String getMarca() {
      return marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void ligar(String numero) {
      System.out.println("Ligando para " + numero);
   }

   public void atender() {
      System.out.println("Atendendo a ligacao");
   }

   public void iniciarCorreioVoz() {
      System.out.println("Iniciando correio por voz");
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      AparelhoTelefonico other = (AparelhoTelefonico) obj;
      if (modelo == null) {
         if (other.modelo != null)
            return false;
      } else if (!modelo.equals(other.modelo))
         return false;
      return true;
   }

   @Override
   public String toString() {
      return "AparelhoTelefonico [marca=" + marca + ", modelo=" + modelo + "]";
   }
}
