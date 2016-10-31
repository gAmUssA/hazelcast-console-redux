package com.hazelcast.gradle.starter;

import com.hazelcast.console.ConsoleApp;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Map;
import java.util.Set;

import static com.hazelcast.console.Util.installAnsi;

/**
 * TODO
 *
 * @author Viktor Gamov on 10/5/15.
 *         Twitter: @gamussa
 * @since 0.0.1
 */
public class Starter {
    public static void main(String[] args) throws Exception {
        installAnsi();
        final HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

        //new ConsoleApp(hazelcastInstance).start(args);

        final Map<Object, Object> map2 = hazelcastInstance.getMap("test");
        final IMap<Object, Object> map = hazelcastInstance.getMap("test");
    }
}
