package org.apache.commons.p028io.input.buffer;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.p028io.IOUtils;

/* renamed from: org.apache.commons.io.input.buffer.CircularBufferInputStream */
/* loaded from: classes6.dex */
public class CircularBufferInputStream extends FilterInputStream {

    /* renamed from: a */
    public boolean f73607a;
    protected final CircularByteBuffer buffer;
    protected final int bufferSize;

    public CircularBufferInputStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73607a = true;
        this.buffer.clear();
    }

    public void fillBuffer() throws IOException {
        if (this.f73607a) {
            return;
        }
        int space = this.buffer.getSpace();
        byte[] byteArray = IOUtils.byteArray(space);
        while (space > 0) {
            int read = ((FilterInputStream) this).in.read(byteArray, 0, space);
            if (read == -1) {
                this.f73607a = true;
                return;
            } else if (read > 0) {
                this.buffer.add(byteArray, 0, read);
                space -= read;
            }
        }
    }

    public boolean haveBytes(int i) throws IOException {
        if (this.buffer.getCurrentNumberOfBytes() < i) {
            fillBuffer();
        }
        return this.buffer.hasBytes();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (haveBytes(1)) {
            return this.buffer.read() & 255;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularBufferInputStream(InputStream inputStream, int i) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        if (i > 0) {
            this.buffer = new CircularByteBuffer(i);
            this.bufferSize = i;
            this.f73607a = false;
            return;
        }
        throw new IllegalArgumentException("Illegal bufferSize: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i >= 0) {
            if (i2 >= 0) {
                if (haveBytes(i2)) {
                    int min = Math.min(i2, this.buffer.getCurrentNumberOfBytes());
                    for (int i3 = 0; i3 < min; i3++) {
                        bArr[i + i3] = this.buffer.read();
                    }
                    return min;
                }
                return -1;
            }
            throw new IllegalArgumentException("Length must not be negative");
        }
        throw new IllegalArgumentException("Offset must not be negative");
    }
}