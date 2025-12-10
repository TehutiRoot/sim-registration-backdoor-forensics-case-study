package p000;

import java.io.OutputStream;

/* renamed from: vo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22749vo2 extends OutputStream {

    /* renamed from: a */
    public long f108227a = 0;

    /* renamed from: b */
    public final long m845b() {
        return this.f108227a;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f108227a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f108227a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f108227a += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}