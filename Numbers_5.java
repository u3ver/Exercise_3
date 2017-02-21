import java.util.Scanner;

/**
 * Дано целое число в диапазоне 100–999.
 * Вывести строку-описание данного числа, например:
 * 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
 */
public class Numbers_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ведите Целое число 100..999 =\t");
        int num = scan.nextInt();
//        сотни
        int a = (int) num / 100;
//        десятки
        int b = 0;
        if (num - a * 100 >= 10) {
            b = (int)((num - a * 100) / 10);
        }
//        единицы
        int c = num % 10;
//         тестовый вывод разбора числа
//        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);

        String aStr = "";
        String bStr = "";
        String cStr = "";
        String fullStr = "";
        switch (a) {
            case 1:
                aStr = "Сто ";
                break;
            case 2:
                aStr = "Двесте ";
                break;
            case 3:
                aStr = "Триста ";
                break;
            case 4:
                aStr = "Четыреста ";
                break;
            case 5:
                aStr = "Пятьсот ";
                break;
            case 6:
                aStr = "Шестьсот ";
                break;
            case 7:
                aStr = "Семьсот ";
                break;
            case 8:
                aStr = "Восемьсот ";
                break;
            case 9:
                aStr = "Девятьсот ";
                break;
            case 0:
                aStr = " ";
                break;
        }

        switch (b) {
            case 1:
                switch (c) {
                    case 1:
                        cStr = "Одинадцать";
                        break;
                    case 2:
                        cStr = "Двенадцать";
                        break;
                    case 3:
                        cStr = "Тринадцать";
                        break;
                    case 4:
                        cStr = "Четырнадцать";
                        break;
                    case 5:
                        cStr = "Пятнадцать";
                        break;
                    case 6:
                        cStr = "Шестнадцать";
                        break;
                    case 7:
                        cStr = "Семнадцать";
                        break;
                    case 8:
                        cStr = "Восемнадцать";
                        break;
                    case 9:
                        cStr = "Девятнадцать";
                        break;
                    case 0:
                        cStr = "Десять";
                        break;
                }

            case 0:
                bStr = "";
                break;
            case 2:
                bStr = "Двадцать ";
                break;
            case 3:
                bStr = "Тридцать ";
                break;
            case 4:
                bStr = "Сорок ";
                break;
            case 5:
                bStr = "Пятьдесят ";
                break;
            case 6:
                bStr = "Шестьдесят ";
                break;
            case 7:
                bStr = "Семьдесят ";
                break;
            case 8:
                bStr = "Восемьдесят ";
                break;
            case 9:
                bStr = "Девяносто ";
                break;
        }
        if (b != 1) {
            switch (c) {
                case 1:
                    cStr = "Один";
                    break;
                case 2:
                    cStr = "Два";
                    break;
                case 3:
                    cStr = "Три";
                    break;
                case 4:
                    cStr = "Четыре";
                    break;
                case 5:
                    cStr = "Пять";
                    break;
                case 6:
                    cStr = "Шесть";
                    break;
                case 7:
                    cStr = "Семь";
                    break;
                case 8:
                    cStr = "Восемь";
                    break;
                case 9:
                    cStr = "Девять";
                    break;
                case 0:
                    cStr = "";
                    break;
            }
        }
        fullStr = aStr + bStr + cStr;
        System.out.println("Введено число :\t" + num);
        System.out.println(fullStr);
    }
}
