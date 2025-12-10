package org.apache.commons.p028io.output;

import java.io.OutputStream;

/* renamed from: org.apache.commons.io.output.CountingOutputStream */
/* loaded from: classes6.dex */
public class CountingOutputStream extends ProxyOutputStream {

    /* renamed from: a */
    public long f73549a;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.p028io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i) {
        this.f73549a += i;
    }

    public synchronized long getByteCount() {
        return this.f73549a;
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= 2147483647L) {
            return (int) byteCount;
        }
        throw new ArithmeticException("The byte count " + byteCount + " is too large to be converted to an int");
    }

    public synchronized long resetByteCount() {
        long j;
        j = this.f73549a;
        this.f73549a = 0L;
        return j;
    }

    public int resetCount() {
        long resetByteCount = resetByteCount();
        if (resetByteCount <= 2147483647L) {
            return (int) resetByteCount;
        }
        throw new ArithmeticException("The byte count " + resetByteCount + " is too large to be converted to an int");
    }
}
