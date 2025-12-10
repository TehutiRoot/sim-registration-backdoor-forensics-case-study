package p000;

import java.io.InputStream;

/* renamed from: AT */
/* loaded from: classes3.dex */
public final class C0030AT extends InputStream {

    /* renamed from: a */
    public final InputStream f102a;

    /* renamed from: b */
    public int f103b = 1073741824;

    public C0030AT(InputStream inputStream) {
        this.f102a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f103b;
    }

    /* renamed from: b */
    public final int m69273b(int i) {
        if (i == -1) {
            this.f103b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f102a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m69273b(this.f102a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f102a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m69273b(this.f102a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return m69273b(this.f102a.read(bArr, i, i2));
    }
}