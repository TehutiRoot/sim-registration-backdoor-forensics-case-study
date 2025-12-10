package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f42374a;

    /* renamed from: b */
    public int f42375b;

    /* renamed from: c */
    public int f42376c;

    /* renamed from: d */
    public int f42377d;

    /* renamed from: e */
    public int f42378e;

    /* renamed from: f */
    public final ArrayPool f42379f;

    /* loaded from: classes3.dex */
    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) {
        this(inputStream, arrayPool, 65536);
    }

    /* renamed from: d */
    public static IOException m50199d() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f42374a != null && inputStream != null) {
        } else {
            throw m50199d();
        }
        return (this.f42375b - this.f42378e) + inputStream.available();
    }

    /* renamed from: b */
    public final int m50200b(InputStream inputStream, byte[] bArr) {
        int i = this.f42377d;
        if (i != -1) {
            int i2 = this.f42378e - i;
            int i3 = this.f42376c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f42375b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f42379f.get(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f42374a = bArr2;
                    this.f42379f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f42378e - this.f42377d;
                this.f42378e = i4;
                this.f42377d = 0;
                this.f42375b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f42378e;
                if (read > 0) {
                    i5 += read;
                }
                this.f42375b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f42377d = -1;
            this.f42378e = 0;
            this.f42375b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f42374a != null) {
            this.f42379f.put(this.f42374a);
            this.f42374a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.f42376c = this.f42374a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f42376c = Math.max(this.f42376c, i);
        this.f42377d = this.f42378e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f42374a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f42378e < this.f42375b || m50200b(inputStream, bArr) != -1) {
                if (bArr != this.f42374a && (bArr = this.f42374a) == null) {
                    throw m50199d();
                }
                int i = this.f42375b;
                int i2 = this.f42378e;
                if (i - i2 > 0) {
                    this.f42378e = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw m50199d();
    }

    public synchronized void release() {
        if (this.f42374a != null) {
            this.f42379f.put(this.f42374a);
            this.f42374a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f42374a != null) {
            int i = this.f42377d;
            if (-1 != i) {
                this.f42378e = i;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f42378e + " markLimit: " + this.f42376c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f42374a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.f42375b;
                int i2 = this.f42378e;
                if (i - i2 >= j) {
                    this.f42378e = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.f42378e = i;
                if (this.f42377d != -1 && j <= this.f42376c) {
                    if (m50200b(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.f42375b;
                    int i4 = this.f42378e;
                    if (i3 - i4 >= j - j2) {
                        this.f42378e = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.f42378e = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.f42377d = -1;
                }
                return j2 + skip;
            }
            throw m50199d();
        }
        throw m50199d();
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool, int i) {
        super(inputStream);
        this.f42377d = -1;
        this.f42379f = arrayPool;
        this.f42374a = (byte[]) arrayPool.get(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f42374a;
        if (bArr2 == null) {
            throw m50199d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f42378e;
            int i6 = this.f42375b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f42378e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f42377d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (m50200b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.f42374a && (bArr2 = this.f42374a) == null) {
                        throw m50199d();
                    }
                    int i8 = this.f42375b;
                    int i9 = this.f42378e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f42378e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw m50199d();
        }
    }
}