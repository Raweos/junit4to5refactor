package com.example.extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

class TemporaryDirectoryTest {

    @Test
    @ExtendWith(TemporaryDirectoryExtension.class)
    void writeAndReadFile(Path tempDir) throws Exception {
        Path testFile = tempDir.resolve("xD.txt");
        List<String> inputLines = asList("21", "37");
        Files.write(testFile, inputLines);
        List<String> lines = Files.readAllLines(testFile);
        inputLines.forEach(
                line -> assertEquals(line, lines.get(inputLines.indexOf(line)))
        );
    }

}
