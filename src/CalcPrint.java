public class CalcPrint {
    public static void calcPrint(int result){
        System.out.println("\nBIN: " + Translations.DesToDv(result));
        System.out.println("OCT: " + Translations.DesToVsm(result));
        System.out.println("DEC: " + result);
        System.out.println("HEX: " + Translations.DesToShes(result));
    }
}
