package p000;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: EF1 */
/* loaded from: classes5.dex */
public class EF1 implements RandomAccess {

    /* renamed from: a */
    public final int f1288a;

    /* renamed from: b */
    public ScratchFile f1289b;

    /* renamed from: d */
    public int f1291d;

    /* renamed from: e */
    public long f1292e;

    /* renamed from: f */
    public byte[] f1293f;

    /* renamed from: g */
    public int f1294g;

    /* renamed from: c */
    public long f1290c = 0;

    /* renamed from: h */
    public boolean f1295h = false;

    /* renamed from: i */
    public int[] f1296i = new int[16];

    /* renamed from: j */
    public int f1297j = 0;

    public EF1(ScratchFile scratchFile) {
        scratchFile.m32747b();
        this.f1289b = scratchFile;
        this.f1288a = scratchFile.m32744i();
        m68679b();
    }

    /* renamed from: d */
    private void m68678d() {
        ScratchFile scratchFile = this.f1289b;
        if (scratchFile != null) {
            scratchFile.m32747b();
            return;
        }
        throw new IOException("Buffer already closed");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() {
        m68678d();
        return (int) Math.min(this.f1290c - (this.f1292e + this.f1294g), 2147483647L);
    }

    /* renamed from: b */
    public final void m68679b() {
        int i = this.f1297j;
        int i2 = i + 1;
        int[] iArr = this.f1296i;
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
            this.f1296i = iArr2;
        }
        int m32745g = this.f1289b.m32745g();
        int[] iArr3 = this.f1296i;
        int i3 = this.f1297j;
        iArr3[i3] = m32745g;
        this.f1291d = i3;
        int i4 = this.f1288a;
        this.f1292e = i3 * i4;
        this.f1297j = i3 + 1;
        this.f1293f = new byte[i4];
        this.f1294g = 0;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public final void clear() {
        m68678d();
        this.f1289b.m32743j(this.f1296i, 1, this.f1297j - 1);
        this.f1297j = 1;
        if (this.f1291d > 0) {
            this.f1293f = this.f1289b.m32742k(this.f1296i[0]);
            this.f1291d = 0;
            this.f1292e = 0L;
        }
        this.f1294g = 0;
        this.f1290c = 0L;
        this.f1295h = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ScratchFile scratchFile = this.f1289b;
        if (scratchFile != null) {
            scratchFile.m32743j(this.f1296i, 0, this.f1297j);
            this.f1289b = null;
            this.f1296i = null;
            this.f1293f = null;
            this.f1292e = 0L;
            this.f1291d = -1;
            this.f1294g = 0;
            this.f1290c = 0L;
        }
    }

    public void finalize() {
        try {
            if (this.f1289b != null) {
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
    public final boolean m68677g(boolean z) {
        if (this.f1294g >= this.f1288a) {
            if (this.f1295h) {
                this.f1289b.m32741l(this.f1296i[this.f1291d], this.f1293f);
                this.f1295h = false;
            }
            int i = this.f1291d;
            if (i + 1 < this.f1297j) {
                ScratchFile scratchFile = this.f1289b;
                int[] iArr = this.f1296i;
                int i2 = i + 1;
                this.f1291d = i2;
                this.f1293f = scratchFile.m32742k(iArr[i2]);
                this.f1292e = this.f1291d * this.f1288a;
                this.f1294g = 0;
            } else if (!z) {
                return false;
            } else {
                m68679b();
            }
        }
        return true;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() {
        m68678d();
        return this.f1292e + this.f1294g;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        if (this.f1289b == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() {
        m68678d();
        if (this.f1292e + this.f1294g >= this.f1290c) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() {
        return this.f1290c;
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
        m68678d();
        if (this.f1292e + this.f1294g >= this.f1290c) {
            return -1;
        }
        if (m68677g(false)) {
            byte[] bArr = this.f1293f;
            int i = this.f1294g;
            this.f1294g = i + 1;
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
        seek((this.f1292e + this.f1294g) - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) {
        m68678d();
        if (j <= this.f1290c) {
            if (j >= 0) {
                long j2 = this.f1292e;
                if (j >= j2 && j <= this.f1288a + j2) {
                    this.f1294g = (int) (j - j2);
                    return;
                }
                if (this.f1295h) {
                    this.f1289b.m32741l(this.f1296i[this.f1291d], this.f1293f);
                    this.f1295h = false;
                }
                int i = this.f1288a;
                int i2 = (int) (j / i);
                if (j % i == 0 && j == this.f1290c) {
                    i2--;
                }
                this.f1293f = this.f1289b.m32742k(this.f1296i[i2]);
                this.f1291d = i2;
                long j3 = i2 * this.f1288a;
                this.f1292e = j3;
                this.f1294g = (int) (j - j3);
                return;
            }
            throw new IOException("Negative seek offset: " + j);
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(int i) {
        m68678d();
        m68677g(true);
        byte[] bArr = this.f1293f;
        int i2 = this.f1294g;
        int i3 = i2 + 1;
        this.f1294g = i3;
        bArr[i2] = (byte) i;
        this.f1295h = true;
        long j = this.f1292e;
        if (i3 + j > this.f1290c) {
            this.f1290c = j + i3;
        }
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) {
        m68678d();
        long j = this.f1292e;
        int i3 = this.f1294g;
        long j2 = this.f1290c;
        if (i3 + j >= j2) {
            return -1;
        }
        int min = (int) Math.min(i2, j2 - (j + i3));
        int i4 = 0;
        while (min > 0) {
            if (m68677g(false)) {
                int min2 = Math.min(min, this.f1288a - this.f1294g);
                System.arraycopy(this.f1293f, this.f1294g, bArr, i, min2);
                this.f1294g += min2;
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
        m68678d();
        while (i2 > 0) {
            m68677g(true);
            int min = Math.min(i2, this.f1288a - this.f1294g);
            System.arraycopy(bArr, i, this.f1293f, this.f1294g, min);
            this.f1294g += min;
            this.f1295h = true;
            i += min;
            i2 -= min;
        }
        long j = this.f1292e;
        int i3 = this.f1294g;
        if (i3 + j > this.f1290c) {
            this.f1290c = j + i3;
        }
    }
}