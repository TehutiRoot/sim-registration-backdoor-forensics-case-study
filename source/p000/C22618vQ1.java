package p000;

import java.io.InputStream;

/* renamed from: vQ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22618vQ1 extends AbstractC22790wQ1 {

    /* renamed from: a */
    public final AbstractC22790wQ1 f107679a;

    public C22618vQ1(AbstractC22790wQ1 abstractC22790wQ1) {
        this.f107679a = abstractC22790wQ1;
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: b */
    public long mo858b() {
        return this.f107679a.mo858b();
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: d */
    public InputStream mo857d() {
        return this.f107679a.mo857d();
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: g */
    public long mo856g() {
        return this.f107679a.mo856g();
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: m */
    public short mo851m() {
        return this.f107679a.mo851m();
    }

    @Override // p000.AbstractC22790wQ1
    public int read() {
        return this.f107679a.read();
    }

    @Override // p000.AbstractC22790wQ1
    public long readLong() {
        return this.f107679a.readLong();
    }

    @Override // p000.AbstractC22790wQ1
    public void seek(long j) {
        this.f107679a.seek(j);
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: t */
    public int mo844t() {
        return this.f107679a.mo844t();
    }

    @Override // p000.AbstractC22790wQ1
    public int read(byte[] bArr, int i, int i2) {
        return this.f107679a.read(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
