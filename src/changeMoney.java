import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD: ");
        float usd = scanner.nextFloat();
        float vnd = usd * 23000;
        System.out.println("VND= " + vnd);
    }
}