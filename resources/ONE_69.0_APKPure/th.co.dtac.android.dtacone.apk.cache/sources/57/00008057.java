package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class ExifOrientationStream extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f41868c;

    /* renamed from: d */
    public static final int f41869d;

    /* renamed from: e */
    public static final int f41870e;

    /* renamed from: a */
    public final byte f41871a;

    /* renamed from: b */
    public int f41872b;

    static {
        byte[] bArr = {-1, -31, 0, Ascii.f52698FS, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f41868c = bArr;
        int length = bArr.length;
        f41869d = length;
        f41870e = length + 2;
    }

    public ExifOrientationStream(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f41871a = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.f41872b;
        if (i2 < 2 || i2 > (i = f41870e)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.f41871a;
        } else {
            read = f41868c[i2 - 2] & 255;
        }
        if (read != -1) {
            this.f41872b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f41872b = (int) (this.f41872b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f41872b;
        int i5 = f41870e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f41871a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f41868c, this.f41872b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f41872b += i3;
        }
        return i3;
    }
}