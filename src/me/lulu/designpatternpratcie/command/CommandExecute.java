package me.lulu.designpatternpratcie.command;

import me.lulu.designpatternpratcie.command.commands.DrawPixelCommand;

import java.util.Stack;

public class CommandExecute {

    private static Stack<PaintTool> history = new Stack<>();

    public static void main(String[] args) {
        PaintTool paintTool = new PaintTool(new DrawPixelCommand());

        for (int i = 0; i < 5; i++) {
            paintTool.use();
            history.push(paintTool);
        }

        System.out.println(" ");

        while (!history.isEmpty())
            history.pop().rollback();
    }

}
