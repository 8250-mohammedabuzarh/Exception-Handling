package customexception;

import java.io.*;

public class FileMerger {
    public static void main(String[] args) {
        String inputFile1 = "C:\\Users\\shaik.mohammed02\\Downloads\\file1.txt";
        String inputFile2 = "C:\\Users\\shaik.mohammed02\\Downloads\\file2.txt";
        String outputFile = "C:\\Users\\shaik.mohammed02\\Downloads\\file4.txt";

        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
                BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader1.readLine()) != " ") {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != " ") {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

