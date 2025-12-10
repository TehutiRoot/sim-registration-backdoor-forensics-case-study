package p000;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzjh;

/* renamed from: Wz2 */
/* loaded from: classes3.dex */
public final class Wz2 extends zzjh {

    /* renamed from: a */
    public final byte[] f7358a;

    /* renamed from: b */
    public int f7359b;

    /* renamed from: c */
    public int f7360c;

    /* renamed from: d */
    public int f7361d;

    public /* synthetic */ Wz2(byte[] bArr, int i, int i2, boolean z, zzje zzjeVar) {
        super(null);
        this.f7361d = Integer.MAX_VALUE;
        this.f7358a = bArr;
        this.f7359b = 0;
    }

    /* renamed from: a */
    public final int m65546a(int i) {
        int i2 = this.f7361d;
        this.f7361d = 0;
        int i3 = this.f7359b + this.f7360c;
        this.f7359b = i3;
        if (i3 > 0) {
            this.f7360c = i3;
            this.f7359b = 0;
        } else {
            this.f7360c = 0;
        }
        return i2;
    }
}
