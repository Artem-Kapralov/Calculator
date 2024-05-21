public class Calc extends CalcActions {
    public static double Vichislenie(int a, String deistv, int b) {
        try {
            if (deistv == "+") return Plus(a, b);
            else if (deistv == "-") return Minus(a, b);
            else if (deistv == "*") return Umn(a, b);
            else if (deistv == "/") return Del(a, b);
            else throw new Exception("Некорректное действие!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }
    }
}
