import java.util.Scanner;

public class inverterCaractereEmString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string para ser invertida: ");
        String texto = scanner.nextLine();

        System.out.println("String invertida: " + inverteString(texto));

        scanner.close();
    }

    public static String inverteString(String string) {
        String stringInvertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }
        return stringInvertida;
    }
}