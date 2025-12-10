package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.input.UnsynchronizedFilterInputStream */
/* loaded from: classes6.dex */
public class UnsynchronizedFilterInputStream extends InputStream {
    protected volatile InputStream inputStream;

    /* renamed from: org.apache.commons.io.input.UnsynchronizedFilterInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UnsynchronizedFilterInputStream, Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public UnsynchronizedFilterInputStream get() throws IOException {
            return new UnsynchronizedFilterInputStream(getInputStream());
        }
    }

    public UnsynchronizedFilterInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.inputStream.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.inputStream.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.inputStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.inputStream.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.inputStream.read(bArr, i, i2);
    }
}
