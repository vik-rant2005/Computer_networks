import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String encryption="";
        String decryption="";
        System.out.println("Enter the data");
        String data=sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        for (int i = 0; i < data.length(); i++) {
            char ch= data.charAt(i);
            encryption+=(char)(key+ch);

        }
        System.out.println("Encrypted data"+ encryption);
        for (int i = 0; i < encryption.length(); i++) {
            char ch= encryption.charAt(i);
            decryption+=(char)(ch-key);

        }
        System.out.println("Decryption"+decryption);
        sc.close();
    }
}
