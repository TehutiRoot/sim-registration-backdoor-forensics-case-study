package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.UnixLineEndingInputStream */
/* loaded from: classes6.dex */
public class UnixLineEndingInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73484a;

    /* renamed from: b */
    public boolean f73485b;

    /* renamed from: c */
    public boolean f73486c;

    /* renamed from: d */
    public final InputStream f73487d;

    /* renamed from: e */
    public final boolean f73488e;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.f73487d = inputStream;
        this.f73488e = z;
    }

    /* renamed from: b */
    public final int m24986b(boolean z) {
        if (z || !this.f73488e || this.f73486c) {
            return -1;
        }
        this.f73486c = true;
        return 10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73487d.close();
    }

    /* renamed from: d */
    public final int m24985d() {
        boolean z;
        boolean z2;
        int read = this.f73487d.read();
        boolean z3 = false;
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.f73484a = z;
        if (z) {
            return read;
        }
        if (read == 13) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f73485b = z2;
        if (read == 10) {
            z3 = true;
        }
        this.f73486c = z3;
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw AbstractC23150yY1.m240a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.f73485b;
        if (this.f73484a) {
            return m24986b(z);
        }
        int m24985d = m24985d();
        if (this.f73484a) {
            return m24986b(z);
        }
        if (this.f73485b) {
            return 10;
        }
        if (z && this.f73486c) {
            return read();
        }
        return m24985d;
    }
}
