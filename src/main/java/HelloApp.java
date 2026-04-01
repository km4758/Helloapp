public class HelloApp {

    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            // Append comma only if not the first element
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        // Print final greeting
        System.out.println("Hello, " + names.toString() + "!");
    }
}
