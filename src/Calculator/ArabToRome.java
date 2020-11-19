package Calculator;

public class ArabToRome {
    public static String IntegerToRoman(int input) {
        if (input < 1 || input > 3999)
            return "Неправильное романское число";
        StringBuilder string = new StringBuilder();
        while (input >= 1000) {
            string.append("M");
            input -= 1000;
        }
        while (input >= 900) {
            string.append("CM");
            input -= 900;
        }
        while (input >= 500) {
            string.append("D");
            input -= 500;
        }
        while (input >= 400) {
            string.append("CD");
            input -= 400;
        }
        while (input >= 100) {
            string.append("C");
            input -= 100;
        }
        while (input >= 90) {
            string.append("XC");
            input -= 90;
        }
        while (input >= 50) {
            string.append("L");
            input -= 50;
        }
        while (input >= 40) {
            string.append("XL");
            input -= 40;
        }
        while (input >= 10) {
            string.append("X");
            input -= 10;
        }
        while (input >= 9) {
            string.append("IX");
            input -= 9;
        }
        while (input >= 5) {
            string.append("V");
            input -= 5;
        }
        while (input >= 4) {
            string.append("IV");
            System.out.println("тут 4");
            input -= 4;
        }
        while (input >= 1) {
            string.append("I");
            System.out.println("тут 1");
            input -= 1;
        }
        return string.toString();
    }
}
