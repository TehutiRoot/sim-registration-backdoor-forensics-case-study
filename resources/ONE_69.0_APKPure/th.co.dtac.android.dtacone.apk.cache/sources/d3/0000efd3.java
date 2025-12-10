package org.apache.commons.p028io.input;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p028io.IOUtils;

/* renamed from: org.apache.commons.io.input.DemuxInputStream */
/* loaded from: classes6.dex */
public class DemuxInputStream extends InputStream {

    /* renamed from: a */
    public final InheritableThreadLocal f73457a = new InheritableThreadLocal();

    public InputStream bindStream(InputStream inputStream) {
        InputStream inputStream2 = (InputStream) this.f73457a.get();
        this.f73457a.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close((Closeable) this.f73457a.get());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = (InputStream) this.f73457a.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}