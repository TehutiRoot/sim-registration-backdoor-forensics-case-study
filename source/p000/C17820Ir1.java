package p000;

import com.tom_roush.pdfbox.p019io.RandomAccessRead;

/* renamed from: Ir1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17820Ir1 implements KF1 {

    /* renamed from: a */
    public final RandomAccessRead f2618a;

    public C17820Ir1(RandomAccessRead randomAccessRead) {
        this.f2618a = randomAccessRead;
    }

    @Override // p000.KF1
    /* renamed from: a */
    public void mo66316a(int i) {
        this.f2618a.rewind(1);
    }

    @Override // p000.KF1
    /* renamed from: c */
    public void mo66315c(byte[] bArr) {
        this.f2618a.rewind(bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2618a.close();
    }

    @Override // p000.KF1
    /* renamed from: f */
    public void mo66314f(byte[] bArr, int i, int i2) {
        this.f2618a.rewind(i2);
    }

    @Override // p000.KF1
    public long getPosition() {
        return this.f2618a.getPosition();
    }

    @Override // p000.KF1
    public boolean isEOF() {
        return this.f2618a.isEOF();
    }

    @Override // p000.KF1
    public int peek() {
        return this.f2618a.peek();
    }

    @Override // p000.KF1
    public int read() {
        return this.f2618a.read();
    }

    @Override // p000.KF1
    public byte[] readFully(int i) {
        return this.f2618a.readFully(i);
    }

    @Override // p000.KF1
    public int read(byte[] bArr) {
        return this.f2618a.read(bArr);
    }

    @Override // p000.KF1
    public int read(byte[] bArr, int i, int i2) {
        return this.f2618a.read(bArr, i, i2);
    }
}
