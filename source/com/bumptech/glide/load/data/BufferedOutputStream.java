package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class BufferedOutputStream extends OutputStream {

    /* renamed from: a */
    public final OutputStream f41849a;

    /* renamed from: b */
    public byte[] f41850b;

    /* renamed from: c */
    public ArrayPool f41851c;

    /* renamed from: d */
    public int f41852d;

    public BufferedOutputStream(@NonNull OutputStream outputStream, @NonNull ArrayPool arrayPool) {
        this(outputStream, arrayPool, 65536);
    }

    /* renamed from: b */
    public final void m50501b() {
        int i = this.f41852d;
        if (i > 0) {
            this.f41849a.write(this.f41850b, 0, i);
            this.f41852d = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f41849a.close();
            release();
        } catch (Throwable th2) {
            this.f41849a.close();
            throw th2;
        }
    }

    /* renamed from: d */
    public final void m50500d() {
        if (this.f41852d == this.f41850b.length) {
            m50501b();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m50501b();
        this.f41849a.flush();
    }

    public final void release() {
        byte[] bArr = this.f41850b;
        if (bArr != null) {
            this.f41851c.put(bArr);
            this.f41850b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f41850b;
        int i2 = this.f41852d;
        this.f41852d = i2 + 1;
        bArr[i2] = (byte) i;
        m50500d();
    }

    public BufferedOutputStream(OutputStream outputStream, ArrayPool arrayPool, int i) {
        this.f41849a = outputStream;
        this.f41851c = arrayPool;
        this.f41850b = (byte[]) arrayPool.get(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f41852d;
            if (i6 == 0 && i4 >= this.f41850b.length) {
                this.f41849a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f41850b.length - i6);
            System.arraycopy(bArr, i5, this.f41850b, this.f41852d, min);
            this.f41852d += min;
            i3 += min;
            m50500d();
        } while (i3 < i2);
    }
}
