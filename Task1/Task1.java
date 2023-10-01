package HWException2.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод
дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println(enterNum());
    }

    // Метод для ввода числа
    public static float enterNum() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean ok = true;
        float result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (ok) {
            try {
                result = Float.parseFloat(reader.readLine());
                ok = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число !");
            }

        }
        return result;
    }

}





