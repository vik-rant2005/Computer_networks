
import java.util.Scanner;

public class framesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of frames:");
        int n = sc.nextInt();

        int[] buffer = new int[n];

        System.out.println("Enter the frame numbers:");
        for (int i = 0; i < n; i++) {
            buffer[i] = sc.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (buffer[j] > buffer[j + 1]) {
                    int temp = buffer[j];
                    buffer[j] = buffer[j + 1];
                    buffer[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted buffer:");
        for (int i = 0; i < n; i++) {
            System.out.print(buffer[i] + " ");
        }

        sc.close();
    }
}
