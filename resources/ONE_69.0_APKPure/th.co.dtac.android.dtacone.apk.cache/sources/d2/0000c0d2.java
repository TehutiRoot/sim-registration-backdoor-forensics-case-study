package com.tom_roush.harmony.javax.imageio.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class RandomAccessMemoryCache {

    /* renamed from: a */
    public long f59717a;

    /* renamed from: b */
    public int f59718b = 0;

    /* renamed from: c */
    public ArrayList f59719c = new ArrayList();

    /* renamed from: a */
    public final void m32791a(long j) {
        int size = (((int) (j >> 9)) - this.f59719c.size()) + 1;
        for (int i = 0; i < size; i++) {
            this.f59719c.add(new byte[512]);
        }
        this.f59717a = j + 1;
    }

    public int appendData(InputStream inputStream, int i) throws IOException {
        if (i <= 0) {
            return 0;
        }
        long j = this.f59717a;
        m32791a((i + j) - 1);
        int i2 = (int) (j >> 9);
        int i3 = (int) (j & 511);
        int i4 = 0;
        while (i > 0) {
            byte[] bArr = (byte[]) this.f59719c.get(i2);
            int min = Math.min(512 - i3, i);
            i -= min;
            i4 += min;
            while (min > 0) {
                int read = inputStream.read(bArr, i3, min);
                if (read < 0) {
                    this.f59717a -= i - i4;
                    return i4;
                }
                min -= read;
                i3 += read;
            }
            i2++;
            i3 = 0;
        }
        return i4;
    }

    public void close() {
        this.f59719c.clear();
        this.f59717a = 0L;
    }

    public void freeBefore(long j) {
        int i = (int) (j >> 9);
        int i2 = this.f59718b;
        if (i <= i2) {
            return;
        }
        while (i2 < i) {
            this.f59719c.set(i2, null);
            i2++;
        }
        this.f59718b = i;
    }

    public int getData(long j) {
        if (j >= this.f59717a) {
            return -1;
        }
        return ((byte[]) this.f59719c.get((int) (j >> 9)))[(int) (j & 511)] & 255;
    }

    public long length() {
        return this.f59717a;
    }

    public void putData(int i, long j) {
        if (j >= this.f59717a) {
            m32791a(j);
        }
        ((byte[]) this.f59719c.get((int) (j >> 9)))[(int) (j & 511)] = (byte) i;
    }

    public int getData(byte[] bArr, int i, int i2, long j) {
        if (i2 > bArr.length - i || i2 < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f59717a;
        if (j >= j2) {
            return -1;
        }
        if (i2 + j > j2) {
            i2 = (int) (j2 - j);
        }
        int i3 = (int) (j & 511);
        int min = Math.min(i2, 512 - i3);
        System.arraycopy((byte[]) this.f59719c.get((int) (j >> 9)), i3, bArr, i, min);
        return min;
    }

    public void putData(byte[] bArr, int i, int i2, long j) {
        if (i2 > bArr.length - i || i2 < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        long j2 = (i2 + j) - 1;
        if (j2 >= this.f59717a) {
            m32791a(j2);
        }
        while (i2 > 0) {
            int i3 = (int) (511 & j);
            int min = Math.min(512 - i3, i2);
            System.arraycopy(bArr, i, (byte[]) this.f59719c.get((int) (j >> 9)), i3, min);
            j += min;
            i2 -= min;
            i += min;
        }
    }

    public void getData(OutputStream outputStream, int i, long j) throws IOException {
        if (i + j <= this.f59717a) {
            int i2 = (int) (j >> 9);
            int i3 = (int) (j & 511);
            if (i2 < this.f59718b) {
                throw new IndexOutOfBoundsException("The requested data are already disposed");
            }
            while (i > 0) {
                int min = Math.min(512 - i3, i);
                outputStream.write((byte[]) this.f59719c.get(i2), i3, min);
                i2++;
                i -= min;
                i3 = 0;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Argument out of cache");
    }
}