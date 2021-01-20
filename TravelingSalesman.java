import java.util.*;
public class TravelingSalesman {
    public static void main(String[] args) {
        ArrayList<String> userInput = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            userInput.add(s.nextLine());
        }
        s.close();

        ArrayList<String> places = new ArrayList<String>();

        for (int i = 0; i < userInput.size(); i++) {
            String[] words = userInput.get(i).split(" ");
            if (places.indexOf(words[0]) == -1) places.add(words[0]);
            if (places.indexOf(words[2]) == -1) places.add(words[2]);
        }

        int[][] grid = new int[places.size()][places.size()];
        for (int i = 0; i < userInput.size(); i++) {
            String[] words = userInput.get(i).split(" ");
            grid[places.indexOf(words[0])][places.indexOf(words[2])] = Integer.parseInt(words[4]);
            grid[places.indexOf(words[2])][places.indexOf(words[0])] = Integer.parseInt(words[4]);
        }

        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < places.size(); i++) {
            digits.add(i);
        }

        int shortest = Integer.MAX_VALUE;
        int sequence = 0;

        while (true) {
            sequence = 0;
            for (int j = 1; j < digits.size(); j++) {
                if (digits.subList(0, j).contains(digits.get(j))) {
                  sequence = Integer.MAX_VALUE;
                  break;
                }
                sequence += grid[digits.get(j - 1)][digits.get(j)];
            }
            if (sequence < shortest) shortest = sequence;
            int i;
            for (i = 1; i <= digits.size() && digits.get(digits.size() - i) >= digits.size() - 1; i++) {
              digits.set((digits.size() - i) , 0);
            }
            if(i <= digits.size()) {
              digits.set((digits.size() - i) , digits.get(digits.size() - i) + 1);
            } else {
              break;
            }
        }

        System.out.println(shortest);

        s.close();
    }
}
