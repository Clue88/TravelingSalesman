import java.util.*;
public class Permute {
    public static void main(String[] args) {
        int num = 8;
        ArrayList<int[]> permutations = new ArrayList<int[]>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i) continue;
                for (int k = 0; k < num; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < num; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = 0; m < num; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            for (int n = 0; n < num; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) continue;
                                for (int o = 0; o < num; o++) {
                                    if (o == i || o == j || o == k || o == l || o == m || o == n) continue;
                                    for (int p = 0; p < num; p++) {
                                        if (p == i || p == j || p == k || p == l || p == m || p == n || p == o) continue;
                                        int[] permutation = {i, j, k, l, m, n, o, p};
                                        permutations.add(permutation);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        for (int[] permutation : permutations) {
            System.out.println(Arrays.toString(permutation));
        }
        System.out.println("Size: " + permutations.size());
    }
}
