import java.util.*;
public class TravelingSalesman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> places = new ArrayList<String>();
        int[][] grid = new int[8][8];
        while (s.hasNextLine()) {
            String[] words = s.nextLine().split(" ");
            if (places.indexOf(words[0]) == -1) places.add(words[0]);
            if (places.indexOf(words[2]) == -1) places.add(words[2]);

            grid[places.indexOf(words[0])][places.indexOf(words[2])] = Integer.parseInt(words[4]);
            grid[places.indexOf(words[2])][places.indexOf(words[0])] = Integer.parseInt(words[4]);
        }

        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            digits.add(i);
        }

        int shortest = Integer.MAX_VALUE;
        int sequence = 0;

        for (int i = 0; i < 100000; i++) {
            sequence = 0;
            Collections.shuffle(digits);
            for (int j = 0; j < digits.size() - 1; j++) {
                sequence += grid[digits.get(j)][digits.get(j+1)];
            }
            if (sequence < shortest) shortest = sequence;
        }

        // int shortest = Integer.MAX_VALUE;
        // int sequence = 0;
        // for (int i = 0; i < grid.length; i++) {
        //     for (int j = 0; j < grid.length; j++) {
        //         if (j == i) continue;
        //         for (int k = 0; k < grid.length; k++) {
        //             if (k == i || k == j) continue;
        //             for (int l = 0; l < grid.length; l++) {
        //                 if (l == i || l == j || l == k) continue;
        //                 for (int m = 0; m < grid.length; m++) {
        //                     if (m == i || m == j || m == k || m == l) continue;
        //                     for (int n = 0; n < grid.length; n++) {
        //                         if (n == i || n == j || n == k || n == l || n == m) continue;
        //                         for (int o = 0; o < grid.length; o++) {
        //                             if (o == i || o == j || o == k || o == l || o == m || o == n) continue;
        //                             for (int p = 0; p < grid.length; p++) {
        //                                 if (p == i || p == j || p == k || p == l || p == m || p == n || p == o) continue;
        //                                 sequence = grid[i][j] + grid[j][k] + grid[k][l] + grid[l][m] + grid[m][n] + grid[n][o] + grid[o][p];
        //                                 if (sequence < shortest) shortest = sequence;
        //                                 sequence = 0;
        //                             }
        //                         }
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        System.out.println(shortest);

        s.close();
    }
}
