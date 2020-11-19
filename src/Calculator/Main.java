package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение c числами от 1 до 10. \n" +
                "Допускается использовать как арабские, так и римские цифры, но не вместе:");
        String expression = scanner.nextLine();

        String value[] = expression.replaceAll("\\s", "").split("[+|\\-*/]", 2);
        String operand = expression.replaceAll("[\\w\\s]", "");

        try {
          if (value[0].matches(".*[0-9].*") && value[1].matches(".*[0-9].*")) {
              System.out.println("Результат: " + Calculate.arab(value, operand));
          }
          if (!value[0].matches(".*[0-9].*") && value[0].matches(".*[IVXLCM]*")) {
              System.out.println("Результат: " + Calculate.rome(value, operand));
          }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неправильно набрано выражение");
        }
        scanner.close();
    }
}
