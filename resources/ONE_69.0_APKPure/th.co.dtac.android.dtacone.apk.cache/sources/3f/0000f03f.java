package org.apache.commons.p028io.output;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.p028io.IOUtils;

/* renamed from: org.apache.commons.io.output.DemuxOutputStream */
/* loaded from: classes6.dex */
public class DemuxOutputStream extends OutputStream {

    /* renamed from: a */
    public final InheritableThreadLocal f73646a = new InheritableThreadLocal();

    public OutputStream bindStream(OutputStream outputStream) {
        OutputStream outputStream2 = (OutputStream) this.f73646a.get();
        this.f73646a.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close((Closeable) this.f73646a.get());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = (OutputStream) this.f73646a.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        OutputStream outputStream = (OutputStream) this.f73646a.get();
        if (outputStream != null) {
            outputStream.write(i);
        }
    }
}