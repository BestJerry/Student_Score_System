package Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by jerry on 16-10-29.
 */
public class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        super.writeStreamHeader();
    }
}
