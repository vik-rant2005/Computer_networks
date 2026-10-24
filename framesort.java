import java.util.Scanner;

public class framesort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the number of frames ");
        n= sc.nextInt();
        int[] buffer = new int[n];
        System.out.println("Enter the frame Number");
        for (int i = 0; i < n; i++) {
            buffer[i]= sc.nextInt();

        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1-i ; j++) {
                if (buffer[j]>buffer[j+1]){
                    int temp=buffer[j];
                    buffer[j]=buffer[j+1];
                    buffer[j]=temp;

                }

            }

        }
        System.out.println("sorted buffer");
        for (int i = 0; i < n; i++) {
            System.out.print(buffer[i]+" ");

        }
    }
}
