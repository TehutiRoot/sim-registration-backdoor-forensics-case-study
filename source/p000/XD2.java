package p000;

import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkz;

/* renamed from: XD2 */
/* loaded from: classes3.dex */
public final class XD2 implements InterfaceC23097yC2 {

    /* renamed from: a */
    public final zzkk f7413a;

    /* renamed from: b */
    public final String f7414b;

    /* renamed from: c */
    public final Object[] f7415c;

    /* renamed from: d */
    public final int f7416d;

    public XD2(zzkk zzkkVar, String str, Object[] objArr) {
        this.f7413a = zzkkVar;
        this.f7414b = str;
        this.f7415c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7416d = charAt;
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
                this.f7416d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m65531a() {
        return this.f7414b;
    }

    /* renamed from: b */
    public final Object[] m65530b() {
        return this.f7415c;
    }

    @Override // p000.InterfaceC23097yC2
    public final int zza() {
        if ((this.f7416d & 1) == 1) {
            return zzkz.zza;
        }
        return zzkz.zzb;
    }

    @Override // p000.InterfaceC23097yC2
    public final boolean zzb() {
        if ((this.f7416d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC23097yC2
    public final zzkk zzc() {
        return this.f7413a;
    }
}
