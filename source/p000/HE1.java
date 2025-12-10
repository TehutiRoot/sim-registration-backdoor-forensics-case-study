package p000;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: HE1 */
/* loaded from: classes5.dex */
public class HE1 implements RandomAccess {

    /* renamed from: a */
    public final int f2139a;

    /* renamed from: b */
    public ScratchFile f2140b;

    /* renamed from: d */
    public int f2142d;

    /* renamed from: e */
    public long f2143e;

    /* renamed from: f */
    public byte[] f2144f;

    /* renamed from: g */
    public int f2145g;

    /* renamed from: c */
    public long f2141c = 0;

    /* renamed from: h */
    public boolean f2146h = false;

    /* renamed from: i */
    public int[] f2147i = new int[16];

    /* renamed from: j */
    public int f2148j = 0;

    public HE1(ScratchFile scratchFile) {
        scratchFile.m32755b();
        this.f2140b = scratchFile;
        this.f2139a = scratchFile.m32752i();
        m68117b();
    }

    /* renamed from: d */
    private void m68116d() {
        ScratchFile scratchFile = this.f2140b;
        if (scratchFile != null) {
            scratchFile.m32755b();
            return;
        }
        throw new IOException("Buffer already closed");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() {
        m68116d();
        return (int) Math.min(this.f2141c - (this.f2143e + this.f2145g), 2147483647L);
    }

    /* renamed from: b */
    public final void m68117b() {
        int i = this.f2148j;
        int i2 = i + 1;
        int[] iArr = this.f2147i;
        if (i2 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length != Integer.MAX_VALUE) {
                    length = Integer.MAX_VALUE;
                } else {
                    throw new IOException("Maximum buffer size reached.");
                }
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f2147i = iArr2;
        }
        int m32753g = this.f2140b.m32753g();
        int[] iArr3 = this.f2147i;
        int i3 = this.f2148j;
        iArr3[i3] = m32753g;
        this.f2142d = i3;
        int i4 = this.f2139a;
        this.f2143e = i3 * i4;
        this.f2148j = i3 + 1;
        this.f2144f = new byte[i4];
        this.f2145g = 0;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public final void clear() {
        m68116d();
        this.f2140b.m32751j(this.f2147i, 1, this.f2148j - 1);
        this.f2148j = 1;
        if (this.f2142d > 0) {
            this.f2144f = this.f2140b.m32750k(this.f2147i[0]);
            this.f2142d = 0;
            this.f2143e = 0L;
        }
        this.f2145g = 0;
        this.f2141c = 0L;
        this.f2146h = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ScratchFile scratchFile = this.f2140b;
        if (scratchFile != null) {
            scratchFile.m32751j(this.f2147i, 0, this.f2148j);
            this.f2140b = null;
            this.f2147i = null;
            this.f2144f = null;
            this.f2143e = 0L;
            this.f2142d = -1;
            this.f2145g = 0;
            this.f2141c = 0L;
        }
    }

    public void finalize() {
        try {
            if (this.f2140b != null) {
                PDFBoxConfig.isDebugEnabled();
            }
            close();
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* renamed from: g */
    public final boolean m68115g(boolean z) {
        if (this.f2145g >= this.f2139a) {
            if (this.f2146h) {
                this.f2140b.m32749l(this.f2147i[this.f2142d], this.f2144f);
                this.f2146h = false;
            }
            int i = this.f2142d;
            if (i + 1 < this.f2148j) {
                ScratchFile scratchFile = this.f2140b;
                int[] iArr = this.f2147i;
                int i2 = i + 1;
                this.f2142d = i2;
                this.f2144f = scratchFile.m32750k(iArr[i2]);
                this.f2143e = this.f2142d * this.f2139a;
                this.f2145g = 0;
            } else if (!z) {
                return false;
            } else {
                m68117b();
            }
        }
        return true;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() {
        m68116d();
        return this.f2143e + this.f2145g;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        if (this.f2140b == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() {
        m68116d();
        if (this.f2143e + this.f2145g >= this.f2141c) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() {
        return this.f2141c;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int peek() {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read() {
        m68116d();
        if (this.f2143e + this.f2145g >= this.f2141c) {
            return -1;
        }
        if (m68115g(false)) {
            byte[] bArr = this.f2144f;
            int i = this.f2145g;
            this.f2145g = i + 1;
            return bArr[i] & 255;
        }
        throw new IOException("Unexpectedly no bytes available for read in buffer.");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public byte[] readFully(int i) {
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
    public void rewind(int i) {
        seek((this.f2143e + this.f2145g) - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) {
        m68116d();
        if (j <= this.f2141c) {
            if (j >= 0) {
                long j2 = this.f2143e;
                if (j >= j2 && j <= this.f2139a + j2) {
                    this.f2145g = (int) (j - j2);
                    return;
                }
                if (this.f2146h) {
                    this.f2140b.m32749l(this.f2147i[this.f2142d], this.f2144f);
                    this.f2146h = false;
                }
                int i = this.f2139a;
                int i2 = (int) (j / i);
                if (j % i == 0 && j == this.f2141c) {
                    i2--;
                }
                this.f2144f = this.f2140b.m32750k(this.f2147i[i2]);
                this.f2142d = i2;
                long j3 = i2 * this.f2139a;
                this.f2143e = j3;
                this.f2145g = (int) (j - j3);
                return;
            }
            throw new IOException("Negative seek offset: " + j);
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(int i) {
        m68116d();
        m68115g(true);
        byte[] bArr = this.f2144f;
        int i2 = this.f2145g;
        int i3 = i2 + 1;
        this.f2145g = i3;
        bArr[i2] = (byte) i;
        this.f2146h = true;
        long j = this.f2143e;
        if (i3 + j > this.f2141c) {
            this.f2141c = j + i3;
        }
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) {
        m68116d();
        long j = this.f2143e;
        int i3 = this.f2145g;
        long j2 = this.f2141c;
        if (i3 + j >= j2) {
            return -1;
        }
        int min = (int) Math.min(i2, j2 - (j + i3));
        int i4 = 0;
        while (min > 0) {
            if (m68115g(false)) {
                int min2 = Math.min(min, this.f2139a - this.f2145g);
                System.arraycopy(this.f2144f, this.f2145g, bArr, i, min2);
                this.f2145g += min2;
                i4 += min2;
                i += min2;
                min -= min2;
            } else {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
        }
        return i4;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr, int i, int i2) {
        m68116d();
        while (i2 > 0) {
            m68115g(true);
            int min = Math.min(i2, this.f2139a - this.f2145g);
            System.arraycopy(bArr, i, this.f2144f, this.f2145g, min);
            this.f2145g += min;
            this.f2146h = true;
            i += min;
            i2 -= min;
        }
        long j = this.f2143e;
        int i3 = this.f2145g;
        if (i3 + j > this.f2141c) {
            this.f2141c = j + i3;
        }
    }
}
