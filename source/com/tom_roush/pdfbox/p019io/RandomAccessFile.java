package com.tom_roush.pdfbox.p019io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessFile */
/* loaded from: classes5.dex */
public class RandomAccessFile implements RandomAccess {

    /* renamed from: a */
    public final java.io.RandomAccessFile f59915a;

    /* renamed from: b */
    public boolean f59916b;

    public RandomAccessFile(File file, String str) throws FileNotFoundException {
        this.f59915a = new java.io.RandomAccessFile(file, str);
    }

    /* renamed from: b */
    private void m32757b() {
        if (!this.f59916b) {
            return;
        }
        throw new IOException("RandomAccessFile already closed");
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int available() throws IOException {
        m32757b();
        return (int) Math.min(this.f59915a.length() - getPosition(), 2147483647L);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void clear() throws IOException {
        m32757b();
        this.f59915a.seek(0L);
        this.f59915a.setLength(0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59915a.close();
        this.f59916b = true;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long getPosition() throws IOException {
        m32757b();
        return this.f59915a.getFilePointer();
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isClosed() {
        return this.f59916b;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public boolean isEOF() throws IOException {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public long length() throws IOException {
        m32757b();
        return this.f59915a.length();
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
        m32757b();
        return this.f59915a.read();
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public byte[] readFully(int i) throws IOException {
        m32757b();
        byte[] bArr = new byte[i];
        this.f59915a.readFully(bArr);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void rewind(int i) throws IOException {
        m32757b();
        java.io.RandomAccessFile randomAccessFile = this.f59915a;
        randomAccessFile.seek(randomAccessFile.getFilePointer() - i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public void seek(long j) throws IOException {
        m32757b();
        this.f59915a.seek(j);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr, int i, int i2) throws IOException {
        m32757b();
        this.f59915a.write(bArr, i, i2);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr) throws IOException {
        m32757b();
        return this.f59915a.read(bArr);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessWrite
    public void write(int i) throws IOException {
        m32757b();
        this.f59915a.write(i);
    }

    @Override // com.tom_roush.pdfbox.p019io.RandomAccessRead
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m32757b();
        return this.f59915a.read(bArr, i, i2);
    }
}
