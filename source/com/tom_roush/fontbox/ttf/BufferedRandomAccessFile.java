package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public class BufferedRandomAccessFile extends RandomAccessFile {

    /* renamed from: a */
    public final byte[] f59366a;

    /* renamed from: b */
    public int f59367b;

    /* renamed from: c */
    public int f59368c;

    /* renamed from: d */
    public long f59369d;

    public BufferedRandomAccessFile(String str, String str2, int i) throws FileNotFoundException {
        super(str, str2);
        this.f59367b = 0;
        this.f59368c = 0;
        this.f59369d = 0L;
        this.f59366a = new byte[i];
    }

    /* renamed from: b */
    public final int m32960b() {
        int read = super.read(this.f59366a);
        if (read >= 0) {
            this.f59369d += read;
            this.f59367b = read;
            this.f59368c = 0;
        }
        return read;
    }

    /* renamed from: d */
    public final void m32959d() {
        this.f59367b = 0;
        this.f59368c = 0;
        this.f59369d = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return (this.f59369d - this.f59367b) + this.f59368c;
    }

    @Override // java.io.RandomAccessFile
    public final int read() throws IOException {
        if ((this.f59368c < this.f59367b || m32960b() >= 0) && this.f59367b != 0) {
            byte[] bArr = this.f59366a;
            int i = this.f59368c;
            this.f59368c = i + 1;
            return (bArr[i] + 256) & 255;
        }
        return -1;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j) throws IOException {
        int i;
        int i2 = (int) (this.f59369d - j);
        if (i2 >= 0 && i2 <= (i = this.f59367b)) {
            this.f59368c = i - i2;
            return;
        }
        super.seek(j);
        m32959d();
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            int i4 = this.f59367b;
            int i5 = this.f59368c;
            int i6 = i4 - i5;
            if (i2 <= i6) {
                System.arraycopy(this.f59366a, i5, bArr, i, i2);
                this.f59368c += i2;
                return i3 + i2;
            }
            System.arraycopy(this.f59366a, i5, bArr, i, i6);
            i3 += i6;
            this.f59368c += i6;
            if (m32960b() <= 0) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            i += i6;
            i2 -= i6;
        }
    }

    public BufferedRandomAccessFile(File file, String str, int i) throws FileNotFoundException {
        super(file, str);
        this.f59367b = 0;
        this.f59368c = 0;
        this.f59369d = 0L;
        this.f59366a = new byte[i];
    }
}
