import java.util.Scanner;

public class FactorialCalculator {
    public static int factorialOf(int i){
        int result = 1;
        for(int x = 1; x <= i; x++){
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while(i > -1) {
            System.out.println(FactorialCalculator.factorialOf(i));
            i = s.nextInt();
        }
    }
};

