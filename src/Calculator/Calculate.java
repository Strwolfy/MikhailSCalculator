package Calculator;

public class Calculate {

    public static int arab(String[] values, String operand) {
        try {
            int value1 = Integer.parseInt(values[0]);
            int value2 = Integer.parseInt(values[1]);
            return operation(value1, value2, operand);
        } catch (NumberFormatException exception) {
            System.out.println("Неправильный формат данных");
        }
        return 0;
    }
    public static String rome(String[] values, String operand) {
        try {
            int value1 = Roman.valueOf(values[0]).toInt();
            int value2 = Roman.valueOf(values[1]).toInt();
            int operation = operation(value1, value2, operand);
            return ArabToRome.IntegerToRoman(operation);
        } catch (IllegalArgumentException exception) {
            System.out.println("Неправильное выражение");
        }
        return operand;
    }
    public static int operation(int val1, int val2, String operand) {
        switch (operand) {
            case "+": return val1 + val2;
            case "-": {
                if (val1 < val2) {
                    System.out.println("Выражение меньше нуля ");
                    break;
                }
                return val1 - val2;
            }
            case "*": return val1 * val2;
            default:
                try {
                    return val1 / val2;
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль");
                }
        }
        return 0;
    }
}
