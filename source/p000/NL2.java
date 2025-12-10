package p000;

import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzys;

/* renamed from: NL2 */
/* loaded from: classes3.dex */
public final class NL2 implements InterfaceC22436uL2 {

    /* renamed from: a */
    public final zzys f4083a;

    /* renamed from: b */
    public final String f4084b;

    /* renamed from: c */
    public final Object[] f4085c;

    /* renamed from: d */
    public final int f4086d;

    public NL2(zzys zzysVar, String str, Object[] objArr) {
        this.f4083a = zzysVar;
        this.f4084b = str;
        this.f4085c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4086d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f4086d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC22436uL2
    /* renamed from: a */
    public final zzys mo1280a() {
        return this.f4083a;
    }

    @Override // p000.InterfaceC22436uL2
    /* renamed from: b */
    public final boolean mo1279b() {
        if ((this.f4086d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22436uL2
    /* renamed from: c */
    public final int mo1278c() {
        if ((this.f4086d & 1) == 1) {
            return zzxh.zzg.zzcpe;
        }
        return zzxh.zzg.zzcpf;
    }

    /* renamed from: d */
    public final String m67226d() {
        return this.f4084b;
    }

    /* renamed from: e */
    public final Object[] m67225e() {
        return this.f4085c;
    }
}
