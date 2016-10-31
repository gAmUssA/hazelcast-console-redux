package commands

import org.codehaus.groovy.tools.shell.Groovysh

/**
 * Created by vikgamov on 10/26/16.
 */
class WhoCommand extends HazelcastCommandSupport {
    public static String COMMAND_NAME = "who";

    protected WhoCommand(Groovysh shell) {
        super(shell, COMMAND_NAME, 'w')
    }

    @Override
    Object execute(List<String> args) {
        return app.handleWho()
    }
}
