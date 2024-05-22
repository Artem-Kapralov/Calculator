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
                int result = Calc.Vichislenie(Translations.DvToDes(number1), deistv, Translations.DvToDes(number2));
                System.out.print("Ответ в двоичной системе счисления: " + Translations.DesToDv(result));
            }
            else if (system.equals("8")) {
                int result = Calc.Vichislenie(Translations.VsmToDes(number1), deistv, Translations.VsmToDes(number2));
                System.out.print("Ответ в восьмеричной системе счисления: " + Translations.DesToVsm(result));
            }
            else if (system.equals("10")) {
                int result = Calc.Vichislenie(Integer.parseInt(number1), deistv, Integer.parseInt(number2));
                System.out.print("Ответ в десятичной системе счисления: " + result);
            }
            else if (system.equals("16")) {
                int result = Calc.Vichislenie(Translations.ShesToDes(number1), deistv, Translations.ShesToDes(number2));
                System.out.print("Ответ в шестнадцатеричной системе счисления: " + Translations.DesToShes(result));
            }
            else throw new Exception("Некорректная система исчисления!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}