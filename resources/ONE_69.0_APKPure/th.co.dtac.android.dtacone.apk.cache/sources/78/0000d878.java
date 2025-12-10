package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k */
/* loaded from: classes5.dex */
public final class C11600k extends FilterInputStream {

    /* renamed from: a */
    public int f67850a;

    /* renamed from: b */
    public int f67851b;

    /* renamed from: c */
    public boolean f67852c;

    /* renamed from: d */
    public byte[] f67853d;

    /* renamed from: e */
    public byte[] f67854e;

    public C11600k(InputStream inputStream) {
        super(inputStream);
        this.f67850a = 0;
        this.f67851b = 0;
        this.f67852c = false;
        this.f67853d = new byte[5];
        this.f67854e = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f67853d = null;
        this.f67852c = true;
        this.f67854e = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        r13 = r14.f67853d;
        r13[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
        if (r12 != 126) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        r13[r2] = 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        r4 = r2 - 1;
        r14.f67851b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
        if (r4 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        r14.f67852c = true;
        r14.f67853d = null;
        r14.f67854e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r2 >= 5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r2 >= 5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        r14.f67853d[r2] = 117;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        r14.f67852c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r4 >= 5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
        r5 = (byte) (r14.f67853d[r4] - 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
        if (r5 < 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
        if (r5 > 93) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
        r1 = (r1 * 85) + r5;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ab, code lost:
        r14.f67851b = 0;
        r14.f67852c = true;
        r14.f67853d = null;
        r14.f67854e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
        throw new java.io.IOException("Invalid data in Ascii85 stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
        if (r10 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
        r14.f67854e[r10] = (byte) (255 & r1);
        r1 = r1 >>> 8;
        r10 = r10 - 1;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11600k.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("Reset is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (!this.f67852c || this.f67850a < this.f67851b) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = this.f67850a;
                if (i4 < this.f67851b) {
                    byte[] bArr2 = this.f67854e;
                    this.f67850a = i4 + 1;
                    bArr[i3 + i] = bArr2[i4];
                } else {
                    int read = read();
                    if (read == -1) {
                        return i3;
                    }
                    bArr[i3 + i] = (byte) read;
                }
            }
            return i2;
        }
        return -1;
    }
}