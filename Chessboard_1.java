import java.util.Arrays;
import java.util.Scanner;

/**
 *      Даны координаты двух различных полей шахматной доски x1, y1, x2, y2
 *      (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания:
 *      «Данные поля имеют одинаковый цвет».
 */
public class Chessboard_1 {
    public static void main(String[] args) {
//        Разметили шахматную доску
        char[][] chess = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chess[i][j] = 'B';
                    } else chess[i][j] = 'W';
                } else if (i % 2 != 0)
                    if (j % 2 == 0) {
                        chess[i][j] = 'W';
                    } else chess[i][j] = 'B';

                System.out.print(chess[i][j] + " ");
            }
            System.out.print("\n");
        }
//          Прием координат
        Scanner scan = new Scanner(System.in);
        System.out.print("введите координаты (от 1 до 8) x1 =\t");
        int x1 = scan.nextInt()-1;
        System.out.print("введите координаты (от 1 до 8) y1 =\t");
        int y1 = scan.nextInt()-1;
        System.out.print("введите координаты (от 1 до 8) x2 =\t");
        int x2 = scan.nextInt()-1;
        System.out.print("введите координаты (от 1 до 8) y2 =\t");
        int y2 = scan.nextInt()-1;

//        Сравнение

        if (chess[x1][y1] == chess[x2][y2]) {
            System.out.println("Данные поля имеют одинаковый цвет");
        } else System.out.println("Разноцветные ячейки :-D");
    }
}

