package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.WindowsLineEndingInputStream */
/* loaded from: classes6.dex */
public class WindowsLineEndingInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73503a;

    /* renamed from: b */
    public boolean f73504b;

    /* renamed from: c */
    public boolean f73505c;

    /* renamed from: d */
    public final InputStream f73506d;

    /* renamed from: e */
    public boolean f73507e;

    /* renamed from: f */
    public final boolean f73508f;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
        this.f73506d = inputStream;
        this.f73508f = z;
    }

    /* renamed from: b */
    public final int m24979b() {
        if (!this.f73508f) {
            return -1;
        }
        boolean z = this.f73505c;
        if (!z && !this.f73504b) {
            this.f73504b = true;
            return 13;
        } else if (z) {
            return -1;
        } else {
            this.f73504b = false;
            this.f73505c = true;
            return 10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73506d.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw AbstractC23150yY1.m240a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z;
        boolean z2;
        if (this.f73503a) {
            return m24979b();
        }
        boolean z3 = false;
        if (this.f73507e) {
            this.f73507e = false;
            return 10;
        }
        boolean z4 = this.f73504b;
        int read = this.f73506d.read();
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.f73503a = z;
        if (!z) {
            if (read == 13) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f73504b = z2;
            if (read == 10) {
                z3 = true;
            }
            this.f73505c = z3;
        }
        if (z) {
            return m24979b();
        }
        if (read == 10 && !z4) {
            this.f73507e = true;
            return 13;
        }
        return read;
    }
}
