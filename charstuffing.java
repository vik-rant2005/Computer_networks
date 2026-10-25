import java.util.Scanner;

public class charstuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data =sc.nextLine();
        char FLAG='F';
        char ESC='E';
        String frame="F";
        for (int i = 0; i < data.length(); i++) {
            char ch=data.charAt(i);
            if(ch==FLAG || ch ==ESC){
                frame+=ESC;
            }
            frame+=ch;

        }
        frame+=FLAG;
        System.out.println("stuffed data"+frame);

    }
}
