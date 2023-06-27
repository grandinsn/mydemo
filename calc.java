import java.util.Scanner;
public class calc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите выражение  6 + 6 : ");
            String expression = scanner.nextLine();

            String[] parts = expression.split(" ");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Ошибка:  формат выражения неверный");
            }

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            char y = parts[1].charAt(0);

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Ошибка: Калькулятор должен принимать на вход числа от 1 до 10 включительно");
            }
            int x ;
            switch (y) {
                case '+':
                    x = a + b;
                    break;
                case '-':
                    x = a - b;
                    break;
                case '*':
                    x = a * b;
                    break;
                case '/':
                    if (a == 0) {
                        throw new IllegalArgumentException("Ошибка: деление на ноль");
                    }
                    x = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Ошибка: неверный оператор");
            }

            System.out.println(x);
        }
    }


