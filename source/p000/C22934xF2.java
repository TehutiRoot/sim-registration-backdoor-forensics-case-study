package p000;

import com.google.android.gms.internal.measurement.zzll;

/* renamed from: xF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22934xF2 implements EE2 {

    /* renamed from: a */
    public final zzll f108287a;

    /* renamed from: b */
    public final String f108288b;

    /* renamed from: c */
    public final Object[] f108289c;

    /* renamed from: d */
    public final int f108290d;

    public C22934xF2(zzll zzllVar, String str, Object[] objArr) {
        this.f108287a = zzllVar;
        this.f108288b = str;
        this.f108289c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f108290d = charAt;
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
                this.f108290d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final String m591a() {
        return this.f108288b;
    }

    /* renamed from: b */
    public final Object[] m590b() {
        return this.f108289c;
    }

    @Override // p000.EE2
    public final zzll zza() {
        return this.f108287a;
    }

    @Override // p000.EE2
    public final boolean zzb() {
        if ((this.f108290d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.EE2
    public final int zzc() {
        if ((this.f108290d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
