package customexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<String> filePaths = List.of("C:\\Users\\shaik.mohammed02\\Downloads\\file1.txt", "C:\\Users\\shaik.mohammed02\\Downloads\\file2.txt", "C:\\Users\\shaik.mohammed02\\Downloads\\file3.txt");
        FileProcessor processor = new FileProcessor();
        processor.processFiles(filePaths);
    }
}

