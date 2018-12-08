package com.example.extensions;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class TemporaryDirectoryTest {

    @Test
    public void writeAndReadFile() throws Exception {
        Path testFile = Files.createTempDirectory("junit").resolve("xD.txt");

        List<String> inputLines = asList("21", "37");
        Files.write(testFile, inputLines);

        List<String> lines = Files.readAllLines(testFile);

        inputLines.forEach(
                line -> assertEquals(line, lines.get(inputLines.indexOf(line)))
        );
    }

}
