package strategypattern;

/**
 * Concrete Strategy (Business)
 * ----------------------------
 * Another independent scoring algorithm.
 * 
 * Important:
 * - This class is completely independent of other strategies
 * - It can be added, removed, or modified without affecting the system
 */
public class BusinessScoreStrategy implements ScoreStrategy {

    /**
     * Implementation of the scoring algorithm for Business submissions.
     */
    @Override
    public String calculateScore(String data) {
        // In real systems, this may analyze structure, clarity, references, etc.
        return "Business Score: based on structure and citations";
    }
}
