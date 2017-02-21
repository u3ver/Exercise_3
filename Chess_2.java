import java.util.Scanner;

/**
 * Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
 * (целые числа, лежащие в диапазоне 1–8).
 * Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
 */
public class Chess_2 {
    public static void main(String[] args) {
//          Прием координат
        Scanner scan = new Scanner(System.in);
        System.out.print("введите координаты (от 1 до 8) x1 =\t");
        int x1 = scan.nextInt();
        System.out.print("введите координаты (от 1 до 8) y1 =\t");
        int y1 = scan.nextInt();
        System.out.print("введите координаты (от 1 до 8) x2 =\t");
        int x2 = scan.nextInt();
        System.out.print("введите координаты (от 1 до 8) y2 =\t");
        int y2 = scan.nextInt();
//          проверка условий1

        if (x1 == x2 || y1 == y2) {
            System.out.println("Ладья имея координаты\t\t"+x1+":"+y1);
            System.out.println("может переместиться на\t\t"+x2+":"+y2);
        } else System.out.println("сюда Ладья не дойдет");;

    }
}
