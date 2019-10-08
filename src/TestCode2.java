import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCode2 {
    public static void main(String args[]) {
        List<Integer> lister = new ArrayList<>(Arrays.asList(new Integer[]{6, 18, 8, 14, 10, 12, 18, 9}));
        System.out.println(teamFormation(lister, 8, 3));
    }

    public static long teamFormation(List<Integer> score, int team_size, int k) {
        // Write your code here
        int sum = 0;

        for (int j=0; j<team_size; j++) {
            int scoreSize = score.size();
            int actualK = k;
            if (k > scoreSize) {
                actualK = scoreSize;
            }

            int maxScore = score.get(0);
            int maxScoreIndex = 0;
            int newScore;

            for (int i=0; i<actualK; i++) {
                newScore = score.get(i);
                if (newScore > maxScore) {
                    maxScore = newScore;
                    maxScoreIndex = i;
                }
                if (actualK == k) {
                    int scoreIndex = scoreSize - k + i;
                    newScore = score.get(scoreIndex);
                    if (newScore > maxScore) {
                        maxScore = newScore;
                        maxScoreIndex = scoreIndex;
                    }
                }
            }

            // Run only if k is less than number of scores
            if (actualK == k) {
                for (int i=score.size()-actualK; i<score.size(); i++) {
                    newScore = score.get(i);
                    if (newScore > maxScore) {
                        maxScore = newScore;
                        maxScoreIndex = i;
                    }
                }
            }

            sum += maxScore;
            score.remove(maxScoreIndex);
        }

        return sum;
    }
}
