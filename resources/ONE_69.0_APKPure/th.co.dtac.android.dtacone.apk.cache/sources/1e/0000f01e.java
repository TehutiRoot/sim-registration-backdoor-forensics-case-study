package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.WindowsLineEndingInputStream */
/* loaded from: classes6.dex */
public class WindowsLineEndingInputStream extends InputStream {

    /* renamed from: a */
    public boolean f73587a;

    /* renamed from: b */
    public boolean f73588b;

    /* renamed from: c */
    public boolean f73589c;

    /* renamed from: d */
    public final InputStream f73590d;

    /* renamed from: e */
    public boolean f73591e;

    /* renamed from: f */
    public final boolean f73592f;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
        this.f73590d = inputStream;
        this.f73592f = z;
    }

    /* renamed from: b */
    public final int m25169b() {
        if (!this.f73592f) {
            return -1;
        }
        boolean z = this.f73589c;
        if (!z && !this.f73588b) {
            this.f73588b = true;
            return 13;
        } else if (z) {
            return -1;
        } else {
            this.f73588b = false;
            this.f73589c = true;
            return 10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73590d.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw AbstractC22704vZ1.m889a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z;
        boolean z2;
        if (this.f73587a) {
            return m25169b();
        }
        boolean z3 = false;
        if (this.f73591e) {
            this.f73591e = false;
            return 10;
        }
        boolean z4 = this.f73588b;
        int read = this.f73590d.read();
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        this.f73587a = z;
        if (!z) {
            if (read == 13) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f73588b = z2;
            if (read == 10) {
                z3 = true;
            }
            this.f73589c = z3;
        }
        if (z) {
            return m25169b();
        }
        if (read == 10 && !z4) {
            this.f73591e = true;
            return 13;
        }
        return read;
    }
}