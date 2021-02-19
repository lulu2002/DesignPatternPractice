package me.lulu.designpatternpratcie.bridge;

import java.util.List;
import java.util.stream.Collectors;

public class Folder implements File {

    private String folderName;
    private List<File> files;

    public Folder(String folderName, List<File> files) {
        this.folderName = folderName;
        this.files = files;
    }

    @Override
    public String getFile() {
        return folderName + ":\n" + files.stream()
                .map(file -> "  " + file.getFile())
                .collect(Collectors.joining("\n"));
    }
}
