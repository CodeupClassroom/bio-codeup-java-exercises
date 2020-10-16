package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {
    public static Path createDirectoryAndFile(String directoryName, String fileName) throws IOException{
        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        //We have to create a directory first before we create before we create the file.

        if (Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }

        if (!Files.exists(dataFilePath)) {
            Files.createFile(dataFilePath);
        }

        return dataFilePath;
    }

    public static void printFileContents(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }
}
