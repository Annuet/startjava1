public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите простое выражение:");
        String s = System.console().readLine();
        int a1 = Integer.parseInt(s.split(" ") [0]);
        int a2 = Integer.parseInt(s.split(" ") [2]);
        char z = s.split(" ") [1].charAt(0);
        System.out.print(a1 + " " + z + " " + a2 + " = ");
        int res = 0;
        if (z == '+') {
            res = a1 + a2;
        } else if (z == '-') {
            res = a1 - a2;
        } else if (z == '*') {
            res = a1 * a2;
        } else if (z == '/') {
            res = a1 / a2;
        } else if (z == '%') {
            res = a1 % a2;
        } else if (z == '^') {
            res = 1;
            for (int i = 0; i < a2; i++) {
                res = res * a1;
            }
        }
        System.out.println(res);
    }
}