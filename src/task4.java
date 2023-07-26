import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        if (str.isEmpty())
            throw new RuntimeException("Нельзя вводить пустые строки");
        System.out.println("Ваша строка: " + str);
    }
}

