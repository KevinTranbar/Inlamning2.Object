import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 { //Can be done with TreeSet

    public static void main(String[] args) {
        //A variant similar to ArrayList (Queue implemented in LinkedList and is therefore needed)
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String[] words = scanner.nextLine().toLowerCase().trim().split(" +");

        for (int i = 0; i < words.length - 1; i++) { // Bubble sort
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;

                }
            }
        }
        for (String word : words){
            queue.add(word);
        }

        System.out.println(queue);

    }
}