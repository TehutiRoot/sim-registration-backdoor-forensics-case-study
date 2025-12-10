package p000;

/* renamed from: ia */
/* loaded from: classes5.dex */
public final class C10462ia {

    /* renamed from: a */
    public final byte[] f62879a;

    /* renamed from: b */
    public int f62880b = 0;

    public C10462ia(int i) {
        this.f62879a = new byte[i];
    }

    /* renamed from: a */
    public void m30958a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f62880b;
            this.f62880b = i3 + 1;
            m30956c(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] m30957b(int i) {
        int length = this.f62879a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f62879a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public final void m30956c(int i, boolean z) {
        this.f62879a[i] = z ? (byte) 1 : (byte) 0;
    }
}