package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p028io.input.ProxyInputStream;

@Deprecated
/* renamed from: org.apache.commons.io.input.CountingInputStream */
/* loaded from: classes6.dex */
public class CountingInputStream extends ProxyInputStream {

    /* renamed from: d */
    public long f73372d;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream
    public synchronized void afterRead(int i) throws IOException {
        if (i != -1) {
            try {
                this.f73372d += i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.afterRead(i);
    }

    public synchronized long getByteCount() {
        return this.f73372d;
    }

    @Deprecated
    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= 2147483647L) {
            return (int) byteCount;
        }
        throw new ArithmeticException("The byte count " + byteCount + " is too large to be converted to an int");
    }

    public synchronized long resetByteCount() {
        long j;
        j = this.f73372d;
        this.f73372d = 0L;
        return j;
    }

    @Deprecated
    public int resetCount() {
        long resetByteCount = resetByteCount();
        if (resetByteCount <= 2147483647L) {
            return (int) resetByteCount;
        }
        throw new ArithmeticException("The byte count " + resetByteCount + " is too large to be converted to an int");
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(j);
        this.f73372d += skip;
        return skip;
    }

    public CountingInputStream(InputStream inputStream, ProxyInputStream.AbstractBuilder abstractBuilder) {
        super(inputStream, abstractBuilder);
    }

    public CountingInputStream(ProxyInputStream.AbstractBuilder abstractBuilder) {
        super(abstractBuilder);
    }
}
