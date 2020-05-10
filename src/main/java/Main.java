import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //program do obliczania ciągu Fibonacciego

        System.out.println("którą liczbę z ciągu Ci wyświetlić?");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Long start = System.currentTimeMillis() / 1000;

        System.out.println("Liczba wynosi " + fibonacci(x));


        Long stop = System.currentTimeMillis() / 1000;
        System.out.println(stop - start + " sec");

        System.out.println("które liczby ciągu chcesz do siebie dodać?");

        int firstFib = scanner.nextInt();
        System.out.println("oraz którą?");
        int secondFib = scanner.nextInt();
        if ((firstFib == 6 && secondFib == 9) || (firstFib == 9 && secondFib == 6)) {
            System.out.println("jest to odpowiedź na \"Wielkie pytanie o życie, wszechświat i całą resztę\"");
        }
        System.out.println("Suma wynosi : " + BigInteger.valueOf(Long.parseLong(fibonacci(firstFib)))
                .add(BigInteger.valueOf(Long.parseLong(fibonacci(secondFib)))));
    }

    private static String fibonacci(int number) {
        String[] fibonacciTab = new String[3];
        if (number == 0) {
            return "0";
        }
        if (number == 1 || number == 2) {
            return "1";
        } else {
            fibonacciTab[0] = "0";
            fibonacciTab[1] = "1";
            for (int i = 2; i <= number; i++) {
                fibonacciTab[2] = String
                        .valueOf(new BigInteger(fibonacciTab[0])
                                .add(new BigInteger(fibonacciTab[1])));
                fibonacciTab[0] = fibonacciTab[1];
                fibonacciTab[1] = fibonacciTab[2];
            }

            return fibonacciTab[2];
        }
    }
}
