public class HelloApp {
    public static void main(String[] args) {
        // Step 1: Determine the names to display
        // Use "World" if no args are provided; otherwise, join args with ", "
        String outputNames = (args.length == 0) ? "World" : String.join(", ", args);

        // Step 2: Print the formatted greeting
        System.out.println("Hello, " + outputNames + "!");
    }
}