import java.util.Scanner;

public class leakybucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucketSize,outputrate,n;
        int bucket=0;
        System.out.println("Enter the bucket size");
        bucketSize= sc.nextInt();
        System.out.println("enter the output Rate");
        outputrate= sc.nextInt();
        System.out.println("enter the number of packets");
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the packet Size");
            int packet= sc.nextInt();

            if(bucket+packet<=bucketSize){
                bucket+=packet;
                System.out.println("Packet Accepted");
            }else{
                System.out.println("packet Denied!!");
            }
            if(bucket>=outputrate){
                bucket-=outputrate;
                System.out.println("units sent"+outputrate);
            }else{
                System.out.println(bucket+"units sent");
                bucket=0;
            }
            System.out.println("remaning in bucket"+bucket);
            
        }
        sc.close();
    }
}
