// Ndërtoni një program që zëvendëson çdo rresht të skedarit me të anasjelltin e tij. Përshembull
// përmbajtja e skedarit HelloPrinter.java do të ndryshonte në :
// retnirPolleH ssalc cilbup
// {
// )sgra ][gnirtS(niam diov citats cilbup
// {
// wodniw elosnoc eht ni gniteerg a yalpsiD //
// ;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
// }
// }

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usht6 {
    public static void main(String[] args) {
        String fileName = args[0];

        File file = new File(fileName);
        StringBuilder reversedContent = new StringBuilder();

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String reversedLine = new StringBuilder(line).reverse().toString();
                reversedContent.append(reversedLine).append(System.lineSeparator());
            }
            reader.close();
            System.out.println(reversedContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(reversedContent.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
