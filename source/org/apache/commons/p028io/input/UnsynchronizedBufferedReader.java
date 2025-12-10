package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.UnsynchronizedBufferedReader */
/* loaded from: classes6.dex */
public class UnsynchronizedBufferedReader extends UnsynchronizedReader {

    /* renamed from: c */
    public final Reader f73489c;

    /* renamed from: d */
    public char[] f73490d;

    /* renamed from: e */
    public int f73491e;

    /* renamed from: f */
    public int f73492f;

    /* renamed from: g */
    public int f73493g;

    /* renamed from: h */
    public int f73494h;

    public UnsynchronizedBufferedReader(Reader reader) {
        this(reader, 8192);
    }

    @Override // org.apache.commons.p028io.input.UnsynchronizedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!isClosed()) {
            this.f73489c.close();
            this.f73490d = null;
            super.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m24983d() {
        /*
            r6 = this;
            int r0 = r6.f73493g
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L50
            int r3 = r6.f73491e
            int r3 = r3 - r0
            int r4 = r6.f73494h
            if (r3 < r4) goto Le
            goto L50
        Le:
            if (r0 != 0) goto L25
            char[] r3 = r6.f73490d
            int r5 = r3.length
            if (r4 <= r5) goto L25
            int r0 = r3.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1b
            goto L1c
        L1b:
            r4 = r0
        L1c:
            char[] r0 = new char[r4]
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r4)
            r6.f73490d = r0
            goto L3c
        L25:
            if (r0 <= 0) goto L3c
            char[] r3 = r6.f73490d
            int r4 = r3.length
            int r4 = r4 - r0
            java.lang.System.arraycopy(r3, r0, r3, r1, r4)
            int r0 = r6.f73491e
            int r3 = r6.f73493g
            int r0 = r0 - r3
            r6.f73491e = r0
            int r0 = r6.f73492f
            int r0 = r0 - r3
            r6.f73492f = r0
            r6.f73493g = r1
        L3c:
            java.io.Reader r0 = r6.f73489c
            char[] r1 = r6.f73490d
            int r3 = r6.f73491e
            int r4 = r1.length
            int r4 = r4 - r3
            int r0 = r0.read(r1, r3, r4)
            if (r0 == r2) goto L4f
            int r1 = r6.f73492f
            int r1 = r1 + r0
            r6.f73492f = r1
        L4f:
            return r0
        L50:
            java.io.Reader r0 = r6.f73489c
            char[] r3 = r6.f73490d
            int r4 = r3.length
            int r0 = r0.read(r3, r1, r4)
            if (r0 <= 0) goto L61
            r6.f73493g = r2
            r6.f73491e = r1
            r6.f73492f = r0
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.UnsynchronizedBufferedReader.m24983d():int");
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        if (i >= 0) {
            m24980b();
            this.f73494h = i;
            this.f73493g = this.f73491e;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public int peek() throws IOException {
        mark(1);
        int read = read();
        reset();
        return read;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        m24980b();
        if (this.f73491e < this.f73492f || m24983d() != -1) {
            char[] cArr = this.f73490d;
            int i = this.f73491e;
            this.f73491e = i + 1;
            return cArr[i];
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
        if (r1 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
        r6 = r9.f73490d;
        r8 = r9.f73491e;
        r0.append(r6, r8, r7 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r6 = r9.f73490d;
        r8 = r9.f73491e;
        r0.append(r6, r8, (r7 - r8) - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readLine() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.UnsynchronizedBufferedReader.readLine():java.lang.String");
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        m24980b();
        if (this.f73492f - this.f73491e <= 0 && !this.f73489c.ready()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        m24980b();
        int i = this.f73493g;
        if (i != -1) {
            this.f73491e = i;
            return;
        }
        throw new IOException("mark == -1");
    }

    @Override // org.apache.commons.p028io.input.UnsynchronizedReader, java.io.Reader
    public long skip(long j) throws IOException {
        if (j >= 0) {
            m24980b();
            if (j < 1) {
                return 0L;
            }
            int i = this.f73492f;
            int i2 = this.f73491e;
            if (i - i2 >= j) {
                this.f73491e = i2 + AbstractC12188l0.m26572a(j);
                return j;
            }
            long j2 = i - i2;
            this.f73491e = i;
            while (j2 < j) {
                if (m24983d() == -1) {
                    return j2;
                }
                int i3 = this.f73492f;
                int i4 = this.f73491e;
                long j3 = j - j2;
                if (i3 - i4 >= j3) {
                    this.f73491e = i4 + AbstractC12188l0.m26572a(j3);
                    return j;
                }
                j2 += i3 - i4;
                this.f73491e = i3;
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public UnsynchronizedBufferedReader(Reader reader, int i) {
        this.f73493g = -1;
        this.f73494h = -1;
        if (i > 0) {
            this.f73489c = reader;
            this.f73490d = new char[i];
            return;
        }
        throw new IllegalArgumentException("size <= 0");
    }

    public int peek(char[] cArr) throws IOException {
        int length = cArr.length;
        mark(length);
        int read = read(cArr, 0, length);
        reset();
        return read;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        m24980b();
        if (i < 0 || i > cArr.length - i2 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            int i4 = this.f73492f;
            int i5 = this.f73491e;
            int i6 = i4 - i5;
            if (i6 > 0) {
                if (i6 >= i3) {
                    i6 = i3;
                }
                System.arraycopy(this.f73490d, i5, cArr, i, i6);
                this.f73491e += i6;
                i += i6;
                i3 -= i6;
            }
            if (i3 == 0 || (i3 < i2 && !this.f73489c.ready())) {
                break;
            }
            int i7 = this.f73493g;
            if ((i7 == -1 || this.f73491e - i7 >= this.f73494h) && i3 >= this.f73490d.length) {
                int read = this.f73489c.read(cArr, i, i3);
                if (read > 0) {
                    i3 -= read;
                    this.f73493g = -1;
                }
            } else if (m24983d() == -1) {
                break;
            }
        }
        int i8 = i2 - i3;
        if (i8 > 0 || i8 == i2) {
            return i8;
        }
        return -1;
    }
}
