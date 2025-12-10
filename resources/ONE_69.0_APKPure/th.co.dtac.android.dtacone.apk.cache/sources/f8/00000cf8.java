package p000;

import java.io.OutputStream;

/* renamed from: Ni0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18153Ni0 extends OutputStream {

    /* renamed from: a */
    public long f4239a = 0;

    /* renamed from: b */
    public long m67212b() {
        return this.f4239a;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f4239a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f4239a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f4239a += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}