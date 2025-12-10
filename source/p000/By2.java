package p000;

import java.io.OutputStream;

/* renamed from: By2 */
/* loaded from: classes3.dex */
public final class By2 extends OutputStream {

    /* renamed from: a */
    public long f576a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f576a += i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f576a++;
    }
}
