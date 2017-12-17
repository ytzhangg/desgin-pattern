package org.crayeres.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return (read == -1) ? read : Character.toLowerCase((char) read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = off; i < read + off; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return read;
    }
}
