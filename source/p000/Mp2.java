package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;

/* renamed from: Mp2 */
/* loaded from: classes3.dex */
public final class Mp2 implements InterfaceC22853wo2 {

    /* renamed from: a */
    public final zzfo f3906a;

    /* renamed from: b */
    public final String f3907b;

    /* renamed from: c */
    public final Object[] f3908c;

    /* renamed from: d */
    public final int f3909d;

    public Mp2(zzfo zzfoVar, String str, Object[] objArr) {
        this.f3906a = zzfoVar;
        this.f3907b = str;
        this.f3908c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3909d = charAt;
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
                this.f3909d = i | (charAt2 << i3);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m67284a() {
        return this.f3907b;
    }

    /* renamed from: b */
    public final Object[] m67283b() {
        return this.f3908c;
    }

    @Override // p000.InterfaceC22853wo2
    public final zzfo zza() {
        return this.f3906a;
    }

    @Override // p000.InterfaceC22853wo2
    public final boolean zzb() {
        if ((this.f3909d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC22853wo2
    public final int zzc() {
        if ((this.f3909d & 1) != 0) {
            return 1;
        }
        return 2;
    }
}
