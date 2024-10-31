import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        System.out.println(verificarServico(servico, partes));
        
        scanner.close();
    }
    
    
    public static String verificarServico(String servico, String [] listaServicos) {
      for(int i = 1; i <= listaServicos.length - 1; i++) {
        if (servico.equals(listaServicos[i])) {
          return "Sim";
        }
      }
      return "Nao";
    }
}