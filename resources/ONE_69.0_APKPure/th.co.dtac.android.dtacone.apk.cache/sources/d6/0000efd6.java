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
    public static final ByteBuffer f73458f = ByteBuffer.wrap(new byte[0]).asReadOnlyBuffer();

    /* renamed from: b */
    public final int f73459b;

    /* renamed from: c */
    public final FileChannel f73460c;

    /* renamed from: d */
    public ByteBuffer f73461d;

    /* renamed from: e */
    public long f73462e;

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
        return this.f73461d.remaining();
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isClosed()) {
            m25299d();
            this.f73461d = f73458f;
            this.f73460c.close();
            super.close();
        }
    }

    /* renamed from: d */
    public final void m25299d() {
        if (AbstractC1016Of.m67101c() && this.f73461d.isDirect()) {
            AbstractC1016Of.m67103a(this.f73461d);
        }
    }

    /* renamed from: g */
    public final void m25298g() {
        long size = this.f73460c.size() - this.f73462e;
        if (size > 0) {
            long min = Math.min(size, this.f73459b);
            m25299d();
            this.f73461d = this.f73460c.map(FileChannel.MapMode.READ_ONLY, this.f73462e, min);
            this.f73462e += min;
            return;
        }
        this.f73461d = f73458f;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m25350b();
        if (!this.f73461d.hasRemaining()) {
            m25298g();
            if (!this.f73461d.hasRemaining()) {
                return -1;
            }
        }
        return AbstractC19818es0.m31585a(this.f73461d.get());
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        ByteBuffer byteBuffer;
        m25350b();
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.f73461d.remaining()) {
            this.f73461d.position((int) (byteBuffer.position() + j));
            return j;
        }
        long remaining = this.f73461d.remaining() + Math.min(this.f73460c.size() - this.f73462e, j - this.f73461d.remaining());
        this.f73462e += remaining - this.f73461d.remaining();
        m25298g();
        return remaining;
    }

    public MemoryMappedFileInputStream(Path path, int i) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        this.f73461d = f73458f;
        this.f73459b = i;
        standardOpenOption = StandardOpenOption.READ;
        open = FileChannel.open(path, standardOpenOption);
        this.f73460c = open;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m25350b();
        if (!this.f73461d.hasRemaining()) {
            m25298g();
            if (!this.f73461d.hasRemaining()) {
                return -1;
            }
        }
        int min = Math.min(this.f73461d.remaining(), i2);
        this.f73461d.get(bArr, i, min);
        return min;
    }
}