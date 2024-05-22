public class Calc extends CalcActions {
    public static int Vichislenie(int a, String deistv, int b) {
            if (deistv.equals("+")) return plus(a, b);
            else if (deistv.equals("-")) return minus(a, b);
            else if (deistv.equals("*")) return umn(a, b);
            else if (deistv.equals("/")) {
                if (b == 0) throw new IllegalArgumentException("На ноль делить нельзя!");
                return del(a, b);
            }
            else throw new IllegalArgumentException("Некорректное действие!");
    }
}
