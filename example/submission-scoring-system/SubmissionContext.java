package strategypattern;

/**
 * Context Class
 * -------------
 * This class uses a Strategy to perform its behavior.
 * 
 * IMPORTANT:
 * The context does NOT implement the scoring logic.
 * It delegates that responsibility to the strategy object.
 * 
 * Relationship:
 * Context HAS-A Strategy (composition)
 * NOT IS-A Strategy (no inheritance)
 */
public class SubmissionContext {

    /**
     * Reference to the strategy object.
     * 
     * This is the key to the Strategy Pattern:
     * The behavior is not inside this class,
     * it is injected from outside.
     */
    private ScoreStrategy strategy;

    /**
     * Constructor Injection
     * ---------------------
     * We require a strategy when creating the object.
     * 
     * Why?
     * - Ensures the context always has valid behavior
     * - Prevents null strategy usage
     */
    public SubmissionContext(ScoreStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Setter Method (Runtime Flexibility)
     * ----------------------------------
     * Allows changing the strategy while the program is running.
     * 
     * This is the most important feature of the Strategy Pattern.
     * 
     * Without this:
     * - behavior would be fixed (like Template Method)
     */
    public void setStrategy(ScoreStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Main Processing Method
     * ----------------------
     * This simulates handling a submission.
     * 
     * Notice:
     * - The context does NOT calculate the score itself
     * - It delegates the task to the strategy
     */
    public void process(String file) {

        // Step 1: Basic processing (common behavior)
        System.out.println("Processing file: " + file);

        // Step 2: Delegate scoring to the strategy
        String result = strategy.calculateScore(file);

        // Step 3: Output result
        System.out.println(result);
    }
}
