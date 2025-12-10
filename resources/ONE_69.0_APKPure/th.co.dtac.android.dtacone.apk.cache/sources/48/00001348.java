package p000;

import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkz;

/* renamed from: UE2 */
/* loaded from: classes3.dex */
public final class UE2 implements InterfaceC22651vD2 {

    /* renamed from: a */
    public final zzkk f6578a;

    /* renamed from: b */
    public final String f6579b;

    /* renamed from: c */
    public final Object[] f6580c;

    /* renamed from: d */
    public final int f6581d;

    public UE2(zzkk zzkkVar, String str, Object[] objArr) {
        this.f6578a = zzkkVar;
        this.f6579b = str;
        this.f6580c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6581d = charAt;
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
                this.f6581d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m66226a() {
        return this.f6579b;
    }

    /* renamed from: b */
    public final Object[] m66225b() {
        return this.f6580c;
    }

    @Override // p000.InterfaceC22651vD2
    public final int zza() {
        if ((this.f6581d & 1) == 1) {
            return zzkz.zza;
        }
        return zzkz.zzb;
    }

    @Override // p000.InterfaceC22651vD2
    public final boolean zzb() {
        if ((this.f6581d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22651vD2
    public final zzkk zzc() {
        return this.f6578a;
    }
}