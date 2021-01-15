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

        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }

        s.close();
    }
}
