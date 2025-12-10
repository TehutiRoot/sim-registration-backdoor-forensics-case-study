package org.apache.commons.p028io.input;

import java.io.IOException;
import java.util.Objects;

/* renamed from: org.apache.commons.io.input.CircularInputStream */
/* loaded from: classes6.dex */
public class CircularInputStream extends AbstractInputStream {

    /* renamed from: b */
    public long f73367b;

    /* renamed from: c */
    public int f73368c = -1;

    /* renamed from: d */
    public final byte[] f73369d;

    /* renamed from: e */
    public final long f73370e;

    public CircularInputStream(byte[] bArr, long j) {
        this.f73369d = m25111d(bArr);
        if (bArr.length != 0) {
            this.f73370e = j;
            return;
        }
        throw new IllegalArgumentException("repeatContent is empty.");
    }

    /* renamed from: d */
    public static byte[] m25111d(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b : bArr) {
            if (b == -1) {
                throw new IllegalArgumentException("repeatContent contains the end-of-stream marker -1");
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (isClosed()) {
            return 0;
        }
        long j = this.f73370e;
        if (j <= 2147483647L) {
            return Math.max(Integer.MAX_VALUE, (int) j);
        }
        return Integer.MAX_VALUE;
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73367b = this.f73370e;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f73370e >= 0 || isClosed()) {
            long j = this.f73367b;
            if (j == this.f73370e) {
                return -1;
            }
            this.f73367b = j + 1;
        }
        byte[] bArr = this.f73369d;
        int length = (this.f73368c + 1) % bArr.length;
        this.f73368c = length;
        return bArr[length] & 255;
    }
}
