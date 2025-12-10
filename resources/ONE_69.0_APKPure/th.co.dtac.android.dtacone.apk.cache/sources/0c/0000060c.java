package p000;

import com.google.android.gms.internal.firebase_ml.zzwp;
import com.google.android.gms.internal.firebase_ml.zzxs;

/* renamed from: GL2 */
/* loaded from: classes3.dex */
public final class GL2 extends zzwp {

    /* renamed from: d */
    public final byte[] f1950d;

    /* renamed from: e */
    public final boolean f1951e;

    /* renamed from: f */
    public int f1952f;

    /* renamed from: g */
    public int f1953g;

    /* renamed from: h */
    public int f1954h;

    /* renamed from: i */
    public int f1955i;

    /* renamed from: j */
    public int f1956j;

    public GL2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f1956j = Integer.MAX_VALUE;
        this.f1950d = bArr;
        this.f1952f = i2 + i;
        this.f1954h = i;
        this.f1955i = i;
        this.f1951e = z;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwp
    public final int zzde(int i) {
        if (i >= 0) {
            int zzuj = i + zzuj();
            int i2 = this.f1956j;
            if (zzuj <= i2) {
                this.f1956j = zzuj;
                int i3 = this.f1952f + this.f1953g;
                this.f1952f = i3;
                int i4 = i3 - this.f1955i;
                if (i4 > zzuj) {
                    int i5 = i4 - zzuj;
                    this.f1953g = i5;
                    this.f1952f = i3 - i5;
                } else {
                    this.f1953g = 0;
                }
                return i2;
            }
            throw zzxs.zzvq();
        }
        throw zzxs.zzvr();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwp
    public final int zzuj() {
        return this.f1954h - this.f1955i;
    }
}