import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int number1 = 47;
        int number2 = 13;
        int division = number1 / number2;
        int divisionWithRemainder = number1 % number2;
        System.out.println(division + " " + divisionWithRemainder);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number1 = 47;
        int number2 = number1 / 10;
        int number3 = number1 % 10;
        int sum = number2 + number3;
        System.out.println(sum);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int number1 = 345;
        int number2 = number1 / 100;
        int number3 = number1 / 10 % 10;
        int number4 = number1 % 100 % 10;
        ;
        int sum = number2 + number3 + number4;
        System.out.println(sum);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int priceChamomile = 4899;
        int pricePostcard = 157;
        int percent = 10;
        int buy = priceChamomile + pricePostcard;
        float saleBuy = buy - (buy / 100f * percent);
        System.out.printf("Всего потратили %d , скидка была %.2f", buy, saleBuy);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int priceOrangeKilogramms = 73;
        int priceBananaKilogramms = 95;
        int saleOrangePercent = 15;
        int weightOrange = 2;
        int priceOrange2 = priceOrangeKilogramms * weightOrange;
        priceOrange2 -= priceOrange2 / 100 * saleOrangePercent;
        int sum = priceBananaKilogramms + priceOrange2;
        System.out.println(sum);
        int priceChampagne = 2870;
        int priceBread = 27;
        int saleChampangePercent = 50;
        int amountChampange = 7;
        int priceChampange2 = priceChampagne * amountChampange;
        priceChampange2 -= priceChampange2 / 100 * saleChampangePercent;
        int sum2 = priceChampange2 + priceBread;
        System.out.println(sum2);
        float priceChampignon = 436;
        float priceWhiteMushroom = 578;
        int saleWhiteMushroomPercent = 5;
        float weightChampignon = 2.5f;
        float weightWhiteMushroom = 3.75f;
        priceChampignon *= weightChampignon;
        System.out.println(priceChampignon);
        float priceWhiteMushroomK = priceWhiteMushroom * weightWhiteMushroom;
        System.out.println(priceWhiteMushroomK);
        priceWhiteMushroomK -= priceWhiteMushroomK / 100 * saleWhiteMushroomPercent;
        System.out.println(priceWhiteMushroomK);
        float sum3 = priceChampignon + priceWhiteMushroomK;
        System.out.printf("Сумма со скидкой равна %.2f", sum3);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        double a = 0.40;
        double b = 0.87;
        double c = 11f * a + b;
        double d = (a + 10f * b) - 15f * (a / b);
        System.out.printf("%.2f", c);
        System.out.println();
        System.out.printf("%.2f", d);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 2;
        if (a % 2 == 0 && a != 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        float p = 7.13f;
        float d = 11.33f;
        int ten = 10;
        if (p < 10) {
            p = ten - p;
        } else {
            p = p - ten;
        }
        if (d < 10) {
            d = ten - d;
        } else {
            d = d - ten;
        }
        if (p > d) {
            System.out.println(p);
        } else {
            System.out.println(d);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int a = ThreadLocalRandom.current().nextInt(3, 156);
        if (a >= 22 && a <= 99) {
            System.out.println("Число " + a + " попало в интервал (22;99).");
        } else {
            System.out.println("Число " + a + " не попало в интервал (22;99).");
        }
    }
    //        int min = 3;
//        int max = 158;
//        int difference = max - min;
//        for (int i = 0; i <= 10; i++) {
//            Random random = new Random(min);
//            int a = random.nextInt(difference + i);
//            if (a > 22 && a < 99)
//            System.out.println(a);
//        }

    public static void task10() {
        System.out.println("Задача 10");
        int a = ThreadLocalRandom.current().nextInt(0, 999);
        System.out.println(a);
        int b = a / 100;
        int c = a / 10 / 10;
        int d = a / 10 % 9;
        if (b > c && b > d) {
            System.out.println(b);
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }

    public static void task11() {
        System.out.println("Задача 11");
        int a = 351;
        int b = -4214;
        int c = -1001;
        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%d, %d, %d", c, b, a);
            } else {
                System.out.printf("%d, %d, %d", b, c, a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%d, %d, %d", c, a, b);
            } else {
                System.out.printf("%d, %d, %d", a, c, b);
            }
        } else {
            if (b > a) {
                System.out.printf("%d, %d, %d", a, b, c);
            } else {
                System.out.printf("%d, %d, %d", b, a, c);
            }
        }
        System.out.println();
    }

    public static void task12() {
        System.out.println("Задача 12");
        int currentTime = ThreadLocalRandom.current().nextInt(28001);
        int secondAll = 28800;
        int secondEnd = secondAll - currentTime;
        int hoursEnd = Math.round(secondEnd / (60 * 60));
        System.out.println(secondEnd);
        System.out.println(hoursEnd);
    }
    //        int startWorkDay = 8;
//        int endWorkDay = 16;
//        int differnceWorkDay = endWorkDay - startWorkDay;
//        int totalSec = 28800;
//        int secHour = 60 * 60;
//        int total = 0;
//        if (total > 0 && total <= 28800) {
//            int timeHour = total / secHour;
//            int endTime = differnceWorkDay - timeHour;
//            System.out.println(endTime);
//            int endSec = totalSec - total;
//            System.out.println(endSec);
//        }
//        System.out.println("-");

    public static void task13() {
        System.out.println("Задача 13");
        int number = 1000;
        int divider = 4;
        int quantity = 5;
        while (quantity > 0) {
            if (number % divider == 0) {
                System.out.println(number);
                quantity--;
            }
            number++;
        }
    }

    //        int a = 0;
//        int c = 0;
//        for (int i = 0; i < 100; i++) {
//            a = i + 1000;
//            int b = a % 4;
//            if (b == 0){
//                c += 1;
//                System.out.println(a);
//            }
//            if (c == 5) {
//                break;
//            }
//        }
    public static void task14() {
        System.out.println("Задача 14");
        int a = 1;
        int i = 10;
        do {
            System.out.println(a);
            a += 2;
            i--;
        } while (i > 0);
    }

    public static void task15() {
        System.out.println("Задача 15");
        int number = 90;
        int step = 5;
        do {
            System.out.println(number);
            number -= step;
        } while (number >= 0);
    }

    public static void task16() {
        System.out.println("Задача 16");
        int number = 2;
        int step = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number);
            number *= step;
        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        int saturday = 1;
        int sunday = saturday + 1;
        int month = 30;
        int week = 7;
        for (int i = 0; i <= month; i++) {
            if ((i + week) % week == saturday || (i + week) % week == sunday) {
                System.out.println(i);
            }
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        int start = 1;
        int end = 999999;
        int amount = 0;
        for (int i = start; i <= end; i++) {
            int sum1 = 0;
            int sum2 = 0;
            int number1 = i / 1000;
            int number2 = i % 1000;
            while (number1 != 0) {
                sum1 += number1 % 10;
                number1 /= 10;
            }
            while (number2 != 0) {
                sum2 += number2 % 10;
                number2 /= 10;
            }
            if (sum1 == sum2) {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public static void task19() {
        System.out.println("Задача 19");
        int[] rack = {12, 9, 11, 10};
        int sum = 0;
        for (int element : rack) {
            sum = sum + element;
            System.out.println(sum);
        }
    }

}

