import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {

        Integer number;
        String agency;
        String clientName;
        double balance;

        Scanner input = new Scanner(System.in);

        System.out.println("Please, insert your name: ");
        clientName = input.nextLine();

        System.out.println("Insert your agency number: ");
        number = input.nextInt();
        input.nextLine();

        System.out.println("Insert your agency: ");
        agency = input.nextLine();

        System.out.println("Insert your balance: ");
        balance = input.nextDouble();

        System.out.println("Hello " + clientName + ", thanks for create an account at our bank, your agency is "
                + agency + ", account " + number + " and your balance " + balance + " is now available for withdrawal");

        input.close();
    }
}
