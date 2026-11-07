public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println(sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println(sb);

        // Delete
        sb.delete(5, 10);
        System.out.println(sb);

        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        // Reverse
        sb.reverse();
        System.out.println(sb);

        // Length
        System.out.println(sb.length());

        // Character access
        System.out.println(sb.charAt(0));

        // Update character
        sb.setCharAt(0, 'A');

        // Convert to String
        String str = sb.toString();

        System.out.println(str);
    }
}