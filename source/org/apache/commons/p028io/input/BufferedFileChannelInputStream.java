package org.apache.commons.p028io.input;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Objects;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.http.cookie.ClientCookie;

/* renamed from: org.apache.commons.io.input.BufferedFileChannelInputStream */
/* loaded from: classes6.dex */
public final class BufferedFileChannelInputStream extends InputStream {

    /* renamed from: a */
    public final ByteBuffer f73353a;

    /* renamed from: b */
    public final FileChannel f73354b;

    /* renamed from: org.apache.commons.io.input.BufferedFileChannelInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<BufferedFileChannelInputStream, Builder> {

        /* renamed from: k */
        public FileChannel f73355k;

        public Builder setFileChannel(FileChannel fileChannel) {
            this.f73355k = fileChannel;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public BufferedFileChannelInputStream get() throws IOException {
            return this.f73355k != null ? new BufferedFileChannelInputStream(this.f73355k, getBufferSize()) : new BufferedFileChannelInputStream(getPath(), getBufferSize());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        if (!this.f73354b.isOpen()) {
            return 0;
        }
        if (!m25129g()) {
            return 0;
        }
        return this.f73353a.remaining();
    }

    /* renamed from: b */
    public final void m25131b(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            m25130d(byteBuffer);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f73354b.close();
        m25131b(this.f73353a);
    }

    /* renamed from: d */
    public final void m25130d(ByteBuffer byteBuffer) {
        if (AbstractC1028Of.m67015c()) {
            AbstractC1028Of.m67017a(byteBuffer);
        }
    }

    /* renamed from: g */
    public final boolean m25129g() {
        AbstractC17721He0.m68061a(this.f73354b.isOpen());
        if (this.f73353a.hasRemaining()) {
            return true;
        }
        this.f73353a.clear();
        int i = 0;
        while (i == 0) {
            i = this.f73354b.read(this.f73353a);
        }
        this.f73353a.flip();
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final long m25128i(long j) {
        long position = this.f73354b.position();
        long size = this.f73354b.size();
        long j2 = size - position;
        if (j > j2) {
            this.f73354b.position(size);
            return j2;
        }
        this.f73354b.position(position + j);
        return j;
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        if (m25129g()) {
            return this.f73353a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.f73353a.remaining() >= j) {
            ByteBuffer byteBuffer = this.f73353a;
            byteBuffer.position(byteBuffer.position() + ((int) j));
            return j;
        }
        long remaining = this.f73353a.remaining();
        this.f73353a.position(0);
        this.f73353a.flip();
        return remaining + m25128i(j - remaining);
    }

    @Deprecated
    public BufferedFileChannelInputStream(File file) throws IOException {
        this(file, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BufferedFileChannelInputStream(java.io.File r1, int r2) throws java.io.IOException {
        /*
            r0 = this;
            java.nio.file.Path r1 = p000.AbstractC19496dG1.m31913a(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.BufferedFileChannelInputStream.<init>(java.io.File, int):void");
    }

    public BufferedFileChannelInputStream(FileChannel fileChannel, int i) {
        Objects.requireNonNull(fileChannel, ClientCookie.PATH_ATTR);
        this.f73354b = fileChannel;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.f73353a = allocateDirect;
        allocateDirect.flip();
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0) {
            if (i3 <= bArr.length) {
                if (m25129g()) {
                    int min = Math.min(i2, this.f73353a.remaining());
                    this.f73353a.get(bArr, i, min);
                    return min;
                }
                return -1;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Deprecated
    public BufferedFileChannelInputStream(Path path) throws IOException {
        this(path, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BufferedFileChannelInputStream(java.nio.file.Path r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = p000.AbstractC1328Sc.m66317a()
            r0[r1] = r2
            java.nio.channels.FileChannel r4 = p000.AbstractC22848wn0.m714a(r4, r0)
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.BufferedFileChannelInputStream.<init>(java.nio.file.Path, int):void");
    }
}
