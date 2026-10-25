
import java.util.Scanner;

public class bytestuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Data");
        String data = sc.nextLine();

        String result = "";
        int count = 0;

        for (int i = 0; i < data.length(); i++) {
            char bit = data.charAt(i);

            result += bit;

            if (bit == '1') {
                count++;
            } else {
                count = 0;
            }

            if (count == 5) {
                result += '0';
                count = 0;
            }
        }

        System.out.println("Stuffed data: " + result);
        sc.close();
    }
}

