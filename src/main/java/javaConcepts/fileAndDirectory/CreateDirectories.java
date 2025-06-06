package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectories {
    private String pathString;
    private Path path;

    public CreateDirectories(String pathString) {
        this.pathString = pathString;
        this.path = Path.of(pathString);
    }

    public Path getPath() {
        return this.path;
    }

    public void createADirectory() {
        if (!Files.exists(this.getPath())) {
            try {
                Files.createDirectories(this.getPath());
                System.out.println("The directory is created!");
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        } else {
            System.out.println("Directory "+this.getPath()+" already exists.");
        }
    }

    public void createMultipleDirectories() {
        for(int i = 0; i < 10; i++) {
            this.path = Path.of(this.pathString+i);
            if(Files.notExists(this.getPath())) {
                try {
                    Files.createDirectories(this.getPath());
                    System.out.println("The directory is created!");
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage());
                }
            } else {
                System.out.println("Directory "+this.getPath()+" already exists.");
            }
        }
    }
}
