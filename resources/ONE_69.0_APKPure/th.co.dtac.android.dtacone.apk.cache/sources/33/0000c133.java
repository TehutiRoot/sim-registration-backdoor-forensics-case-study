package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.RandomAccessInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes5.dex */
public final class COSOutputStream extends FilterOutputStream {

    /* renamed from: a */
    public final List f59870a;

    /* renamed from: b */
    public final COSDictionary f59871b;

    /* renamed from: c */
    public final ScratchFile f59872c;

    /* renamed from: d */
    public RandomAccess f59873d;

    public COSOutputStream(List list, COSDictionary cOSDictionary, OutputStream outputStream, ScratchFile scratchFile) {
        super(outputStream);
        this.f59870a = list;
        this.f59871b = cOSDictionary;
        this.f59872c = scratchFile;
        if (list.isEmpty()) {
            this.f59873d = null;
        } else {
            this.f59873d = scratchFile.createBuffer();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccess randomAccess;
        try {
            if (this.f59873d != null) {
                for (int size = this.f59870a.size() - 1; size >= 0; size--) {
                    RandomAccessInputStream randomAccessInputStream = new RandomAccessInputStream(this.f59873d);
                    if (size == 0) {
                        ((Filter) this.f59870a.get(size)).encode(randomAccessInputStream, ((FilterOutputStream) this).out, this.f59871b, size);
                    } else {
                        RandomAccess createBuffer = this.f59872c.createBuffer();
                        try {
                            RandomAccessOutputStream randomAccessOutputStream = new RandomAccessOutputStream(createBuffer);
                            ((Filter) this.f59870a.get(size)).encode(randomAccessInputStream, randomAccessOutputStream, this.f59871b, size);
                            randomAccessOutputStream.close();
                            randomAccess = this.f59873d;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            this.f59873d = createBuffer;
                            randomAccess.close();
                        } catch (Throwable th3) {
                            th = th3;
                            createBuffer = randomAccess;
                            createBuffer.close();
                            throw th;
                        }
                    }
                    randomAccessInputStream.close();
                }
                this.f59873d.close();
                this.f59873d = null;
            }
            super.close();
        } catch (Throwable th4) {
            super.close();
            throw th4;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f59873d == null) {
            super.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        RandomAccess randomAccess = this.f59873d;
        if (randomAccess != null) {
            randomAccess.write(bArr);
        } else {
            super.write(bArr);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        RandomAccess randomAccess = this.f59873d;
        if (randomAccess != null) {
            randomAccess.write(bArr, i, i2);
        } else {
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        RandomAccess randomAccess = this.f59873d;
        if (randomAccess != null) {
            randomAccess.write(i);
        } else {
            super.write(i);
        }
    }
}