import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        CheckCep checkCep = new CheckCep();

        System.out.println("Enter CEP to read: ");
        var cep = read.nextLine();

        try {
            Address newAddress = checkCep.addressSearch(cep);
            System.out.println(newAddress);
            FileGenerator generator = new FileGenerator();
            generator.jsonGenerator(newAddress);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finishing the application");
        }
    }
}
