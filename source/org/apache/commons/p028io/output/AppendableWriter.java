package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;

/* renamed from: org.apache.commons.io.output.AppendableWriter */
/* loaded from: classes6.dex */
public class AppendableWriter<T extends Appendable> extends Writer {

    /* renamed from: a */
    public final Appendable f73544a;

    public AppendableWriter(T t) {
        this.f73544a = t;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    public T getAppendable() {
        return (T) this.f73544a;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        Objects.requireNonNull(cArr, "cbuf");
        if (i2 >= 0 && i + i2 <= cArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                this.f73544a.append(cArr[i + i3]);
            }
            return;
        }
        throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        this.f73544a.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.f73544a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.f73544a.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.f73544a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str, "str");
        this.f73544a.append(str, i, i2 + i);
    }
}
