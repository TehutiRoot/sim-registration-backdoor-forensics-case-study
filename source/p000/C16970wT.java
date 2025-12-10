package p000;

import java.io.InputStream;

/* renamed from: wT */
/* loaded from: classes3.dex */
public final class C16970wT extends InputStream {

    /* renamed from: a */
    public final InputStream f108005a;

    /* renamed from: b */
    public int f108006b = 1073741824;

    public C16970wT(InputStream inputStream) {
        this.f108005a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f108006b;
    }

    /* renamed from: b */
    public final int m837b(int i) {
        if (i == -1) {
            this.f108006b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f108005a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m837b(this.f108005a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f108005a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return m837b(this.f108005a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return m837b(this.f108005a.read(bArr, i, i2));
    }
}
