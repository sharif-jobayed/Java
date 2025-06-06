package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteDirAndFiles {
    private String pathString;
    private Path path;

    public DeleteDirAndFiles(String pathString) {
        this.pathString = pathString;
        this.path = Path.of(pathString);
    }

    public String getPathString() {
        return this.pathString;
    }

    public Path getPath() {
        return this.path;
    }

    public void deleteADir() {
        if (Files.exists(this.getPath()) && Files.isDirectory(this.getPath())) {
            try {
                Files.delete(this.getPath());
                System.out.println("The directory is deleted!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
