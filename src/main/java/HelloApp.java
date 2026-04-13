public class HelloApp {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use StringBuilder for efficient construction
            StringBuilder nameBuilder = new StringBuilder();

            // Step 3: Enhanced for-loop (no index management needed)
            for (String name : args) {
                // Always append the delimiter ", "
                nameBuilder.append(name).append(", ");
            }

            // Step 4: Use substring to remove the trailing ", " (2 characters)
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                // Start at index 0, end 2 characters before the end
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Step 5: Print the formatted result
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}
