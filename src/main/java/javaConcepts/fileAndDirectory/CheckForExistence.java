package javaConcepts.fileAndDirectory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckForExistence {
    private String parentDir;
    private Path parentPath;

    public CheckForExistence(String parentDir) {
        this.parentDir = parentDir;
        this.parentPath = Paths.get(this.parentDir);
    }

    public String getParentDir() {
        return parentDir;
    }

    public Path getParentPath() {
        return parentPath;
    }

    public Boolean doesDirExists() {
        if (Files.exists(this.getParentPath())) {
            System.out.println("The directory " + this.getParentPath() + " exists.");
            return true;
        }
        return false;
    }

    public Boolean checkIfDirsExists(String dir) {
        if (Files.exists(this.parentPath) && Files.isDirectory(this.parentPath)) {
            System.out.println("--- Iterating through: " + this.parentPath.toAbsolutePath() + " ---");

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(this.getParentPath())) {
                for (Path entry : stream) {
                    if (Files.isDirectory(entry)) {
                        String fullPath = entry.toString();
                        System.out.println(fullPath);

                        if (fullPath.endsWith(dir)) {
                            System.out.println("The directory: " + dir + " exists.");
                            return true;
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("An I/O error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }
}
