public class Main {
    public static void main(String[] args) {
        System.out.print("Esercizio 1\n");
        //stringaPariDispari
        String stringa = "Boh";
        boolean stringaPariDispari = stringaPariDispari(stringa);
        System.out.println(stringaPariDispari);
        //annoBisestile
        System.out.println(annoBisestile(2020));
        System.out.println(annoBisestile(2019));
    }

    //stringaPariDispari
    public static boolean stringaPariDispari(String string){
        return string.length() % 2 == 0;
    }
    //annoBisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}