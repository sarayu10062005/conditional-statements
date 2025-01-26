public class Negate {
    public static void main(String[] args) {
        double n = 10;
        if (n > 0) {
            System.out.printf("The given number %.2f is Positive!", n);
        } else if (n == 0) {
            System.out.println("It is neutral!");
        } else {
            System.out.println(n + " is a Negative number!");
        }
    }
}
