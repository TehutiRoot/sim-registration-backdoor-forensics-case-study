package p000;

import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzys;

/* renamed from: KM2 */
/* loaded from: classes3.dex */
public final class KM2 implements InterfaceC21986rM2 {

    /* renamed from: a */
    public final zzys f3298a;

    /* renamed from: b */
    public final String f3299b;

    /* renamed from: c */
    public final Object[] f3300c;

    /* renamed from: d */
    public final int f3301d;

    public KM2(zzys zzysVar, String str, Object[] objArr) {
        this.f3298a = zzysVar;
        this.f3299b = str;
        this.f3300c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3301d = charAt;
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
                this.f3301d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // p000.InterfaceC21986rM2
    /* renamed from: a */
    public final zzys mo23517a() {
        return this.f3298a;
    }

    @Override // p000.InterfaceC21986rM2
    /* renamed from: b */
    public final boolean mo23516b() {
        if ((this.f3301d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC21986rM2
    /* renamed from: c */
    public final int mo23515c() {
        if ((this.f3301d & 1) == 1) {
            return zzxh.zzg.zzcpe;
        }
        return zzxh.zzg.zzcpf;
    }

    /* renamed from: d */
    public final String m67721d() {
        return this.f3299b;
    }

    /* renamed from: e */
    public final Object[] m67720e() {
        return this.f3300c;
    }
}