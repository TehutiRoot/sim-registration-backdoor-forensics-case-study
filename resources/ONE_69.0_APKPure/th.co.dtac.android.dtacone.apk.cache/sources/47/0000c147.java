package com.tom_roush.pdfbox.p019io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessBuffer */
/* loaded from: classes5.dex */
public class RandomAccessBuffer implements RandomAccess, Cloneable {

    /* renamed from: a */
    public int f59905a;

    /* renamed from: b */
    public List f59906b;

    /* renamed from: c */
    public byte[] f59907c;

    /* renamed from: d */
    public long f59908d;

    /* renamed from: e */
    public int f59909e;

    /* renamed from: f */
    public long f59910f;

    /* renamed from: g */
    public int f59911g;

    /* renamed from: h */
    public int f59912h;

    public RandomAccessBuffer() {
        this(1024);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() throws IOException {
        return (int) Math.min(length() - getPosition(), 2147483647L);
    }

    /* renamed from: b */
    public final void m32758b() {
        if (this.f59907c != null) {
            return;
        }
        throw new IOException("RandomAccessBuffer already closed");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void clear() {
        this.f59906b.clear();
        byte[] bArr = new byte[this.f59905a];
        this.f59907c = bArr;
        this.f59906b.add(bArr);
        this.f59908d = 0L;
        this.f59909e = 0;
        this.f59910f = 0L;
        this.f59911g = 0;
        this.f59912h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59907c = null;
        this.f59906b.clear();
        this.f59908d = 0L;
        this.f59909e = 0;
        this.f59910f = 0L;
        this.f59911g = 0;
    }

    /* renamed from: d */
    public final void m32757d() {
        if (this.f59912h > this.f59911g) {
            m32756g();
            return;
        }
        byte[] bArr = new byte[this.f59905a];
        this.f59907c = bArr;
        this.f59906b.add(bArr);
        this.f59909e = 0;
        this.f59912h++;
        this.f59911g++;
    }

    /* renamed from: g */
    public final void m32756g() {
        int i = this.f59911g;
        if (i != this.f59912h) {
            this.f59909e = 0;
            List list = this.f59906b;
            int i2 = i + 1;
            this.f59911g = i2;
            this.f59907c = (byte[]) list.get(i2);
            return;
        }
        throw new IOException("No more chunks available, end of buffer reached");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() throws IOException {
        m32758b();
        return this.f59908d;
    }

    /* renamed from: i */
    public final int m32755i(byte[] bArr, int i, int i2) {
        int min = (int) Math.min(i2, this.f59910f - this.f59908d);
        int i3 = this.f59905a;
        int i4 = this.f59909e;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return 0;
        }
        if (min >= i5) {
            System.arraycopy(this.f59907c, i4, bArr, i, i5);
            this.f59909e += i5;
            this.f59908d += i5;
            return i5;
        }
        System.arraycopy(this.f59907c, i4, bArr, i, min);
        this.f59909e += min;
        this.f59908d += min;
        return min;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        if (this.f59907c == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() throws IOException {
        m32758b();
        if (this.f59908d >= this.f59910f) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() throws IOException {
        m32758b();
        return this.f59910f;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int peek() throws IOException {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read() throws IOException {
        m32758b();
        if (this.f59908d >= this.f59910f) {
            return -1;
        }
        if (this.f59909e >= this.f59905a) {
            int i = this.f59911g;
            if (i >= this.f59912h) {
                return -1;
            }
            List list = this.f59906b;
            int i2 = i + 1;
            this.f59911g = i2;
            this.f59907c = (byte[]) list.get(i2);
            this.f59909e = 0;
        }
        this.f59908d++;
        byte[] bArr = this.f59907c;
        int i3 = this.f59909e;
        this.f59909e = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public byte[] readFully(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int read = read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        } while (i2 < i);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void rewind(int i) throws IOException {
        m32758b();
        seek(getPosition() - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) throws IOException {
        m32758b();
        if (j >= 0) {
            this.f59908d = j;
            if (j < this.f59910f) {
                int i = this.f59905a;
                int i2 = (int) (j / i);
                this.f59911g = i2;
                this.f59909e = (int) (j % i);
                this.f59907c = (byte[]) this.f59906b.get(i2);
                return;
            }
            int i3 = this.f59912h;
            this.f59911g = i3;
            this.f59907c = (byte[]) this.f59906b.get(i3);
            this.f59909e = (int) (this.f59910f % this.f59905a);
            return;
        }
        throw new IOException("Invalid position " + j);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(int i) throws IOException {
        m32758b();
        int i2 = this.f59909e;
        int i3 = this.f59905a;
        if (i2 >= i3) {
            if (this.f59908d + i3 < 2147483647L) {
                m32757d();
            } else {
                throw new IOException("RandomAccessBuffer overflow");
            }
        }
        byte[] bArr = this.f59907c;
        int i4 = this.f59909e;
        int i5 = i4 + 1;
        this.f59909e = i5;
        bArr[i4] = (byte) i;
        long j = this.f59908d + 1;
        this.f59908d = j;
        if (j > this.f59910f) {
            this.f59910f = j;
        }
        int i6 = this.f59905a;
        if (i5 >= i6) {
            if (j + i6 < 2147483647L) {
                m32757d();
                return;
            }
            throw new IOException("RandomAccessBuffer overflow");
        }
    }

    public RandomAccessBuffer(int i) {
        this.f59905a = 1024;
        this.f59906b = null;
        ArrayList arrayList = new ArrayList();
        this.f59906b = arrayList;
        this.f59905a = i;
        byte[] bArr = new byte[i];
        this.f59907c = bArr;
        arrayList.add(bArr);
        this.f59908d = 0L;
        this.f59909e = 0;
        this.f59910f = 0L;
        this.f59911g = 0;
        this.f59912h = 0;
    }

    /* renamed from: clone */
    public RandomAccessBuffer m74243clone() {
        RandomAccessBuffer randomAccessBuffer = new RandomAccessBuffer(this.f59905a);
        randomAccessBuffer.f59906b = new ArrayList(this.f59906b.size());
        for (byte[] bArr : this.f59906b) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            randomAccessBuffer.f59906b.add(bArr2);
        }
        if (this.f59907c != null) {
            List list = randomAccessBuffer.f59906b;
            randomAccessBuffer.f59907c = (byte[]) list.get(list.size() - 1);
        } else {
            randomAccessBuffer.f59907c = null;
        }
        randomAccessBuffer.f59908d = this.f59908d;
        randomAccessBuffer.f59909e = this.f59909e;
        randomAccessBuffer.f59910f = this.f59910f;
        randomAccessBuffer.f59911g = this.f59911g;
        randomAccessBuffer.f59912h = this.f59912h;
        return randomAccessBuffer;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m32758b();
        if (this.f59908d >= this.f59910f) {
            return -1;
        }
        int m32755i = m32755i(bArr, i, i2);
        while (m32755i < i2 && available() > 0) {
            m32755i += m32755i(bArr, i + m32755i, i2 - m32755i);
            if (this.f59909e == this.f59905a) {
                m32756g();
            }
        }
        return m32755i;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public RandomAccessBuffer(byte[] bArr) {
        this.f59905a = 1024;
        this.f59906b = null;
        ArrayList arrayList = new ArrayList(1);
        this.f59906b = arrayList;
        this.f59905a = bArr.length;
        this.f59907c = bArr;
        arrayList.add(bArr);
        this.f59908d = 0L;
        this.f59909e = 0;
        this.f59910f = this.f59905a;
        this.f59911g = 0;
        this.f59912h = 0;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr, int i, int i2) throws IOException {
        m32758b();
        long j = i2;
        long j2 = this.f59908d + j;
        int i3 = this.f59905a;
        int i4 = this.f59909e;
        int i5 = i3 - i4;
        if (i2 < i5) {
            System.arraycopy(bArr, i, this.f59907c, i4, i2);
            this.f59909e += i2;
        } else if (j2 <= 2147483647L) {
            System.arraycopy(bArr, i, this.f59907c, i4, i5);
            int i6 = i + i5;
            long j3 = i2 - i5;
            int i7 = ((int) j3) / this.f59905a;
            for (int i8 = 0; i8 < i7; i8++) {
                m32757d();
                System.arraycopy(bArr, i6, this.f59907c, this.f59909e, this.f59905a);
                i6 += this.f59905a;
            }
            long j4 = j3 - (i7 * this.f59905a);
            int i9 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i9 >= 0) {
                m32757d();
                if (i9 > 0) {
                    System.arraycopy(bArr, i6, this.f59907c, this.f59909e, (int) j4);
                }
                this.f59909e = (int) j4;
            }
        } else {
            throw new IOException("RandomAccessBuffer overflow");
        }
        long j5 = this.f59908d + j;
        this.f59908d = j5;
        if (j5 > this.f59910f) {
            this.f59910f = j5;
        }
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public RandomAccessBuffer(InputStream inputStream) throws IOException {
        this();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                write(bArr, 0, read);
            } else {
                seek(0L);
                return;
            }
        }
    }
}