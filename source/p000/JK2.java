package p000;

import com.google.android.gms.internal.firebase_ml.zzwp;
import com.google.android.gms.internal.firebase_ml.zzxs;

/* renamed from: JK2 */
/* loaded from: classes3.dex */
public final class JK2 extends zzwp {

    /* renamed from: d */
    public final byte[] f2769d;

    /* renamed from: e */
    public final boolean f2770e;

    /* renamed from: f */
    public int f2771f;

    /* renamed from: g */
    public int f2772g;

    /* renamed from: h */
    public int f2773h;

    /* renamed from: i */
    public int f2774i;

    /* renamed from: j */
    public int f2775j;

    public JK2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f2775j = Integer.MAX_VALUE;
        this.f2769d = bArr;
        this.f2771f = i2 + i;
        this.f2773h = i;
        this.f2774i = i;
        this.f2770e = z;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwp
    public final int zzde(int i) {
        if (i >= 0) {
            int zzuj = i + zzuj();
            int i2 = this.f2775j;
            if (zzuj <= i2) {
                this.f2775j = zzuj;
                int i3 = this.f2771f + this.f2772g;
                this.f2771f = i3;
                int i4 = i3 - this.f2774i;
                if (i4 > zzuj) {
                    int i5 = i4 - zzuj;
                    this.f2772g = i5;
                    this.f2771f = i3 - i5;
                } else {
                    this.f2772g = 0;
                }
                return i2;
            }
            throw zzxs.zzvq();
        }
        throw zzxs.zzvr();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwp
    public final int zzuj() {
        return this.f2773h - this.f2774i;
    }
}
