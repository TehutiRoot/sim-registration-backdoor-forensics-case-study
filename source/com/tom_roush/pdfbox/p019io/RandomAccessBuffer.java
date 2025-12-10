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
    public int f59893a;

    /* renamed from: b */
    public List f59894b;

    /* renamed from: c */
    public byte[] f59895c;

    /* renamed from: d */
    public long f59896d;

    /* renamed from: e */
    public int f59897e;

    /* renamed from: f */
    public long f59898f;

    /* renamed from: g */
    public int f59899g;

    /* renamed from: h */
    public int f59900h;

    public RandomAccessBuffer() {
        this(1024);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() throws IOException {
        return (int) Math.min(length() - getPosition(), 2147483647L);
    }

    /* renamed from: b */
    public final void m32766b() {
        if (this.f59895c != null) {
            return;
        }
        throw new IOException("RandomAccessBuffer already closed");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void clear() {
        this.f59894b.clear();
        byte[] bArr = new byte[this.f59893a];
        this.f59895c = bArr;
        this.f59894b.add(bArr);
        this.f59896d = 0L;
        this.f59897e = 0;
        this.f59898f = 0L;
        this.f59899g = 0;
        this.f59900h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59895c = null;
        this.f59894b.clear();
        this.f59896d = 0L;
        this.f59897e = 0;
        this.f59898f = 0L;
        this.f59899g = 0;
    }

    /* renamed from: d */
    public final void m32765d() {
        if (this.f59900h > this.f59899g) {
            m32764g();
            return;
        }
        byte[] bArr = new byte[this.f59893a];
        this.f59895c = bArr;
        this.f59894b.add(bArr);
        this.f59897e = 0;
        this.f59900h++;
        this.f59899g++;
    }

    /* renamed from: g */
    public final void m32764g() {
        int i = this.f59899g;
        if (i != this.f59900h) {
            this.f59897e = 0;
            List list = this.f59894b;
            int i2 = i + 1;
            this.f59899g = i2;
            this.f59895c = (byte[]) list.get(i2);
            return;
        }
        throw new IOException("No more chunks available, end of buffer reached");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() throws IOException {
        m32766b();
        return this.f59896d;
    }

    /* renamed from: i */
    public final int m32763i(byte[] bArr, int i, int i2) {
        int min = (int) Math.min(i2, this.f59898f - this.f59896d);
        int i3 = this.f59893a;
        int i4 = this.f59897e;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return 0;
        }
        if (min >= i5) {
            System.arraycopy(this.f59895c, i4, bArr, i, i5);
            this.f59897e += i5;
            this.f59896d += i5;
            return i5;
        }
        System.arraycopy(this.f59895c, i4, bArr, i, min);
        this.f59897e += min;
        this.f59896d += min;
        return min;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        if (this.f59895c == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() throws IOException {
        m32766b();
        if (this.f59896d >= this.f59898f) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() throws IOException {
        m32766b();
        return this.f59898f;
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
        m32766b();
        if (this.f59896d >= this.f59898f) {
            return -1;
        }
        if (this.f59897e >= this.f59893a) {
            int i = this.f59899g;
            if (i >= this.f59900h) {
                return -1;
            }
            List list = this.f59894b;
            int i2 = i + 1;
            this.f59899g = i2;
            this.f59895c = (byte[]) list.get(i2);
            this.f59897e = 0;
        }
        this.f59896d++;
        byte[] bArr = this.f59895c;
        int i3 = this.f59897e;
        this.f59897e = i3 + 1;
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
        m32766b();
        seek(getPosition() - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) throws IOException {
        m32766b();
        if (j >= 0) {
            this.f59896d = j;
            if (j < this.f59898f) {
                int i = this.f59893a;
                int i2 = (int) (j / i);
                this.f59899g = i2;
                this.f59897e = (int) (j % i);
                this.f59895c = (byte[]) this.f59894b.get(i2);
                return;
            }
            int i3 = this.f59900h;
            this.f59899g = i3;
            this.f59895c = (byte[]) this.f59894b.get(i3);
            this.f59897e = (int) (this.f59898f % this.f59893a);
            return;
        }
        throw new IOException("Invalid position " + j);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(int i) throws IOException {
        m32766b();
        int i2 = this.f59897e;
        int i3 = this.f59893a;
        if (i2 >= i3) {
            if (this.f59896d + i3 < 2147483647L) {
                m32765d();
            } else {
                throw new IOException("RandomAccessBuffer overflow");
            }
        }
        byte[] bArr = this.f59895c;
        int i4 = this.f59897e;
        int i5 = i4 + 1;
        this.f59897e = i5;
        bArr[i4] = (byte) i;
        long j = this.f59896d + 1;
        this.f59896d = j;
        if (j > this.f59898f) {
            this.f59898f = j;
        }
        int i6 = this.f59893a;
        if (i5 >= i6) {
            if (j + i6 < 2147483647L) {
                m32765d();
                return;
            }
            throw new IOException("RandomAccessBuffer overflow");
        }
    }

    public RandomAccessBuffer(int i) {
        this.f59893a = 1024;
        this.f59894b = null;
        ArrayList arrayList = new ArrayList();
        this.f59894b = arrayList;
        this.f59893a = i;
        byte[] bArr = new byte[i];
        this.f59895c = bArr;
        arrayList.add(bArr);
        this.f59896d = 0L;
        this.f59897e = 0;
        this.f59898f = 0L;
        this.f59899g = 0;
        this.f59900h = 0;
    }

    /* renamed from: clone */
    public RandomAccessBuffer m74059clone() {
        RandomAccessBuffer randomAccessBuffer = new RandomAccessBuffer(this.f59893a);
        randomAccessBuffer.f59894b = new ArrayList(this.f59894b.size());
        for (byte[] bArr : this.f59894b) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            randomAccessBuffer.f59894b.add(bArr2);
        }
        if (this.f59895c != null) {
            List list = randomAccessBuffer.f59894b;
            randomAccessBuffer.f59895c = (byte[]) list.get(list.size() - 1);
        } else {
            randomAccessBuffer.f59895c = null;
        }
        randomAccessBuffer.f59896d = this.f59896d;
        randomAccessBuffer.f59897e = this.f59897e;
        randomAccessBuffer.f59898f = this.f59898f;
        randomAccessBuffer.f59899g = this.f59899g;
        randomAccessBuffer.f59900h = this.f59900h;
        return randomAccessBuffer;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m32766b();
        if (this.f59896d >= this.f59898f) {
            return -1;
        }
        int m32763i = m32763i(bArr, i, i2);
        while (m32763i < i2 && available() > 0) {
            m32763i += m32763i(bArr, i + m32763i, i2 - m32763i);
            if (this.f59897e == this.f59893a) {
                m32764g();
            }
        }
        return m32763i;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public RandomAccessBuffer(byte[] bArr) {
        this.f59893a = 1024;
        this.f59894b = null;
        ArrayList arrayList = new ArrayList(1);
        this.f59894b = arrayList;
        this.f59893a = bArr.length;
        this.f59895c = bArr;
        arrayList.add(bArr);
        this.f59896d = 0L;
        this.f59897e = 0;
        this.f59898f = this.f59893a;
        this.f59899g = 0;
        this.f59900h = 0;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr, int i, int i2) throws IOException {
        m32766b();
        long j = i2;
        long j2 = this.f59896d + j;
        int i3 = this.f59893a;
        int i4 = this.f59897e;
        int i5 = i3 - i4;
        if (i2 < i5) {
            System.arraycopy(bArr, i, this.f59895c, i4, i2);
            this.f59897e += i2;
        } else if (j2 <= 2147483647L) {
            System.arraycopy(bArr, i, this.f59895c, i4, i5);
            int i6 = i + i5;
            long j3 = i2 - i5;
            int i7 = ((int) j3) / this.f59893a;
            for (int i8 = 0; i8 < i7; i8++) {
                m32765d();
                System.arraycopy(bArr, i6, this.f59895c, this.f59897e, this.f59893a);
                i6 += this.f59893a;
            }
            long j4 = j3 - (i7 * this.f59893a);
            int i9 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i9 >= 0) {
                m32765d();
                if (i9 > 0) {
                    System.arraycopy(bArr, i6, this.f59895c, this.f59897e, (int) j4);
                }
                this.f59897e = (int) j4;
            }
        } else {
            throw new IOException("RandomAccessBuffer overflow");
        }
        long j5 = this.f59896d + j;
        this.f59896d = j5;
        if (j5 > this.f59898f) {
            this.f59898f = j5;
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
