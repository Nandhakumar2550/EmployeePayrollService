package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileOperationsTest {

    @Test
    void testFileOperations() throws IOException {

        Path dir = Paths.get("TestFolder");

        // delete if exists
        if (Files.exists(dir)) {
            try (Stream<Path> paths = Files.list(dir)) {
                paths.forEach(path -> {
                    try {
                        Files.delete(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
            Files.delete(dir);
        }

        // create directory
        Files.createDirectory(dir);
        assertTrue(Files.exists(dir));

        // create files
        Path file1 = dir.resolve("file1.txt");
        Path file2 = dir.resolve("file2.txt");

        Files.createFile(file1);
        Files.createFile(file2);

        assertTrue(Files.exists(file1));
        assertTrue(Files.exists(file2));

        // list files
        System.out.println("All Files:");
        try (Stream<Path> paths = Files.list(dir)) {
            paths.forEach(System.out::println);
        }

        // list only .txt files
        System.out.println("Only .txt Files:");
        try (Stream<Path> paths = Files.list(dir)) {
            paths.filter(p -> p.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        }
    }
}