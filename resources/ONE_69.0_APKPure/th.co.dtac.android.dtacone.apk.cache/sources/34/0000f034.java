package org.apache.commons.p028io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.output.ChunkedOutputStream */
/* loaded from: classes6.dex */
public class ChunkedOutputStream extends FilterOutputStream {

    /* renamed from: a */
    public final int f73631a;

    /* renamed from: org.apache.commons.io.output.ChunkedOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ChunkedOutputStream, Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public ChunkedOutputStream get() throws IOException {
            return new ChunkedOutputStream(getOutputStream(), getBufferSize());
        }
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.f73631a);
            ((FilterOutputStream) this).out.write(bArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream outputStream, int i) {
        super(outputStream);
        if (i > 0) {
            this.f73631a = i;
            return;
        }
        throw new IllegalArgumentException("chunkSize <= 0");
    }
}