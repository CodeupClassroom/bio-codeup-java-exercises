package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLecture {
    public static void main(String[] args) throws IOException {
        String directoryName = "data";
        String fileName = "grocery_list.txt";

        //We have to create a directory first before we create before we create the file.
        try {
            Path dataFilePath = FileIO.createDirectoryAndFile(directoryName, fileName);

            //Let's write our grocery list ot the file.
            List<String> groceryList = Arrays.asList("milk", "eggs", "bacon");
            Files.write(dataFilePath, groceryList);

            FileIO.printFileContents(dataFilePath);

            //Append to the file.
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            FileIO.printFileContents(dataFilePath);

            //Replace a line in the file.
            FileIO.updateLine(dataFilePath, "milk", "whole milk");
            FileIO.printFileContents(dataFilePath);

            //Remove a line from the file.
            FileIO.deleteLine(dataFilePath, "bread");
            FileIO.printFileContents(dataFilePath);

            //Empty the list
            Files.write(dataFilePath, new ArrayList<>());
            System.out.println("After empty");
            FileIO.printFileContents(dataFilePath);

        } catch (IOException ex) {
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }

    }
}
