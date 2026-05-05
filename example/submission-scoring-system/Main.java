package strategypattern;

/**
 * Client / Test Class
 * -------------------
 * This class demonstrates how the Strategy Pattern works in practice.
 * 
 * It shows:
 * - how to assign a strategy
 * - how to change it at runtime
 * - how the same object behaves differently
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Step 1: Create context with initial strategy
         * -------------------------------------------
         * We start with CS scoring strategy.
         */
        SubmissionContext context =
                new SubmissionContext(new CSScoreStrategy());

        // Execute behavior
        context.process("student.zip");

        System.out.println("----------------------------");

        /**
         * Step 2: Change strategy at runtime
         * ----------------------------------
         * Same object, different behavior
         */
        context.setStrategy(new DesignScoreStrategy());

        context.process("design.fig");

        System.out.println("----------------------------");

        /**
         * Step 3: Change strategy again
         */
        context.setStrategy(new BusinessScoreStrategy());

        context.process("report.docx");

        /**
         * Key Observation:
         * ----------------
         * - We used ONE context object
         * - Behavior changed multiple times
         * - No if-else
         * - No new context objects
         * 
         * This is the power of Strategy Pattern.
         */
    }
}
