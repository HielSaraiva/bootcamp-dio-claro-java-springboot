package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

   @Autowired
   private Calculadora calculadora;

   @Override
   public void run(String... args) throws Exception {
      Calculadora calculadora = new Calculadora();

		System.out.println("o resultado é " + calculadora.somar(4, 12));
   }
}
