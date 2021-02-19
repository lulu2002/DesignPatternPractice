package me.lulu.designpatternpratcie.bridge;

import java.util.Arrays;

public class FileExecute {

    public static void main(String[] args) {
        File[] files = {
                new SingleFile("Test.yml"),
                new SingleFile("Hello.yml"),
                new SingleFile("Test.yml"),
                new Folder("Datou", Arrays.asList(
                        new SingleFile("gggg.txt"),
                        new SingleFile("1ef354e5f.txt"),
                        new Folder("Messages", Arrays.asList(
                                new SingleFile("Hi!.txt")
                        ))
                )),
                new SingleFile("Test.yml"),
                new SingleFile("Test.yml"),
        };

        for (File file : files) {
            System.out.println(file.getFile());
        }
    }

}
