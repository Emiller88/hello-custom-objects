import groovy.transform.Immutable
import java.nio.file.Path
import nextflow.io.ValueObject
import nextflow.util.KryoHelper

@ValueObject
@Immutable(copyWith=true, knownImmutables = ['id', 'single_end', 'read_group', 'r1'])
class CustomObject {
    static {
        // Register this class with the Kryo framework that serializes and deserializes objects
        // that pass through channles. This allows for caching when this object is used.
        KryoHelper.register(CustomObject)
    }
    String id
    Boolean single_end
    String read_group
    Path r1
}