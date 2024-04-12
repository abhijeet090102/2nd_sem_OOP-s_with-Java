import java.util.Scanner;

class Fact_n {
    int fact1(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
class Fact{
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int am = st.nextInt();

        Fact_n obj = new Fact_n();
        int result = obj.fact1(am);
        System.out.println("Factorial of " + am + " is: " + result);
    }
}
