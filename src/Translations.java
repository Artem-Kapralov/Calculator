public class Translations {
        public static int DvToDes(String x) {
            return Integer.parseInt(x, 2);
        }
        public static int VsmToDes(String x){
            return Integer.parseInt(x, 8);
        }
        public static int ShesToDes(String x){
            return Integer.parseInt(x, 16);
        }
        public static String DesToDv(int x){
            return Integer.toBinaryString(x);
        }
        public static String DesToVsm(int x){
            return Integer.toOctalString(x);
        }
        public static String DesToShes(int x){
            return Integer.toHexString(x);
        }
}
