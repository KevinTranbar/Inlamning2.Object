import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        //A variant similar to ArrayList (LinkedList is implemented from the Queue interface)
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String[] words = scanner.nextLine().toLowerCase().trim().split(" +");

        for (String word : words){
            if (Character.isLetter(word.charAt(0))) {
                queue.add(word);
            }
        }

        ArrayList<String> list = new ArrayList<>(queue);
        Collections.sort(list);

        list.forEach(e -> System.out.println(e));

        scanner.close();
    }
}