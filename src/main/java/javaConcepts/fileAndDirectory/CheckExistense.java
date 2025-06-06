package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckExistense {
    private String pathString;
    private Path path;

    public CheckExistense(String pathString) {
        this.pathString = pathString;
        this.path = Path.of(pathString);
    }

    public String getPathString() {
        return this.pathString;
    }

    public Path getPath() {
        return this.path;
    }

    public void checkSingleDirectory(String dir) {
        this.path = Path.of(this.getPathString() + dir);

        if (Files.exists(this.getPath())) {
            System.out.println("Directory " + path + " exists.");
        } else {
            System.out.println("Directory " + path + " does not exist.");
        }

        this.path = Path.of(this.getPathString().replace(dir, ""));
    }

    public void checkMultipleDirectories() {
        try {
            DirectoryStream<Path> parentDirectory = Files.newDirectoryStream(this.getPath());

            for (Path path : parentDirectory) {
                if (Files.exists(path)) {
                    System.out.println("The directory " + path + " exists.");
                } else {
                    System.out.println("The directory " + path + " does not exist.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
