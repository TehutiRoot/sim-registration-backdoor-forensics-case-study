package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f42362a;

    /* renamed from: b */
    public int f42363b;

    /* renamed from: c */
    public int f42364c;

    /* renamed from: d */
    public int f42365d;

    /* renamed from: e */
    public int f42366e;

    /* renamed from: f */
    public final ArrayPool f42367f;

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
    public static IOException m50202d() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f42362a != null && inputStream != null) {
        } else {
            throw m50202d();
        }
        return (this.f42363b - this.f42366e) + inputStream.available();
    }

    /* renamed from: b */
    public final int m50203b(InputStream inputStream, byte[] bArr) {
        int i = this.f42365d;
        if (i != -1) {
            int i2 = this.f42366e - i;
            int i3 = this.f42364c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f42363b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f42367f.get(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f42362a = bArr2;
                    this.f42367f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f42366e - this.f42365d;
                this.f42366e = i4;
                this.f42365d = 0;
                this.f42363b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f42366e;
                if (read > 0) {
                    i5 += read;
                }
                this.f42363b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f42365d = -1;
            this.f42366e = 0;
            this.f42363b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f42362a != null) {
            this.f42367f.put(this.f42362a);
            this.f42362a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.f42364c = this.f42362a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f42364c = Math.max(this.f42364c, i);
        this.f42365d = this.f42366e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f42362a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f42366e < this.f42363b || m50203b(inputStream, bArr) != -1) {
                if (bArr != this.f42362a && (bArr = this.f42362a) == null) {
                    throw m50202d();
                }
                int i = this.f42363b;
                int i2 = this.f42366e;
                if (i - i2 > 0) {
                    this.f42366e = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw m50202d();
    }

    public synchronized void release() {
        if (this.f42362a != null) {
            this.f42367f.put(this.f42362a);
            this.f42362a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f42362a != null) {
            int i = this.f42365d;
            if (-1 != i) {
                this.f42366e = i;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f42366e + " markLimit: " + this.f42364c);
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
        byte[] bArr = this.f42362a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.f42363b;
                int i2 = this.f42366e;
                if (i - i2 >= j) {
                    this.f42366e = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.f42366e = i;
                if (this.f42365d != -1 && j <= this.f42364c) {
                    if (m50203b(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.f42363b;
                    int i4 = this.f42366e;
                    if (i3 - i4 >= j - j2) {
                        this.f42366e = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.f42366e = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.f42365d = -1;
                }
                return j2 + skip;
            }
            throw m50202d();
        }
        throw m50202d();
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool, int i) {
        super(inputStream);
        this.f42365d = -1;
        this.f42367f = arrayPool;
        this.f42362a = (byte[]) arrayPool.get(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f42362a;
        if (bArr2 == null) {
            throw m50202d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f42366e;
            int i6 = this.f42363b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f42366e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f42365d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (m50203b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.f42362a && (bArr2 = this.f42362a) == null) {
                        throw m50202d();
                    }
                    int i8 = this.f42363b;
                    int i9 = this.f42366e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f42366e += i4;
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
            throw m50202d();
        }
    }
}
