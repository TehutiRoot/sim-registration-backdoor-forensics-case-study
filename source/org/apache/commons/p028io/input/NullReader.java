package org.apache.commons.p028io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.NullReader */
/* loaded from: classes6.dex */
public class NullReader extends Reader {
    public static final NullReader INSTANCE = new NullReader();

    /* renamed from: a */
    public final long f73391a;

    /* renamed from: b */
    public long f73392b;

    /* renamed from: c */
    public long f73393c;

    /* renamed from: d */
    public long f73394d;

    /* renamed from: e */
    public boolean f73395e;

    /* renamed from: f */
    public final boolean f73396f;

    /* renamed from: g */
    public final boolean f73397g;

    public NullReader() {
        this(0L, true, false);
    }

    /* renamed from: b */
    public final int m25102b() {
        this.f73395e = true;
        if (!this.f73396f) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73395e = false;
        this.f73392b = 0L;
        this.f73393c = -1L;
    }

    public long getPosition() {
        return this.f73392b;
    }

    public long getSize() {
        return this.f73391a;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
        if (this.f73397g) {
            this.f73393c = this.f73392b;
            this.f73394d = i;
        } else {
            throw AbstractC23150yY1.m240a();
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.f73397g;
    }

    public int processChar() {
        return 0;
    }

    public void processChars(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.f73395e) {
            long j = this.f73392b;
            if (j == this.f73391a) {
                return m25102b();
            }
            this.f73392b = j + 1;
            return processChar();
        }
        throw new IOException("Read after end of file");
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (this.f73397g) {
            long j = this.f73393c;
            if (j >= 0) {
                if (this.f73392b <= this.f73394d + j) {
                    this.f73392b = j;
                    this.f73395e = false;
                } else {
                    throw new IOException("Marked position [" + this.f73393c + "] is no longer valid - passed the read limit [" + this.f73394d + "]");
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw AbstractC23150yY1.m238c();
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        if (!this.f73395e) {
            long j2 = this.f73392b;
            long j3 = this.f73391a;
            if (j2 == j3) {
                return m25102b();
            }
            long j4 = j2 + j;
            this.f73392b = j4;
            if (j4 > j3) {
                long j5 = j - (j4 - j3);
                this.f73392b = j3;
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
        this.f73393c = -1L;
        this.f73391a = j;
        this.f73397g = z;
        this.f73396f = z2;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f73395e) {
            long j = this.f73392b;
            long j2 = this.f73391a;
            if (j == j2) {
                return m25102b();
            }
            long j3 = j + i2;
            this.f73392b = j3;
            if (j3 > j2) {
                i2 -= (int) (j3 - j2);
                this.f73392b = j2;
            }
            processChars(cArr, i, i2);
            return i2;
        }
        throw new IOException("Read after end of file");
    }
}
