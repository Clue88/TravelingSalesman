import java.util.*;
public class Permute {
    public static void main(String[] args) {
        int num = 4;
        ArrayList<int[]> permutations = new ArrayList<int[]>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == i) continue;
                for (int k = 0; k < num; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < num; l++) {
                        if (l == i || l == j || l == k) continue;
                        int[] permutation = {i, j, k, l};
                        permutations.add(permutation);
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
