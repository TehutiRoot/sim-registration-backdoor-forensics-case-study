package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.IdentityInputStream */
/* loaded from: classes6.dex */
public class IdentityInputStream extends InputStream {

    /* renamed from: a */
    public final SessionInputBuffer f74584a;

    /* renamed from: b */
    public boolean f74585b = false;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.f74584a = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f74584a;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74585b = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f74585b) {
            return -1;
        }
        return this.f74584a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f74585b) {
            return -1;
        }
        return this.f74584a.read(bArr, i, i2);
    }
}