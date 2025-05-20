package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateADirectory {
    private String dir;
    private Path path_01;

    public CreateADirectory(String dir) {
        this.dir = dir;
        this.path_01 = Path.of(this.dir);
    }

    public Path getPath_01() {
        return this.path_01;
    }

    public void createDirectory() {
        try{
            Files.createDirectories(this.path_01);
            System.out.println("Directory creation was successful!");
        } catch(IOException e) {
            System.out.println("Directory creation failed: "+e.getMessage());
        }
    }

    public void createMultipleDirectories() {
        for(int i = 0; i < 10; i++) {
            try{
                Path aPath = Paths.get(this.dir+i);
                Files.createDirectories(aPath);
            } catch(IOException e) {
                System.out.println("Failed to create the directory: "+e.getMessage());
            }
        }
    }
}
