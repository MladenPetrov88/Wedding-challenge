import java.util.Scanner;

public class WeddingChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b ; j++) {
                count++;
                if (count <= c) {
                    System.out.printf("(%d <-> %d) ", i, j);
                } else {
                    break;
                }
            }

        }
    }
}
