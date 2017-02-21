import java.util.Scanner;

/**
 * Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
 * Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых числа:
 * N — достоинство (6 ≤ N ≤ 14) * и M — масть карты (1 ≤ M ≤ 4).
 * Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 */
public class Cards_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suit = 0;
        int senjor = 0;
        System.out.print("ввести маст int 1..4 =\t");
        suit = scan.nextInt();
        System.out.print("ввести достоинство карты int 6-14\t");
        senjor = scan.nextInt();

        String suitName = "";
        String senjorName = "";
        switch (suit) {
            case 1:suitName = "пик";
                break;
            case 2:suitName = "треф";
                break;
            case 3:suitName = "бубей";
                break;
            case 4:suitName = "червей";
                break;
        }

        switch (senjor) {
            case 6: senjorName = "Шестерка";
                break;
            case 7: senjorName = "Семерка";
                break;
            case 8: senjorName = "Восемь";
                break;
            case 9: senjorName = "Девять";
                break;
            case 10: senjorName = "Десять";
                break;
            case 11: senjorName = "Валет";
                break;
            case 12: senjorName = "Дама";
                break;
            case 13: senjorName = "Король";
                break;
            case 14: senjorName = "Туз";
                break;
        }
        System.out.println("Вы вытянули :\t"+senjorName+" "+suitName);
    }
}
