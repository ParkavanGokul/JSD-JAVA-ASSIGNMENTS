import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class READ_CONTENT_OF_FILE {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name:");
            String fileName = sc.nextLine();
            System.out.println("Enter the word to search:");
            String word = sc.nextLine();
            sc.close();
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            int count = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();
            System.out.println("The word " + word + " occurs " + count + " times in the file.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
