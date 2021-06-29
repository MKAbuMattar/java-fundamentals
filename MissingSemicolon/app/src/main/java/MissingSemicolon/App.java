/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MissingSemicolon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

  public static void main(String[] args) {
    readingFile("/home/mkabumattar/amman-code-java-401d2/java-fundamentals/MissingSemicolon/app/src/main/java/MissingSemicolon/gates.js");
  }

  public static void readingFile(String path) {
    Path file = Paths.get(path);
    try (InputStream in = Files.newInputStream(file);
         BufferedReader readerFile = new BufferedReader(new InputStreamReader(in))) {
      String textLine;
      for (int i = 1;(textLine = readerFile.readLine()) != null; i++) {
        if (!textLine.endsWith(";")) {
          if (!textLine.endsWith("{")) {
            if (!textLine.endsWith("}")) {
              if (!textLine.contains("if")) {
                if (!textLine.contains("else")) {
                  System.out.println("Missing Semicolon at Line: " + i);
                }
              }
            }
          }
        }
      }
    } catch (IOException err) {
      System.err.println(err);
    }
  }
}
