public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;//нужно заменить обращение к восьмому элементу массива, так как его нет
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
