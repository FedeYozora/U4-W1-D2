public class MainEs4 {
    public static void main(String[] args) {
        System.out.print("Esercizio 4\n");
        //countdown
        int numero = 10;
        String countdown = countdown(numero);
    }
    //countdown
    public static String countdown(int numero){
    for (int i=numero; i >= 0; i--) {
        System.out.println(i);
    }
    return null;
    }
}
