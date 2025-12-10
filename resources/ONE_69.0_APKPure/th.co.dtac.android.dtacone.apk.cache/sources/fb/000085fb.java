package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];

    /* renamed from: a */
    public final BufferRecycler f43260a;

    /* renamed from: b */
    public final LinkedList f43261b;

    /* renamed from: c */
    public int f43262c;

    /* renamed from: d */
    public byte[] f43263d;

    /* renamed from: e */
    public int f43264e;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i) {
        return new ByteArrayBuilder(null, bArr, i);
    }

    public void append(int i) {
        if (this.f43264e >= this.f43263d.length) {
            m49497b();
        }
        byte[] bArr = this.f43263d;
        int i2 = this.f43264e;
        this.f43264e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void appendFourBytes(int i) {
        int i2 = this.f43264e;
        int i3 = i2 + 3;
        byte[] bArr = this.f43263d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43264e = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f43264e = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f43264e = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f43264e = i2 + 4;
            bArr[i6] = (byte) i;
            return;
        }
        append(i >> 24);
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public void appendThreeBytes(int i) {
        int i2 = this.f43264e;
        int i3 = i2 + 2;
        byte[] bArr = this.f43263d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43264e = i4;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i2 + 2;
            this.f43264e = i5;
            bArr[i4] = (byte) (i >> 8);
            this.f43264e = i2 + 3;
            bArr[i5] = (byte) i;
            return;
        }
        append(i >> 16);
        append(i >> 8);
        append(i);
    }

    public void appendTwoBytes(int i) {
        int i2 = this.f43264e;
        int i3 = i2 + 1;
        byte[] bArr = this.f43263d;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.f43264e = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f43264e = i2 + 2;
            bArr[i4] = (byte) i;
            return;
        }
        append(i >> 8);
        append(i);
    }

    /* renamed from: b */
    public final void m49497b() {
        int length = this.f43262c + this.f43263d.length;
        if (length >= 0) {
            this.f43262c = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f43261b.add(this.f43263d);
            this.f43263d = new byte[max];
            this.f43264e = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] completeAndCoalesce(int i) {
        this.f43264e = i;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        m49497b();
        return this.f43263d;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] getCurrentSegment() {
        return this.f43263d;
    }

    public int getCurrentSegmentLength() {
        return this.f43264e;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this.f43260a;
        if (bufferRecycler != null && (bArr = this.f43263d) != null) {
            bufferRecycler.releaseByteBuffer(2, bArr);
            this.f43263d = null;
        }
    }

    public void reset() {
        this.f43262c = 0;
        this.f43264e = 0;
        if (!this.f43261b.isEmpty()) {
            this.f43261b.clear();
        }
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this.f43263d;
    }

    public void setCurrentSegmentLength(int i) {
        this.f43264e = i;
    }

    public int size() {
        return this.f43262c + this.f43264e;
    }

    public byte[] toByteArray() {
        int i = this.f43262c + this.f43264e;
        if (i == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f43261b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f43263d, 0, bArr, i2, this.f43264e);
        int i3 = i2 + this.f43264e;
        if (i3 == i) {
            if (!this.f43261b.isEmpty()) {
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
            int min = Math.min(this.f43263d.length - this.f43264e, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f43263d, this.f43264e, min);
                i += min;
                this.f43264e += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            }
            m49497b();
        }
    }

    public ByteArrayBuilder(int i) {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i) {
        this.f43261b = new LinkedList();
        this.f43260a = bufferRecycler;
        this.f43263d = bufferRecycler == null ? new byte[i] : bufferRecycler.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        append(i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i) {
        this.f43261b = new LinkedList();
        this.f43260a = null;
        this.f43263d = bArr;
        this.f43264e = i;
    }
}