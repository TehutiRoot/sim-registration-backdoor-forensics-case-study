package org.apache.commons.p028io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.NullReader */
/* loaded from: classes6.dex */
public class NullReader extends Reader {
    public static final NullReader INSTANCE = new NullReader();

    /* renamed from: a */
    public final long f73475a;

    /* renamed from: b */
    public long f73476b;

    /* renamed from: c */
    public long f73477c;

    /* renamed from: d */
    public long f73478d;

    /* renamed from: e */
    public boolean f73479e;

    /* renamed from: f */
    public final boolean f73480f;

    /* renamed from: g */
    public final boolean f73481g;

    public NullReader() {
        this(0L, true, false);
    }

    /* renamed from: b */
    public final int m25292b() {
        this.f73479e = true;
        if (!this.f73480f) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73479e = false;
        this.f73476b = 0L;
        this.f73477c = -1L;
    }

    public long getPosition() {
        return this.f73476b;
    }

    public long getSize() {
        return this.f73475a;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
        if (this.f73481g) {
            this.f73477c = this.f73476b;
            this.f73478d = i;
        } else {
            throw AbstractC22704vZ1.m889a();
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.f73481g;
    }

    public int processChar() {
        return 0;
    }

    public void processChars(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.f73479e) {
            long j = this.f73476b;
            if (j == this.f73475a) {
                return m25292b();
            }
            this.f73476b = j + 1;
            return processChar();
        }
        throw new IOException("Read after end of file");
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (this.f73481g) {
            long j = this.f73477c;
            if (j >= 0) {
                if (this.f73476b <= this.f73478d + j) {
                    this.f73476b = j;
                    this.f73479e = false;
                } else {
                    throw new IOException("Marked position [" + this.f73477c + "] is no longer valid - passed the read limit [" + this.f73478d + "]");
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw AbstractC22704vZ1.m887c();
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        if (!this.f73479e) {
            long j2 = this.f73476b;
            long j3 = this.f73475a;
            if (j2 == j3) {
                return m25292b();
            }
            long j4 = j2 + j;
            this.f73476b = j4;
            if (j4 > j3) {
                long j5 = j - (j4 - j3);
                this.f73476b = j3;
                return j5;
            }
            return j;
        }
        throw new IOException("Skip after end of file");
    }

    public NullReader(long j) {
        this(j, true, false);
    }

    public NullReader(long j, boolean z, boolean z2) {
        this.f73477c = -1L;
        this.f73475a = j;
        this.f73481g = z;
        this.f73480f = z2;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f73479e) {
            long j = this.f73476b;
            long j2 = this.f73475a;
            if (j == j2) {
                return m25292b();
            }
            long j3 = j + i2;
            this.f73476b = j3;
            if (j3 > j2) {
                i2 -= (int) (j3 - j2);
                this.f73476b = j2;
            }
            processChars(cArr, i, i2);
            return i2;
        }
        throw new IOException("Read after end of file");
    }
}