package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public class BufferedRandomAccessFile extends RandomAccessFile {

    /* renamed from: a */
    public final byte[] f59378a;

    /* renamed from: b */
    public int f59379b;

    /* renamed from: c */
    public int f59380c;

    /* renamed from: d */
    public long f59381d;

    public BufferedRandomAccessFile(String str, String str2, int i) throws FileNotFoundException {
        super(str, str2);
        this.f59379b = 0;
        this.f59380c = 0;
        this.f59381d = 0L;
        this.f59378a = new byte[i];
    }

    /* renamed from: b */
    public final int m32952b() {
        int read = super.read(this.f59378a);
        if (read >= 0) {
            this.f59381d += read;
            this.f59379b = read;
            this.f59380c = 0;
        }
        return read;
    }

    /* renamed from: d */
    public final void m32951d() {
        this.f59379b = 0;
        this.f59380c = 0;
        this.f59381d = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return (this.f59381d - this.f59379b) + this.f59380c;
    }

    @Override // java.io.RandomAccessFile
    public final int read() throws IOException {
        if ((this.f59380c < this.f59379b || m32952b() >= 0) && this.f59379b != 0) {
            byte[] bArr = this.f59378a;
            int i = this.f59380c;
            this.f59380c = i + 1;
            return (bArr[i] + 256) & 255;
        }
        return -1;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j) throws IOException {
        int i;
        int i2 = (int) (this.f59381d - j);
        if (i2 >= 0 && i2 <= (i = this.f59379b)) {
            this.f59380c = i - i2;
            return;
        }
        super.seek(j);
        m32951d();
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            int i4 = this.f59379b;
            int i5 = this.f59380c;
            int i6 = i4 - i5;
            if (i2 <= i6) {
                System.arraycopy(this.f59378a, i5, bArr, i, i2);
                this.f59380c += i2;
                return i3 + i2;
            }
            System.arraycopy(this.f59378a, i5, bArr, i, i6);
            i3 += i6;
            this.f59380c += i6;
            if (m32952b() <= 0) {
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
        this.f59379b = 0;
        this.f59380c = 0;
        this.f59381d = 0L;
        this.f59378a = new byte[i];
    }
}