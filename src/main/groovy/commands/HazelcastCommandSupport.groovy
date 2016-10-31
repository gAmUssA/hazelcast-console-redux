package commands

import com.hazelcast.core.Hazelcast
import com.hazelcast.core.HazelcastInstance
import com.hazelcast.tools.console.ConsoleApp
import org.codehaus.groovy.tools.shell.CommandSupport
import org.codehaus.groovy.tools.shell.Groovysh

/**
 * Created by vikgamov on 10/26/16.
 */
abstract class HazelcastCommandSupport extends CommandSupport {

    ConsoleApp app
    HazelcastInstance hazelcast

    protected HazelcastCommandSupport(Groovysh shell, String name, String shortcut) {
        super(shell, name, shortcut)
        this.app = ConsoleApp.getApp()

        def hazelcastInstance = Hazelcast.allHazelcastInstances.getAt(0)
        if (hazelcastInstance) {
            this.hazelcast = hazelcastInstance
            app.setHazelcast(hazelcastInstance)
        } else fail("can't find running Hazelcast instance")

    }
}
