package ru.murat.dautov.helloCommand;

import org.apache.felix.service.command.CommandProcessor;

import org.osgi.service.component.annotations.Component;


import java.io.PrintStream;
import java.util.StringTokenizer;

@Component(
        property = {
                CommandProcessor.COMMAND_SCOPE + ":String=practice",
                CommandProcessor.COMMAND_FUNCTION + ":String=hello"
        },
        service = HelloCommand.class
)
public class HelloCommand {


    public void hello(String s) {
        execute(s, System.out, System.err);
    }

    /**
     * prints "Hello" and given param
     *
     * @param s
     * @param printStream
     * @param err
     */
    public void execute(String s, PrintStream printStream, PrintStream err) {
        StringTokenizer st = new StringTokenizer(s, " ");
        if (st.countTokens() == 1) {
            String number = st.nextToken().trim();
            printStream.println("Hello " + number);
        } else {
            err.println("Not correct amount of arguments");
        }

    }
}
