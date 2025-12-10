package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.UnsynchronizedReader */
/* loaded from: classes6.dex */
public abstract class UnsynchronizedReader extends Reader {

    /* renamed from: a */
    public boolean f73501a;

    /* renamed from: b */
    public char[] f73502b;

    /* renamed from: b */
    public void m24980b() {
        AbstractC17721He0.m68061a(!isClosed());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73501a = true;
    }

    public boolean isClosed() {
        return this.f73501a;
    }

    public void setClosed(boolean z) {
        this.f73501a = z;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        int read;
        if (j >= 0) {
            int min = (int) Math.min(j, 8192L);
            char[] cArr = this.f73502b;
            if (cArr == null || cArr.length < min) {
                this.f73502b = new char[min];
            }
            long j2 = j;
            while (j2 > 0 && (read = read(this.f73502b, 0, (int) Math.min(j2, min))) != -1) {
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("skip value < 0");
    }
}
