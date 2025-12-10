package org.apache.commons.p028io.input;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.input.MemoryMappedFileInputStream */
/* loaded from: classes6.dex */
public final class MemoryMappedFileInputStream extends AbstractInputStream {

    /* renamed from: f */
    public static final ByteBuffer f73374f = ByteBuffer.wrap(new byte[0]).asReadOnlyBuffer();

    /* renamed from: b */
    public final int f73375b;

    /* renamed from: c */
    public final FileChannel f73376c;

    /* renamed from: d */
    public ByteBuffer f73377d;

    /* renamed from: e */
    public long f73378e;

    /* renamed from: org.apache.commons.io.input.MemoryMappedFileInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<MemoryMappedFileInputStream, Builder> {
        public Builder() {
            setBufferSizeDefault(262144);
            setBufferSize(262144);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public MemoryMappedFileInputStream get() throws IOException {
            return new MemoryMappedFileInputStream(getPath(), getBufferSize());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f73377d.remaining();
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isClosed()) {
            m25109d();
            this.f73377d = f73374f;
            this.f73376c.close();
            super.close();
        }
    }

    /* renamed from: d */
    public final void m25109d() {
        if (AbstractC1028Of.m67015c() && this.f73377d.isDirect()) {
            AbstractC1028Of.m67017a(this.f73377d);
        }
    }

    /* renamed from: g */
    public final void m25108g() {
        long size = this.f73376c.size() - this.f73378e;
        if (size > 0) {
            long min = Math.min(size, this.f73375b);
            m25109d();
            this.f73377d = this.f73376c.map(FileChannel.MapMode.READ_ONLY, this.f73378e, min);
            this.f73378e += min;
            return;
        }
        this.f73377d = f73374f;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m25160b();
        if (!this.f73377d.hasRemaining()) {
            m25108g();
            if (!this.f73377d.hasRemaining()) {
                return -1;
            }
        }
        return AbstractC18843Yr0.m65289a(this.f73377d.get());
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        ByteBuffer byteBuffer;
        m25160b();
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.f73377d.remaining()) {
            this.f73377d.position((int) (byteBuffer.position() + j));
            return j;
        }
        long remaining = this.f73377d.remaining() + Math.min(this.f73376c.size() - this.f73378e, j - this.f73377d.remaining());
        this.f73378e += remaining - this.f73377d.remaining();
        m25108g();
        return remaining;
    }

    public MemoryMappedFileInputStream(Path path, int i) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        this.f73377d = f73374f;
        this.f73375b = i;
        standardOpenOption = StandardOpenOption.READ;
        open = FileChannel.open(path, standardOpenOption);
        this.f73376c = open;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m25160b();
        if (!this.f73377d.hasRemaining()) {
            m25108g();
            if (!this.f73377d.hasRemaining()) {
                return -1;
            }
        }
        int min = Math.min(this.f73377d.remaining(), i2);
        this.f73377d.get(bArr, i, min);
        return min;
    }
}
