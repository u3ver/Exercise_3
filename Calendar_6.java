import java.util.Scanner;

/**
 * В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов,
 * обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный.
 * В каждом подцикле годы носят названия животных:
 * крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи.
 * По номеру года определить его название, если 1984 год — начало цикла: «год зеленой крысы»
 */
public class Calendar_6 {
    public static void main(String[] args) {
        final int CYCLE = 60;
        final int START_YEAR = 1984;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год :\t");
        int yearNow = scan.nextInt();

        int nowCycle = (int)Math.ceil((Math.abs(START_YEAR - yearNow) % CYCLE) / 12.0);
        int yearCycle = (int) Math.ceil((Math.abs(START_YEAR - yearNow) % CYCLE) % 12);
//        System.out.println(nowCycle+"     "+yearCycle);


        String nowCycleName = "";
        switch (nowCycle) {
            case 1 :
                nowCycleName = "Зеленой ";
                break;
            case 2 :
                nowCycleName = "Красной ";
                break;
            case 3 :
                nowCycleName = "Желтой ";
                break;
            case 4 :
                nowCycleName = "Белой ";
                break;
            case 5 :
                nowCycleName = "Черной ";
                break;
        }

        String yearCycleNamed = "";
        switch (yearCycle) {
            case 1:
                yearCycleNamed = "крысы";
                break;
            case 2:
                yearCycleNamed = "коровы";
                break;
            case 3:
                yearCycleNamed = "тигра";
                break;
            case 4:
                yearCycleNamed = "зайца";
                break;
            case 5:
                yearCycleNamed = "дракона";
                break;
            case 6:
                yearCycleNamed = "змеи";
                break;
            case 7:
                yearCycleNamed = "лошади";
                break;
            case 8:
                yearCycleNamed = "змеи";
                break;
            case 9:
                yearCycleNamed = "обезьяны";
                break;
            case 10:
                yearCycleNamed = "курицы";
                break;
            case 11:
                nowCycleName = "собаки";
                break;
            case 12:
                yearCycleNamed = "свиньи";
                break;
        }
        System.out.println("Вы ввели год :\t"+yearNow +"\tэто год ---\t"+nowCycleName+yearCycleNamed);


    }
}
