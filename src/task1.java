import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        float num;
        while (true) {
            try {
                scanner.hasNextFloat();
                num = scanner.nextFloat();
            } catch (Exception e){
                System.out.println("Введено неверное число");
                scanner.next();
                continue;
            }
            System.out.println("Ваше число: " + num);
        }
    }
}