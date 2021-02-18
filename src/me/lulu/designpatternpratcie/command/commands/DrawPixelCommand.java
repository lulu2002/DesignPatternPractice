package me.lulu.designpatternpratcie.command.commands;

public class DrawPixelCommand implements PaintCommand {

    @Override
    public void execute() {
        System.out.println("Drawing a pixel");
    }

    @Override
    public void unExecute() {
        System.out.println("Replace pixel to previous color");
    }
}
