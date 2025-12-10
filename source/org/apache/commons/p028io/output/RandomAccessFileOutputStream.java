package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.output.RandomAccessFileOutputStream */
/* loaded from: classes6.dex */
public final class RandomAccessFileOutputStream extends OutputStream {

    /* renamed from: a */
    public final RandomAccessFile f73570a;

    /* renamed from: org.apache.commons.io.output.RandomAccessFileOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static final class Builder extends AbstractStreamBuilder<RandomAccessFileOutputStream, Builder> {
        public Builder() {
            StandardOpenOption standardOpenOption;
            standardOpenOption = StandardOpenOption.WRITE;
            setOpenOptions(standardOpenOption);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public RandomAccessFileOutputStream get() throws IOException {
            return new RandomAccessFileOutputStream(getRandomAccessFile());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73570a.close();
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f73570a.getChannel().force(true);
        super.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f73570a.write(i);
    }

    public RandomAccessFileOutputStream(RandomAccessFile randomAccessFile) {
        Objects.requireNonNull(randomAccessFile);
        this.f73570a = randomAccessFile;
    }
}
