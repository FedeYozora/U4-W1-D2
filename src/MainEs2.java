public class MainEs2 {
    public static void main(String[] args) {
        System.out.print("Esercizio 2\n");
        //switch
        int intero = 3;
        String switchEs = switchEs(intero);
    }
    //switch
    public static String switchEs(int intero){
        switch (intero) {
            default : {
                System.out.println("Il numero é fuori dall'intervallo tra 0 e 3");
                break;
            }
            case 0, 1, 2, 3: {
                System.out.println(intero);
                break;
            }
        }
        return null;
    }
    }

