import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long totalScore = 0;

        ArrayList<String> names = readNamesFromFile();

        Collections.sort(names);

        int namesSize = names.size();

        for (int i = 0; i < namesSize; i++) {
            String name = names.get(i);
            totalScore += calculateNameScore(name, i + 1);
        }

        System.out.println(totalScore);
    }


    public static int calculateNameScore(String name, int alphabeticalPosition) {
        int sumOfLetters = 0;

        for (int i = 0; i < name.length(); i++) {
            sumOfLetters += name.charAt(i) - 64;
        }

        return sumOfLetters * alphabeticalPosition;
    }


    public static ArrayList<String> readNamesFromFile() {
        ArrayList<String> names = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("p022_names.txt"));
            Scanner fileScanner = new Scanner(bufferedReader);
            String fileAsString = fileScanner.next();
            fileAsString = fileAsString.substring(1, fileAsString.length() - 1);

            Scanner scanner = new Scanner(fileAsString);
            scanner.useDelimiter("\",\"");

            //Add all names to ArrayList
            while (scanner.hasNext()) {
                names.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return names;
    }
}
