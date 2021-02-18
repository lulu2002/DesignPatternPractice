package me.lulu.designpatternpratcie.command;

import me.lulu.designpatternpratcie.command.commands.PaintCommand;

public class PaintTool {

    private PaintCommand command;

    public PaintTool(PaintCommand command) {
        this.command = command;
    }

    public void use() {
        this.command.execute();
    }

    public void rollback() {
        this.command.unExecute();
    }
}
