package strategypattern;

/**
 * Strategy Interface
 * ------------------
 * This interface defines the common contract for all scoring algorithms.
 * 
 * In the Strategy Pattern, this represents the "Strategy".
 * 
 * Key Idea:
 * We do NOT care how the score is calculated.
 * We only care that every strategy provides a way to calculate a score.
 * 
 * Why is this important?
 * - It allows us to treat all strategies uniformly
 * - The context will depend on this interface, not concrete classes
 * - New strategies can be added without modifying existing code
 */
public interface ScoreStrategy {

    /**
     * This method defines the behavior that all strategies must implement.
     * 
     * @param data → represents the submission data (file, content, etc.)
     * @return a string representing the calculated score
     * 
     * Important:
     * Every concrete strategy will implement this method differently.
     */
    String calculateScore(String data);
}
