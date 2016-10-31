package commands

import groovy.transform.CompileStatic
import org.codehaus.groovy.tools.shell.Groovysh

/**
 * JVM command shows JVM stats and info
 */
@CompileStatic
class JVMCommand extends HazelcastCommandSupport {

    protected JVMCommand(Groovysh shell) {
        super(shell, 'jvm', 'J')
    }

    @Override
    Object execute(List<String> args) {
        return app.handleJvm()
    }

}
