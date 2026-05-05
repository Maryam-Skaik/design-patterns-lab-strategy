package strategypattern;

/**
 * Concrete Strategy (Design)
 * --------------------------
 * This class represents a different scoring algorithm.
 * 
 * It follows the same interface, but provides a completely different behavior.
 * 
 * Key Insight:
 * - Same method (calculateScore)
 * - Different implementation
 * 
 * This is what makes strategies interchangeable.
 */
public class DesignScoreStrategy implements ScoreStrategy {

    /**
     * Implementation of the scoring algorithm for Design submissions.
     */
    @Override
    public String calculateScore(String data) {
        // In real systems, this might evaluate UI/UX, creativity, layout, etc.
        return "Design Score: based UI/UX quality";
    }
}
