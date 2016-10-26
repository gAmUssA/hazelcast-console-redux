@Grab(group = 'com.hazelcast', module = 'hazelcast', version = '3.7.2')
import com.hazelcast.core.Hazelcast

def hz = Hazelcast.newHazelcastInstance()