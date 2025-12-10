package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;

/* renamed from: Jq2 */
/* loaded from: classes3.dex */
public final class Jq2 implements InterfaceC22406tp2 {

    /* renamed from: a */
    public final zzfo f3124a;

    /* renamed from: b */
    public final String f3125b;

    /* renamed from: c */
    public final Object[] f3126c;

    /* renamed from: d */
    public final int f3127d;

    public Jq2(zzfo zzfoVar, String str, Object[] objArr) {
        this.f3124a = zzfoVar;
        this.f3125b = str;
        this.f3126c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3127d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.f3127d = i | (charAt2 << i3);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m67801a() {
        return this.f3125b;
    }

    /* renamed from: b */
    public final Object[] m67800b() {
        return this.f3126c;
    }

    @Override // p000.InterfaceC22406tp2
    public final zzfo zza() {
        return this.f3124a;
    }

    @Override // p000.InterfaceC22406tp2
    public final boolean zzb() {
        if ((this.f3127d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22406tp2
    public final int zzc() {
        if ((this.f3127d & 1) != 0) {
            return 1;
        }
        return 2;
    }
}