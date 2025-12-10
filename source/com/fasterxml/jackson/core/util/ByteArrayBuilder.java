package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];

    /* renamed from: a */
    public final BufferRecycler f43248a;

    /* renamed from: b */
    public final LinkedList f43249b;

    /* renamed from: c */
    public int f43250c;

    /* renamed from: d */
    public byte[] f43251d;

    /* renamed from: e */
    public int f43252e;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i) {
        return new ByteArrayBuilder(null, bArr, i);
    }

    public void append(int i) {
        if (this.f43252e >= this.f43251d.length) {
            m49500b();
        }
        byte[] bArr = this.f43251d;
        int i2 = this.f43252e;
        this.f43252e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void appendFourBytes(int i) {
        int i2 = this.f43252e;
        int i3 = i2 + 3;
        byte[] bArr = this.f43251d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43252e = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f43252e = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f43252e = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f43252e = i2 + 4;
            bArr[i6] = (byte) i;
            return;
        }
        append(i >> 24);
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public void appendThreeBytes(int i) {
        int i2 = this.f43252e;
        int i3 = i2 + 2;
        byte[] bArr = this.f43251d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43252e = i4;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i2 + 2;
            this.f43252e = i5;
            bArr[i4] = (byte) (i >> 8);
            this.f43252e = i2 + 3;
            bArr[i5] = (byte) i;
            return;
        }
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public void appendTwoBytes(int i) {
        int i2 = this.f43252e;
        int i3 = i2 + 1;
        byte[] bArr = this.f43251d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43252e = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f43252e = i2 + 2;
            bArr[i4] = (byte) i;
            return;
        }
        append(i >> 8);
        append(i);
    }

    /* renamed from: b */
    public final void m49500b() {
        int length = this.f43250c + this.f43251d.length;
        if (length >= 0) {
            this.f43250c = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f43249b.add(this.f43251d);
            this.f43251d = new byte[max];
            this.f43252e = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] completeAndCoalesce(int i) {
        this.f43252e = i;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        m49500b();
        return this.f43251d;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] getCurrentSegment() {
        return this.f43251d;
    }

    public int getCurrentSegmentLength() {
        return this.f43252e;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this.f43248a;
        if (bufferRecycler != null && (bArr = this.f43251d) != null) {
            bufferRecycler.releaseByteBuffer(2, bArr);
            this.f43251d = null;
        }
    }

    public void reset() {
        this.f43250c = 0;
        this.f43252e = 0;
        if (!this.f43249b.isEmpty()) {
            this.f43249b.clear();
        }
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this.f43251d;
    }

    public void setCurrentSegmentLength(int i) {
        this.f43252e = i;
    }

    public int size() {
        return this.f43250c + this.f43252e;
    }

    public byte[] toByteArray() {
        int i = this.f43250c + this.f43252e;
        if (i == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f43249b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f43251d, 0, bArr, i2, this.f43252e);
        int i3 = i2 + this.f43252e;
        if (i3 == i) {
            if (!this.f43249b.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f43251d.length - this.f43252e, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f43251d, this.f43252e, min);
                i += min;
                this.f43252e += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            }
            m49500b();
        }
    }

    public ByteArrayBuilder(int i) {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i) {
        this.f43249b = new LinkedList();
        this.f43248a = bufferRecycler;
        this.f43251d = bufferRecycler == null ? new byte[i] : bufferRecycler.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        append(i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i) {
        this.f43249b = new LinkedList();
        this.f43248a = null;
        this.f43251d = bArr;
        this.f43252e = i;
    }
}
