package Problems_20_29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
 * is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
public class Problem_22 {

    public long calculateResult() {
        long totalScore = 0;

        ArrayList<String> names = readNamesFromFile();

        Collections.sort(names);

        int namesSize = names.size();

        for (int i = 0; i < namesSize; i++) {
            String name = names.get(i);
            totalScore += calculateNameScore(name, i + 1);
        }

        return totalScore;
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
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Problems_20_29/problem22_names.txt"));
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
