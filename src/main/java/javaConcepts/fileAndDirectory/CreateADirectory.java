package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateADirectory {
    private String pathString;
    private Path path_01;

    public CreateADirectory(String pathString) {
        this.pathString = pathString;
        this.path_01 = Path.of(this.pathString);
    }

    public Path getPath_01() {
        return this.path_01;
    }

    public void createDirectory() {
        try {
            Files.createDirectories(this.path_01);
            System.out.println("Directory creation was successful!");
        } catch (IOException e) {
            System.out.println("Directory creation failed: " + e.getMessage());
        }
    }

    public void createMultipleDirectories() {
        for (int i = 0; i < 10; i++) {
            try {
                String currentDir = this.pathString + i;
                Path path = Path.of(currentDir);
                if (!Files.exists(path)) {
                    Files.createDirectories(path);
                } else {
                    System.out.println("The directory " + currentDir + " already exists.");
                }
            } catch (IOException e) {
                System.out.println("Failed to create the directory: " + e.getMessage());
            }
        }
    }
}
