package strategypattern;

/**
 * Concrete Strategy (Computer Science)
 * -----------------------------------
 * This class represents one specific scoring algorithm.
 * 
 * It implements the ScoreStrategy interface,
 * meaning it MUST provide its own version of calculateScore().
 * 
 * Responsibility:
 * - Define how CS submissions are evaluated
 * 
 * Design Principle:
 * - Single Responsibility Principle (SRP)
 *   This class ONLY handles CS scoring logic.
 */
public class CSScoreStrategy implements ScoreStrategy {

    /**
     * Implementation of the scoring algorithm for CS submissions.
     * 
     * @param data → submission content (not used here, but represents input)
     * @return scoring result
     */
    @Override
    public String calculateScore(String data) {
        // In real systems, logic would analyze correctness, plagiarism, etc.
        return "CS Score: based on correctness";
    }
}
