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

        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        //We have to create a directory first before we create before we create the file.
        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            if (!Files.exists(dataFilePath)) {
                Files.createFile(dataFilePath);
            }

            //Let's write our grocery list ot the file.
            List<String> groceryList = Arrays.asList("milk", "eggs", "bacon");
            Files.write(dataFilePath, groceryList);

            List<String> fileContents = Files.readAllLines(dataFilePath);
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //Append to the file.
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //Replace a line in the file.
            fileContents = Files.readAllLines(dataFilePath);
            List<String> modifiedList = new ArrayList<>();
            for (String item: fileContents) {
                if(item.equals("milk")) {
                    //Add my modified item.
                    modifiedList.add("whole milk");
                } else {
                    //Add the existing because it isn't what we want to replace.
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);

            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            //Remove a line from the file.
            fileContents = Files.readAllLines(dataFilePath);
            modifiedList = new ArrayList<>();
            for (String item: fileContents) {
                //I want to remove the bread from the list.
                if(!item.equals("bread")) {
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

        } catch (IOException ex) {
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }

    }
}
