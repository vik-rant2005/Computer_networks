import java.util.Scanner;

public class distacevector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cost =new int[n][n];
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
                if (cost[i][j] == -1) {
                    cost[i][j] = 999;
                }
                dist[i][j] = cost[i][j];
            }




        }
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if(cost[i][k]+cost[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }

                }

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Routing table of node" + i);
            for (int j = 0; j < n; j++) {
                System.out.println("Destination"+j+"cost"+dist[i][j]);

            }

        }

    }

}
