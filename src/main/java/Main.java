import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //iterative
        System.out.println("którą liczbę z ciągu Ci wyświetlić?");

        int x = scanner.nextInt();
        Long start0 = System.currentTimeMillis() / 1000;
        System.out.println("Liczba wynosi " + iterativeFibonacci(x));
        Long stop0 = System.currentTimeMillis() / 1000;
        System.out.println(stop0 - start0 + " sec");

        System.out.println("które liczby ciągu chcesz do siebie dodać?");
        int firstItFib = scanner.nextInt();
        System.out.println("oraz którą?");
        int secondItFib = scanner.nextInt();
        if ((firstItFib == 6 && secondItFib == 9) || (firstItFib == 9 && secondItFib == 6)) {
            System.out.println("jest to odpowiedź na \"Wielkie pytanie o życie, wszechświat i całą resztę\"");
        }
        System.out.println("Suma wynosi : " + new BigInteger(iterativeFibonacci(firstItFib))
                .add(new BigInteger(iterativeFibonacci(secondItFib))));


        //recursive
        System.out.println("którą liczbę z ciągu Ci wyświetlić?");

        int y = scanner.nextInt();
        Long start1 = System.currentTimeMillis() / 1000;
        System.out.println("Liczba wynosi " + recursiveFibonacci(y));
        Long stop1 = System.currentTimeMillis() / 1000;
        System.out.println(stop1 - start1 + " sec");

        System.out.println("które liczby ciągu chcesz do siebie dodać?");
        int firstRecFib = scanner.nextInt();
        System.out.println("oraz którą?");
        int secondRecFib = scanner.nextInt();
        if ((firstRecFib == 6 && secondRecFib == 9) || (firstRecFib == 9 && secondRecFib == 6)) {
            System.out.println("jest to odpowiedź na \"Wielkie pytanie o życie, wszechświat i całą resztę\"");
        }
        System.out.println("Suma wynosi : " + BigInteger.valueOf(Long.parseLong(iterativeFibonacci(firstRecFib)))
                .add(BigInteger.valueOf(Long.parseLong(iterativeFibonacci(secondRecFib)))));


    }

    private static String iterativeFibonacci(int number) {
        String[] fibonacciTab = new String[number + 2];
        if (number <= 1) {
            return String.valueOf(number);
        } else {
            fibonacciTab[0] = "0";
            fibonacciTab[1] = "1";
            for (int i = 2; i <= number; i++) {
                fibonacciTab[i] = String
                        .valueOf(new BigInteger(fibonacciTab[i - 1])
                                .add(new BigInteger(fibonacciTab[i - 2])));
            }

            return fibonacciTab[number];
        }

    }

    private static String recursiveFibonacci(int number) {
        // bad idea for use above 43

        if (number == 1 || number ==0) {
            return String.valueOf(number);

        }
        else{
        return String
                .valueOf(new BigInteger(recursiveFibonacci(number - 1))
                        .add(new BigInteger(recursiveFibonacci(number - 2))));

    }

    }
}
