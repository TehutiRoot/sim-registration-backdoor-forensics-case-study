package p000;

import com.tom_roush.pdfbox.p019io.RandomAccessRead;

/* renamed from: Fs1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17659Fs1 implements HG1 {

    /* renamed from: a */
    public final RandomAccessRead f1796a;

    public C17659Fs1(RandomAccessRead randomAccessRead) {
        this.f1796a = randomAccessRead;
    }

    @Override // p000.HG1
    /* renamed from: a */
    public void mo65439a(int i) {
        this.f1796a.rewind(1);
    }

    @Override // p000.HG1
    /* renamed from: c */
    public void mo65438c(byte[] bArr) {
        this.f1796a.rewind(bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1796a.close();
    }

    @Override // p000.HG1
    /* renamed from: f */
    public void mo65437f(byte[] bArr, int i, int i2) {
        this.f1796a.rewind(i2);
    }

    @Override // p000.HG1
    public long getPosition() {
        return this.f1796a.getPosition();
    }

    @Override // p000.HG1
    public boolean isEOF() {
        return this.f1796a.isEOF();
    }

    @Override // p000.HG1
    public int peek() {
        return this.f1796a.peek();
    }

    @Override // p000.HG1
    public int read() {
        return this.f1796a.read();
    }

    @Override // p000.HG1
    public byte[] readFully(int i) {
        return this.f1796a.readFully(i);
    }

    @Override // p000.HG1
    public int read(byte[] bArr) {
        return this.f1796a.read(bArr);
    }

    @Override // p000.HG1
    public int read(byte[] bArr, int i, int i2) {
        return this.f1796a.read(bArr, i, i2);
    }
}