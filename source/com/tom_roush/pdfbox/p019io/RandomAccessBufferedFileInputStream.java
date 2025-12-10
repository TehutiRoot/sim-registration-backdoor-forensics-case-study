package com.tom_roush.pdfbox.p019io;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream */
/* loaded from: classes5.dex */
public class RandomAccessBufferedFileInputStream extends InputStream implements RandomAccessRead {

    /* renamed from: a */
    public int f59901a;

    /* renamed from: b */
    public int f59902b;

    /* renamed from: c */
    public long f59903c;

    /* renamed from: d */
    public int f59904d;

    /* renamed from: e */
    public File f59905e;

    /* renamed from: f */
    public byte[] f59906f;

    /* renamed from: g */
    public final Map f59907g;

    /* renamed from: h */
    public long f59908h;

    /* renamed from: i */
    public byte[] f59909i;

    /* renamed from: j */
    public int f59910j;

    /* renamed from: k */
    public final RandomAccessFile f59911k;

    /* renamed from: l */
    public final long f59912l;

    /* renamed from: m */
    public long f59913m;

    /* renamed from: n */
    public boolean f59914n;

    public RandomAccessBufferedFileInputStream(String str) throws IOException {
        this(new File(str));
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() throws IOException {
        return (int) Math.min(this.f59912l - this.f59913m, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59911k.close();
        m32759i();
        this.f59907g.clear();
        this.f59914n = true;
    }

    /* renamed from: g */
    public final File m32760g(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File createTempFile;
        try {
            createTempFile = File.createTempFile("tmpPDFBox", ".pdf");
            fileOutputStream = new FileOutputStream(createTempFile);
        } catch (Throwable th3) {
            fileOutputStream = null;
            th2 = th3;
        }
        try {
            IOUtils.copy(inputStream, fileOutputStream);
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(fileOutputStream);
            return createTempFile;
        } catch (Throwable th4) {
            th2 = th4;
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(fileOutputStream);
            throw th2;
        }
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() {
        return this.f59913m;
    }

    /* renamed from: i */
    public final void m32759i() {
        File file = this.f59905e;
        if (file != null) {
            file.delete();
        }
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        return this.f59914n;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() throws IOException {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final byte[] m32758j() {
        int read;
        byte[] bArr = this.f59906f;
        if (bArr != null) {
            this.f59906f = null;
        } else {
            bArr = new byte[this.f59902b];
        }
        int i = 0;
        while (true) {
            int i2 = this.f59902b;
            if (i >= i2 || (read = this.f59911k.read(bArr, i, i2 - i)) < 0) {
                break;
            }
            i += read;
        }
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() throws IOException {
        return this.f59912l;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int peek() throws IOException {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read() throws IOException {
        long j = this.f59913m;
        if (j >= this.f59912l) {
            return -1;
        }
        if (this.f59910j == this.f59902b) {
            seek(j);
        }
        this.f59913m++;
        byte[] bArr = this.f59909i;
        int i = this.f59910j;
        this.f59910j = i + 1;
        return bArr[i] & 255;
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
        seek(getPosition() - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) throws IOException {
        long j2 = this.f59903c & j;
        if (j2 != this.f59908h) {
            byte[] bArr = (byte[]) this.f59907g.get(Long.valueOf(j2));
            if (bArr == null) {
                this.f59911k.seek(j2);
                bArr = m32758j();
                this.f59907g.put(Long.valueOf(j2), bArr);
            }
            this.f59908h = j2;
            this.f59909i = bArr;
        }
        this.f59910j = (int) (j - this.f59908h);
        this.f59913m = j;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.f59912l;
        long j3 = this.f59913m;
        if (j2 - j3 < j) {
            j = j2 - j3;
        }
        int i = this.f59902b;
        if (j < i) {
            int i2 = this.f59910j;
            if (i2 + j <= i) {
                this.f59910j = (int) (i2 + j);
                this.f59913m = j3 + j;
                return j;
            }
        }
        seek(j3 + j);
        return j;
    }

    public RandomAccessBufferedFileInputStream(File file) throws IOException {
        this.f59901a = 12;
        this.f59902b = 1 << 12;
        this.f59903c = (-1) << 12;
        this.f59904d = 1000;
        this.f59906f = null;
        this.f59907g = new LinkedHashMap<Long, byte[]>(this.f59904d, 0.75f, true) { // from class: com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream.1
            private static final long serialVersionUID = -6302488539257741101L;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
                boolean z;
                if (size() > RandomAccessBufferedFileInputStream.this.f59904d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    RandomAccessBufferedFileInputStream.this.f59906f = entry.getValue();
                }
                return z;
            }
        };
        this.f59908h = -1L;
        this.f59909i = new byte[this.f59902b];
        this.f59910j = 0;
        this.f59913m = 0L;
        this.f59911k = new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
        this.f59912l = file.length();
        seek(0L);
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f59913m;
        if (j >= this.f59912l) {
            return -1;
        }
        if (this.f59910j == this.f59902b) {
            seek(j);
        }
        int min = Math.min(this.f59902b - this.f59910j, i2);
        long j2 = this.f59912l;
        long j3 = this.f59913m;
        if (j2 - j3 < this.f59902b) {
            min = Math.min(min, (int) (j2 - j3));
        }
        System.arraycopy(this.f59909i, this.f59910j, bArr, i, min);
        this.f59910j += min;
        this.f59913m += min;
        return min;
    }

    public RandomAccessBufferedFileInputStream(InputStream inputStream) throws IOException {
        this.f59901a = 12;
        this.f59902b = 1 << 12;
        this.f59903c = (-1) << 12;
        this.f59904d = 1000;
        this.f59906f = null;
        this.f59907g = new LinkedHashMap<Long, byte[]>(this.f59904d, 0.75f, true) { // from class: com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream.1
            private static final long serialVersionUID = -6302488539257741101L;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, byte[]> entry) {
                boolean z;
                if (size() > RandomAccessBufferedFileInputStream.this.f59904d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    RandomAccessBufferedFileInputStream.this.f59906f = entry.getValue();
                }
                return z;
            }
        };
        this.f59908h = -1L;
        this.f59909i = new byte[this.f59902b];
        this.f59910j = 0;
        this.f59913m = 0L;
        File m32760g = m32760g(inputStream);
        this.f59905e = m32760g;
        this.f59912l = m32760g.length();
        this.f59911k = new RandomAccessFile(this.f59905e, PDPageLabelRange.STYLE_ROMAN_LOWER);
        seek(0L);
    }
}
