import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите систему счисления(2, 8, 10, 16): ");
        String system = scanner.nextLine();
        System.out.print("Введите первое число: ");
        String a = scanner.nextLine();
        System.out.print("Введите действие(+, -, *, /): ");
        String deistv = scanner.nextLine();
        System.out.print("Введите второе число: ");
        String b = scanner.nextLine();

    }
}