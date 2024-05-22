import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите систему счисления(2, 8, 10, 16): ");
            String system = scanner.nextLine();
            System.out.print("Введите первое число: ");
            String number1 = scanner.nextLine();
            if (system.equals("10") && number1.indexOf("0") == 0) throw new Exception("В десятичной системе счисления число не может начинаться с 0!");
            System.out.print("Введите действие(+, -, *, /): ");
            String deistv = scanner.nextLine();
            System.out.print("Введите второе число: ");
            String number2 = scanner.nextLine();
            if (system.equals("10") && number2.indexOf("0") == 0) throw new Exception("В десятичной системе счисления число не может начинаться с 0!");


            if (system.equals("2")) {
                int result = Calc.Vichislenie(Translations.dvToDes(number1), deistv, Translations.dvToDes(number2));
                CalcPrint.calcPrint(result);
            }
            else if (system.equals("8")) {
                int result = Calc.Vichislenie(Translations.vsmToDes(number1), deistv, Translations.vsmToDes(number2));
                CalcPrint.calcPrint(result);
            }
            else if (system.equals("10")) {
                int result = Calc.Vichislenie(Integer.parseInt(number1), deistv, Integer.parseInt(number2));
                CalcPrint.calcPrint(result);
            }
            else if (system.equals("16")) {
                int result = Calc.Vichislenie(Translations.shesToDes(number1), deistv, Translations.shesToDes(number2));
                CalcPrint.calcPrint(result);
            }
            else throw new Exception("Некорректная система исчисления!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}