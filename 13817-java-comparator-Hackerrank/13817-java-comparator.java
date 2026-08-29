import java.util.*;

// Your Checker class
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // If scores are the same, sort alphabetically by name
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        // Otherwise, sort in decreasing order of score
        return b.score - a.score;
    }
}

// The Player class HackerRank expects
class Player {
    String name;
    int score;
    
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// The Solution stub code to handle inputs and outputs
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
 
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna