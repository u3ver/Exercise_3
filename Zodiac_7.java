import java.util.Scanner;

/**
 * Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
 * Вывести знак Зодиака, соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3),
 * «Овен» (21.3–19.4), «Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6–22.7),
 * «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11),
 * «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
 */
public class Zodiac_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите День:\t");
        int day = scan.nextInt();
        System.out.print("Введите месяц:\t");
        int month = scan.nextInt();


        if (day >= 1 || day <= 31 || month >= 1 || month <= 12) {
            switch (month) {
//                Январь 31
                case 1:
                    if (day >= 20) {
                        System.out.println("Водолей");
                    } else {
                        System.out.println("Козерог");
                    }
                    break;
                case 2:
//                  Февраль 28
                    if (day <= 28) {
                        if (day >= 19) {
                            System.out.println("Рыбы");
                        } else {
                            System.out.println("Водолей");
                        }
                    } else System.out.println("Error: Out of Date");
                    break;
//                  Март 31
                case 3:
                    if (day <= 30) {
                        if (day >= 21) {
                            System.out.println("Овен");
                        } else {
                            System.out.println("Рыбы");
                        }
                    } else System.out.println("Error: Out of Date");
                    break;
//                  Апрель 30
                case 4:
                    if (day >= 20) {
                        System.out.println("Телец");
                    } else {
                        System.out.println("Овен");
                    }
                    break;
//                  Май 31
                case 5:
                    if (day >= 21) {
                        System.out.println("Близнецы");
                    } else {
                        System.out.println("Телец");
                    }
                    break;
//                  Июнь 30
                case 6:
                    if (day <= 30) {
                        if (day >= 22) {
                            System.out.println("Рак");
                        } else {
                            System.out.println("Близнецы");
                        }
                    } else System.out.println("Error: Out of Date");
                    break;
//                  Июль 31
                case 7:
                    if (day >= 23) {
                        System.out.println("Лев");
                    } else {
                        System.out.println("Рак");
                    }
                    break;
//                  Август 31
                case 8:
                    if (day >= 23) {
                        System.out.println("Дева");
                    } else {
                        System.out.println("Лев");
                    }
                    break;
//                  Сентябрь 30
                case 9:
                    if (day <= 30) {
                        if (day >= 23) {
                            System.out.println("Весы");
                        } else {
                            System.out.println("Дева");
                        }
                    } else System.out.println("Error: Out of Date");
                    break;
//                  Октябрь 31
                case 10:
                    if (day >= 23) {
                        System.out.println("Скорпион");
                    } else {
                        System.out.println("Весы");
                    }
                    break;
//                  Ноябрь 30
                case 11:
                    if (day <= 30) {
                        if (day >= 23) {
                            System.out.println("Стрелец");
                        } else {
                            System.out.println("Скорпион");
                        }
                    } else System.out.println("Error: Out of Date");
                    break;
//                  Декабрь 31
                case 12:
                    if (day >= 22) {
                        System.out.println("Козерог");
                    } else {
                        System.out.println("Стрелец");
                    }
                    break;
            }
        } else {
            System.out.println("Error: Out of Date");
        }
    }
}
