public class Translations {
        public static int dvToDes(String x) {
            return Integer.parseInt(x, 2);
        }
        public static int vsmToDes(String x){
            return Integer.parseInt(x, 8);
        }
        public static int shesToDes(String x){
            return Integer.parseInt(x, 16);
        }
        public static String desToDv(int x){ return Integer.toBinaryString(x); }
        public static String desToVsm(int x){
            return Integer.toOctalString(x);
        }
        public static String desToShes(int x){
            return Integer.toHexString(x);
        }
}
