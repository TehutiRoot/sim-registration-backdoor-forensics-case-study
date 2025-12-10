package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.UnixLineEndingInputStream */
/* loaded from: classes6.dex */
public class UnixLineEndingInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73568a;

    /* renamed from: b */
    public boolean f73569b;

    /* renamed from: c */
    public boolean f73570c;

    /* renamed from: d */
    public final InputStream f73571d;

    /* renamed from: e */
    public final boolean f73572e;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.f73571d = inputStream;
        this.f73572e = z;
    }

    /* renamed from: b */
    public final int m25176b(boolean z) {
        if (z || !this.f73572e || this.f73570c) {
            return -1;
        }
        this.f73570c = true;
        return 10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73571d.close();
    }

    /* renamed from: d */
    public final int m25175d() {
        boolean z;
        boolean z2;
        int read = this.f73571d.read();
        boolean z3 = false;
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.f73568a = z;
        if (z) {
            return read;
        }
        if (read == 13) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f73569b = z2;
        if (read == 10) {
            z3 = true;
        }
        this.f73570c = z3;
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw AbstractC22704vZ1.m889a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.f73569b;
        if (this.f73568a) {
            return m25176b(z);
        }
        int m25175d = m25175d();
        if (this.f73568a) {
            return m25176b(z);
        }
        if (this.f73569b) {
            return 10;
        }
        if (z && this.f73570c) {
            return read();
        }
        return m25175d;
    }
}