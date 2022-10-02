import java.util.Objects;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("введите выражение: ");
        String str = sc.nextLine();
        sc.close();
        char s = symbol(str);
        String s1;
        int length = str.length();
        int i1 = 0;
        int j1 = 0;
        int i = 0;
        int j = 0;
        int index = str.indexOf(s);

        String firstPart = str.substring(0, index);
        String secondPart = str.substring(index + 1, length);

        Rim rim1 = Rim.I;
        String first1 = rim1.getName();
        Rim rim2 = Rim.II;
        String second1 = rim2.getName();
        Rim rim3 = Rim.III;
        String third1 = rim3.getName();
        Rim rim4 = Rim.IV;
        String fourth1 = rim4.getName();
        Rim rim5 = Rim.V;
        String fifth1 = rim5.getName();
        Rim rim6 = Rim.VI;
        String sixth1 = rim6.getName();
        Rim rim7 = Rim.VII;
        String seventh1 = rim7.getName();
        Rim rim8 = Rim.VIII;
        String eighth1 = rim8.getName();
        Rim rim9 = Rim.IX;
        String ninth1 = rim9.getName();
        Rim rim10 = Rim.X;
        String tenth1 = rim10.getName();

        try {
            if (Objects.equals(firstPart.trim(), first1)) {
                i = rim1.getI();
            } else if (Objects.equals(firstPart.trim(), second1)) {
                i = rim2.getI();
            } else if (Objects.equals(firstPart.trim(), third1)) {
                i = rim3.getI();
            } else if (Objects.equals(firstPart.trim(), fourth1)) {
                i = rim4.getI();
            } else if (Objects.equals(firstPart.trim(), fifth1)) {
                i = rim5.getI();
            } else if (Objects.equals(firstPart.trim(), sixth1)) {
                i = rim6.getI();
            } else if (Objects.equals(firstPart.trim(), seventh1)) {
                i = rim7.getI();
            } else if (Objects.equals(firstPart.trim(), eighth1)) {
                i = rim8.getI();
            } else if (Objects.equals(firstPart.trim(), ninth1)) {
                i = rim9.getI();
            } else if (Objects.equals(firstPart.trim(), tenth1)) {
                i = rim10.getI();
            } else {
                i = Integer.parseInt(firstPart.trim());
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception ");
        }


        try {
            if (Objects.equals(secondPart.trim(), first1)) {
                j = rim1.getI();
            } else if (Objects.equals(secondPart.trim(), second1)) {
                j = rim2.getI();
            } else if (Objects.equals(secondPart.trim(), third1)) {
                j = rim3.getI();
            } else if (Objects.equals(secondPart.trim(), fourth1)) {
                j = rim4.getI();
            } else if (Objects.equals(secondPart.trim(), fifth1)) {
                j = rim5.getI();
            } else if (Objects.equals(secondPart.trim(), sixth1)) {
                j = rim6.getI();
            } else if (Objects.equals(secondPart.trim(), seventh1)) {
                j = rim7.getI();
            } else if (Objects.equals(secondPart.trim(), eighth1)) {
                j = rim8.getI();
            } else if (Objects.equals(secondPart.trim(), ninth1)) {
                j = rim9.getI();
            } else if (Objects.equals(secondPart.trim(), tenth1)) {
                j = rim10.getI();
            } else {
                j = Integer.parseInt(secondPart.trim());
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
        }

        if (i > 0 & i < 11 & j > 0 & j < 11) {
            i1 = i;
            j1 = j;
        } else {
            throw new Exception();
        }

        int op = operation(i1, j1, s);

        if ((firstPart.trim().contains("I") | firstPart.trim().contains("II") | firstPart.trim().contains("III") | firstPart.trim().contains("IV")
                | firstPart.trim().contains("V") | firstPart.trim().contains("VI") | firstPart.trim().contains("VII") | firstPart.trim().contains("VIII")
                |firstPart.trim().contains("IX") | firstPart.trim().contains("X")) & (secondPart.trim().contains("I") | secondPart.trim().contains("II")
                | secondPart.trim().contains("III") | secondPart.trim().contains("IV") | secondPart.trim().contains("V") | secondPart.trim().contains("VI")
                | secondPart.trim().contains("VII") | secondPart.trim().contains("VIII") | secondPart.trim().contains("IX") | secondPart.trim().contains("X"))) {
            if (op < 0) {
                throw new Exception("5");
            } else {
                s1 = Num(op);
                System.out.println("Ответ:" + s1);
            }
        } else if (((firstPart.trim().contains("I") | firstPart.trim().contains("II") | firstPart.trim().contains("III") | firstPart.trim().contains("IV")
                | firstPart.trim().contains("V") | firstPart.trim().contains("VI") | firstPart.trim().contains("VII") | firstPart.trim().contains("VIII")
                |firstPart.trim().contains("IX") | firstPart.trim().contains("X"))) & ((j == 1 | j == 2 | j == 3 | j == 4 |j == 5 | j == 6 |j == 7 | j == 8 | j == 9 | j == 10 ))
                | ((secondPart.trim().contains("I") | secondPart.trim().contains("II")
                | secondPart.trim().contains("III") | secondPart.trim().contains("IV") | secondPart.trim().contains("V") | secondPart.trim().contains("VI")
                | secondPart.trim().contains("VII") | secondPart.trim().contains("VIII") | secondPart.trim().contains("IX") | secondPart.trim().contains("X"))
                & (i == 1 | i == 2 | i == 3 | i == 4 |i == 5 | i == 6 |i == 7 | i == 8 | i == 9 | i == 10))) {
            throw new Exception("1");
        } else {
            int op1 = operation(i1, j1, s);
            System.out.println("Ответ: " + op1);
        }
    }

    static String Num(int op) throws Exception {
        String[] roman = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        final String s1 = roman[op];
        if (s1.equals("0")){
            throw new Exception("2");
        } else
            return s1;
    }


    static int operation(int i1, int j1, char s) throws Exception {

        int op = 0;
        if (s == '+') {
            op = i1 + j1;
        }
        if (s == '-') {
            op = i1 - j1;
        }
        if (s == '*') {
            op = i1 * j1;
        }
        if (s == '/') {
            op = i1 / j1;
        }
        return op;
    }



    static char symbol(String str) throws Exception {
        char sym = 0;
        if (str.contains("+")) {
            sym = '+';
            return sym;
        }
        if (str.contains("-")) {
            sym = '-';
            return sym;
        }
        if (str.contains("*")) {
            sym = '*';
            return sym;
        }
        if (str.contains("/")) {
            sym = '/';
            return sym;
        } else {
            throw new Exception("3");
        }
    }
}
