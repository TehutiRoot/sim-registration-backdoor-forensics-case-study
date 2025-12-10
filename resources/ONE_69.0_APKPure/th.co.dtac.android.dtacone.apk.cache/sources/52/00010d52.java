package p000;

import java.io.InputStream;

/* renamed from: sR1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22169sR1 extends AbstractC22342tR1 {

    /* renamed from: a */
    public final AbstractC22342tR1 f79898a;

    public C22169sR1(AbstractC22342tR1 abstractC22342tR1) {
        this.f79898a = abstractC22342tR1;
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: b */
    public long mo22693b() {
        return this.f79898a.mo22693b();
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: d */
    public InputStream mo22692d() {
        return this.f79898a.mo22692d();
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: g */
    public long mo22691g() {
        return this.f79898a.mo22691g();
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: m */
    public short mo22686m() {
        return this.f79898a.mo22686m();
    }

    @Override // p000.AbstractC22342tR1
    public int read() {
        return this.f79898a.read();
    }

    @Override // p000.AbstractC22342tR1
    public long readLong() {
        return this.f79898a.readLong();
    }

    @Override // p000.AbstractC22342tR1
    public void seek(long j) {
        this.f79898a.seek(j);
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: t */
    public int mo22679t() {
        return this.f79898a.mo22679t();
    }

    @Override // p000.AbstractC22342tR1
    public int read(byte[] bArr, int i, int i2) {
        return this.f79898a.read(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}