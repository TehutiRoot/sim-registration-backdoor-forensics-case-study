package p000;

import com.google.android.gms.internal.clearcut.zzbk;
import com.google.android.gms.internal.clearcut.zzco;

/* renamed from: ze2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23339ze2 extends zzbk {

    /* renamed from: d */
    public final byte[] f109137d;

    /* renamed from: e */
    public final boolean f109138e;

    /* renamed from: f */
    public int f109139f;

    /* renamed from: g */
    public int f109140g;

    /* renamed from: h */
    public int f109141h;

    /* renamed from: i */
    public int f109142i;

    /* renamed from: j */
    public int f109143j;

    public C23339ze2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f109143j = Integer.MAX_VALUE;
        this.f109137d = bArr;
        this.f109139f = i2 + i;
        this.f109141h = i;
        this.f109142i = i;
        this.f109138e = z;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.f109141h - this.f109142i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int i) {
        if (i >= 0) {
            int zzaf = i + zzaf();
            int i2 = this.f109143j;
            if (zzaf <= i2) {
                this.f109143j = zzaf;
                int i3 = this.f109139f + this.f109140g;
                this.f109139f = i3;
                int i4 = i3 - this.f109142i;
                if (i4 > zzaf) {
                    int i5 = i4 - zzaf;
                    this.f109140g = i5;
                    this.f109139f = i3 - i5;
                } else {
                    this.f109140g = 0;
                }
                return i2;
            }
            throw zzco.zzbl();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
