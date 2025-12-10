package p000;

import java.io.OutputStream;

/* renamed from: Hi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17733Hi0 extends OutputStream {

    /* renamed from: a */
    public long f2286a = 0;

    /* renamed from: b */
    public long m68048b() {
        return this.f2286a;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f2286a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f2286a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f2286a += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
