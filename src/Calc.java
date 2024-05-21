public class Calc extends CalcActions {
    public static int Vichislenie(int a, String deistv, int b) {
            if (deistv.equals("+")) return Plus(a, b);
            else if (deistv.equals("-")) return Minus(a, b);
            else if (deistv.equals("*")) return Umn(a, b);
            else if (deistv.equals("/")) {
                if (b == 0) throw new IllegalArgumentException("На ноль делить нельзя!");
                return Del(a, b);
            }
            else throw new IllegalArgumentException("Некорректное действие!");
    }
}
