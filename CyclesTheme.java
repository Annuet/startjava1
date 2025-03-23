public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int a1 = -10;
        int ach = 0;
        int anech = 0;
        while (a1 <= 21){
            if (a1 % 2 ==0){
                ach += a1;
            } else {
                anech += a1;
            }
            a1++;
        }
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + ach + ", а нечетных = " + anech);
        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        int b1 = 10;
        int b2 = 5;
        int b3 = -1;
        int bmin = 0;
        int bmax = 0;
        if (b1 >= b2 && b1 >= b3) {
            bmax = b1;
            if (b2 >= b3) {
                bmin = b3;
            } else {
                bmin = b2;
            }
        } else if (b2 >= b1 && b2 >= b3) {
            bmax = b2;
            if (b1 >= b3) {
                bmin = b3;
            } else {
                bmin = b1;
            }
        } else {
            bmax = b3;
            if (b1 >= b2) {
                bmin = b2;
            } else {
                bmin = b1;
            }
        }
        for (int i = bmin; i < bmax; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(bmax);
        System.out.println("\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        int c = 1234;
        int csum = 0;
        while (c !=0) {
            System.out.print(c % 10);
            csum += c % 10;
            c = c / 10;
        }
        System.out.println("\n" + csum);
        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int d1 = 1;
        int d2 = 30;
        for (int i = d1; i < d2; i = i + 5) {
            for (int j = i; j < i + 5; j++) {
                if (j < d2){
                    System.out.printf("%4d", j);
                } else {
                    System.out.printf("%4d",0);
                }
            }
            System.out.println();
        }
        System.out.println("\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        int e = 3242592;
        System.out.print("В " + e + " ");
        int ecount = 0;
        while (e != 0) {
            if (e % 10 == 2) {
                ecount++;
            }
            e = e / 10;
        }
        if (ecount % 2 == 1) {
            System.out.print("не");
        }
        System.out.println("четное (" + ecount + ") количество двоек");
        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        int f1 = 5;
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < f1 * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int f2 = f1;
        while (f2 > 0) {
            int f3 = f2;
            while (f3 > 0) {
                System.out.print("#");
                f3--;
            }
            System.out.println();
            f2--;
        }
        System.out.println();
        f2 = 0;
        int f3 = 0;
        do {
            f2++;
            if (f2 * 2 < f1 + 2) {
                f3++;
            } else if (f2 * 2 > f1 + 2) {
                f3--;
            }
            int f4 = 0;
            do {
                System.out.print("$");
                f4++;
            } while (f4 < f3);
            System.out.println();
        } while (f2 < f1);
        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.printf("%7s","DECIMAL");
        System.out.printf("%10s","CHARACTER");
        System.out.printf("%12s","DESCRIPTION");
        System.out.println();
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d",i);
                char gchar = (char) i;
                System.out.printf("%10s","'" + gchar+ "'");
                System.out.printf("%5s"," ");
                System.out.printf("%-1s", Character.getName(i));
                System.out.println();
            }
        }
        System.out.println("\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        int h = 52325;
        System.out.print("Число " + h + " - ");
        while (h > 10) {
            int h1 = h % 10;
            int h2 = h;
            int h3 = 1;
            while (h2>10) {
                h2 = h2 / 10;
                h3 = h3 * 10;
            }
            if (h1 == h / h3) {
                h = h % (h3 * h1);
                h = h / 10;
            } else {
                System.out.print(" не");
                break;
            }
        }
        System.out.println(" являетя палиндромом");
        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        int g = 123315;
        int gs1 = 0;
        int gsn1 = 0;
        int gsn2 = 0;
        int gs2 = 0;
        System.out.print("Число " + g + " - ");
        for (int i = 0; i < 3; i++) {
            gs1 = gs1 + g % 10;
            gsn1 = gsn1 * 10 + g % 10;
            g = g / 10;
        }
        for (int i = 0; i < 3; i++) {
            gs2 = gs2 + g % 10;
            gsn2 = gsn2 * 10 + g % 10;
            g = g / 10;
        }
        if (gs1 != gs2) {
            System.out.print("не");
        }
        System.out.println("счастливое");
        System.out.println("Сумма цифр " + gsn1 + " = " + gs1);
        System.out.println("Сумма " + gsn2 + " = " + gs2);
        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");
        int x1 = 9;
        for (int i = 0; i <= x1; i++) {
            for (int j = 0; j <= x1; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%s", "  ");
                } else if (i == 1 && j == 1) {
                    System.out.printf("%s", "+");
                } else if (i == 1) {
                    System.out.printf("%3s", "---");
                } else if (j == 1) {
                    System.out.printf("%2s", "|");
                } else if (i == 0) {
                    System.out.printf("%3d", j);
                } else if (j == 0) {
                    System.out.printf("%2d", i);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}