package p000;

import java.io.OutputStream;

/* renamed from: Rf */
/* loaded from: classes4.dex */
public final class C1242Rf extends OutputStream {

    /* renamed from: a */
    public long f5585a;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f5585a += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f5585a++;
    }
}