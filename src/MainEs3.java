import java.util.Scanner;

public class MainEs3 {
    public static void main(String[] args) {
        System.out.print("Esercizio 2\n");
        //while
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Inserisci una stringa o digita ':q' per uscire:");
            input = scanner.nextLine();
            if (!input.equals(":q")) {
                System.out.println(suddividiStringa(input));
            }
        } while (!input.equals(":q"));
    }
    //while
    public static String suddividiStringa(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            if (i < input.length() - 1) {
                output.append(",");
            }
        }
        return output.toString();
    }
}