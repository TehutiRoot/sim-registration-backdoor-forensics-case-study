package p000;

import java.io.OutputStream;

/* renamed from: yz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23301yz2 extends OutputStream {

    /* renamed from: a */
    public long f109232a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f109232a += i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f109232a++;
    }
}