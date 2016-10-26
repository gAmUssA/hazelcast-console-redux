package com.hazelcast.console;

import jline.TerminalFactory;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.util.concurrent.Callable;

/**
 * TODO
 *
 * @author Viktor Gamov on 10/25/16.
 *         Twitter: @gamussa
 * @since 0.0.1
 */
public class Util {
    private Util() {
    }

    public static void installAnsi() {
        // Install the system adapters, replaces System.out and System.err
        // Must be called before using IO(), because IO stores refs to System.out and System.err
        AnsiConsole.systemInstall();

        // Register jline ansi detector
       // Ansi.setDetector(new AnsiDetector());
    }


    private static class AnsiDetector implements Callable<Boolean> {
        @Override
        public Boolean call() throws Exception {
            return TerminalFactory.create().isAnsiSupported();
        }
    }
}
