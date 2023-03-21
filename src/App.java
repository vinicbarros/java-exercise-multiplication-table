public class App {
    public static void main(String[] args) throws Exception {
        final int number = 7;
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + number + " = " + number * i);
        }
    }
}
