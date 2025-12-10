package p000;

/* renamed from: ia */
/* loaded from: classes5.dex */
public final class C10475ia {

    /* renamed from: a */
    public final byte[] f62820a;

    /* renamed from: b */
    public int f62821b = 0;

    public C10475ia(int i) {
        this.f62820a = new byte[i];
    }

    /* renamed from: a */
    public void m30628a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f62821b;
            this.f62821b = i3 + 1;
            m30626c(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] m30627b(int i) {
        int length = this.f62820a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f62820a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public final void m30626c(int i, boolean z) {
        this.f62820a[i] = z ? (byte) 1 : (byte) 0;
    }
}
