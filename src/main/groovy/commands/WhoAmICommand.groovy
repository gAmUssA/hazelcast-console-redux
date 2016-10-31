package commands

import groovy.transform.CompileStatic
import org.codehaus.groovy.tools.shell.Groovysh

/**
 * Created by vikgamov on 10/26/16.
 */
@CompileStatic
class WhoAmICommand extends HazelcastCommandSupport {

    protected WhoAmICommand(Groovysh shell) {
        super(shell, "whoami", "wa")
    }

    @Override
    Object execute(List<String> args) {
        return app.handleWhoami()
    }
}
