package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.input.RandomAccessFileInputStream */
/* loaded from: classes6.dex */
public class RandomAccessFileInputStream extends AbstractInputStream {

    /* renamed from: b */
    public final boolean f73492b;

    /* renamed from: c */
    public final RandomAccessFile f73493c;

    /* renamed from: org.apache.commons.io.input.RandomAccessFileInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<RandomAccessFileInputStream, Builder> {

        /* renamed from: k */
        public boolean f73494k;

        public Builder setCloseOnClose(boolean z) {
            this.f73494k = z;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public RandomAccessFileInputStream get() throws IOException {
            return new RandomAccessFileInputStream(getRandomAccessFile(), this.f73494k);
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public Builder setRandomAccessFile(RandomAccessFile randomAccessFile) {
            return (Builder) super.setRandomAccessFile(randomAccessFile);
        }
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long availableLong = availableLong();
        if (availableLong > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) availableLong;
    }

    public long availableLong() throws IOException {
        if (isClosed()) {
            return 0L;
        }
        return this.f73493c.length() - this.f73493c.getFilePointer();
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f73492b) {
            this.f73493c.close();
        }
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.f73493c;
    }

    public boolean isCloseOnClose() {
        return this.f73492b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f73493c.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        long filePointer = this.f73493c.getFilePointer();
        long length = this.f73493c.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j2 = j + filePointer;
        if (j2 > length) {
            j2 = length - 1;
        }
        if (j2 > 0) {
            this.f73493c.seek(j2);
        }
        return this.f73493c.getFilePointer() - filePointer;
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, boolean z) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.f73493c = randomAccessFile;
        this.f73492b = z;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f73493c.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f73493c.read(bArr, i, i2);
    }
}