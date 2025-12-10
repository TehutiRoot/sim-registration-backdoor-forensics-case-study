package p000;

import com.google.android.gms.internal.clearcut.zzbk;
import com.google.android.gms.internal.clearcut.zzco;

/* renamed from: wf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22895wf2 extends zzbk {

    /* renamed from: d */
    public final byte[] f108521d;

    /* renamed from: e */
    public final boolean f108522e;

    /* renamed from: f */
    public int f108523f;

    /* renamed from: g */
    public int f108524g;

    /* renamed from: h */
    public int f108525h;

    /* renamed from: i */
    public int f108526i;

    /* renamed from: j */
    public int f108527j;

    public C22895wf2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f108527j = Integer.MAX_VALUE;
        this.f108521d = bArr;
        this.f108523f = i2 + i;
        this.f108525h = i;
        this.f108526i = i;
        this.f108522e = z;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.f108525h - this.f108526i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int i) {
        if (i >= 0) {
            int zzaf = i + zzaf();
            int i2 = this.f108527j;
            if (zzaf <= i2) {
                this.f108527j = zzaf;
                int i3 = this.f108523f + this.f108524g;
                this.f108523f = i3;
                int i4 = i3 - this.f108526i;
                if (i4 > zzaf) {
                    int i5 = i4 - zzaf;
                    this.f108524g = i5;
                    this.f108523f = i3 - i5;
                } else {
                    this.f108524g = 0;
                }
                return i2;
            }
            throw zzco.zzbl();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}