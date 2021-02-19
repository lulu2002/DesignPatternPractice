package me.lulu.designpatternpratcie.bridge;

public class SingleFile implements File {

    private String fileName;

    public SingleFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getFile() {
        return fileName;
    }

}
