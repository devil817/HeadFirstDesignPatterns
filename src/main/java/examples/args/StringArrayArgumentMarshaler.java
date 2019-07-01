package examples.args;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArrayValue = null;
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringArrayValue = currentArgument.next().split(",");
        } catch (NoSuchElementException e){
            throw new ArgsException(ArgsException.ErrorCode.MISSING_STRING);
        }
    }
    public static String[] getValue(ArgumentMarshaler am) {
        if( am != null && am instanceof StringArrayArgumentMarshaler ) {
            return ((StringArrayArgumentMarshaler) am).stringArrayValue;
        }else{
            return null;
        }
    }
}
