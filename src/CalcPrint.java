public class CalcPrint {
    public static void calcPrint(int result){
        System.out.println("\nBIN: " + Translations.desToDv(result));
        System.out.println("OCT: " + Translations.desToVsm(result));
        System.out.println("DEC: " + result);
        System.out.println("HEX: " + Translations.desToShes(result));
    }
}
