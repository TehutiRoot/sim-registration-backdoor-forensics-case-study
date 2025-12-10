package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.BoundedReader */
/* loaded from: classes6.dex */
public class BoundedReader extends Reader {

    /* renamed from: a */
    public final Reader f73346a;

    /* renamed from: b */
    public int f73347b;

    /* renamed from: c */
    public int f73348c = -1;

    /* renamed from: d */
    public int f73349d;

    /* renamed from: e */
    public final int f73350e;

    public BoundedReader(Reader reader, int i) {
        this.f73346a = reader;
        this.f73350e = i;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73346a.close();
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        int i2 = this.f73347b;
        this.f73349d = i - i2;
        this.f73348c = i2;
        this.f73346a.mark(i);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i = this.f73347b;
        if (i >= this.f73350e) {
            return -1;
        }
        int i2 = this.f73348c;
        if (i2 < 0 || i - i2 < this.f73349d) {
            this.f73347b = i + 1;
            return this.f73346a.read();
        }
        return -1;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.f73347b = this.f73348c;
        this.f73346a.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            cArr[i + i3] = (char) read;
        }
        return i2;
    }
}
