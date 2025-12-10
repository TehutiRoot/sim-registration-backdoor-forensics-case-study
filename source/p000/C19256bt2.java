package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19256bt2 {

    /* renamed from: A */
    public long f39238A;

    /* renamed from: B */
    public String f39239B;

    /* renamed from: C */
    public boolean f39240C;

    /* renamed from: D */
    public long f39241D;

    /* renamed from: E */
    public long f39242E;

    /* renamed from: a */
    public final zzfy f39243a;

    /* renamed from: b */
    public final String f39244b;

    /* renamed from: c */
    public String f39245c;

    /* renamed from: d */
    public String f39246d;

    /* renamed from: e */
    public String f39247e;

    /* renamed from: f */
    public String f39248f;

    /* renamed from: g */
    public long f39249g;

    /* renamed from: h */
    public long f39250h;

    /* renamed from: i */
    public long f39251i;

    /* renamed from: j */
    public String f39252j;

    /* renamed from: k */
    public long f39253k;

    /* renamed from: l */
    public String f39254l;

    /* renamed from: m */
    public long f39255m;

    /* renamed from: n */
    public long f39256n;

    /* renamed from: o */
    public boolean f39257o;

    /* renamed from: p */
    public boolean f39258p;

    /* renamed from: q */
    public String f39259q;

    /* renamed from: r */
    public Boolean f39260r;

    /* renamed from: s */
    public long f39261s;

    /* renamed from: t */
    public List f39262t;

    /* renamed from: u */
    public String f39263u;

    /* renamed from: v */
    public long f39264v;

    /* renamed from: w */
    public long f39265w;

    /* renamed from: x */
    public long f39266x;

    /* renamed from: y */
    public long f39267y;

    /* renamed from: z */
    public long f39268z;

    public C19256bt2(zzfy zzfyVar, String str) {
        Preconditions.checkNotNull(zzfyVar);
        Preconditions.checkNotEmpty(str);
        this.f39243a = zzfyVar;
        this.f39244b = str;
        zzfyVar.zzaz().zzg();
    }

    /* renamed from: A */
    public final long m51800A() {
        this.f39243a.zzaz().zzg();
        return 0L;
    }

    /* renamed from: B */
    public final void m51799B(long j) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f39243a.zzaz().zzg();
        boolean z3 = this.f39240C;
        if (this.f39249g != j) {
            z2 = true;
        }
        this.f39240C = z3 | z2;
        this.f39249g = j;
    }

    /* renamed from: C */
    public final void m51798C(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39250h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39250h = j;
    }

    /* renamed from: D */
    public final void m51797D(boolean z) {
        boolean z2;
        this.f39243a.zzaz().zzg();
        boolean z3 = this.f39240C;
        if (this.f39257o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f39240C = z3 | z2;
        this.f39257o = z;
    }

    /* renamed from: E */
    public final void m51796E(Boolean bool) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39260r, bool);
        this.f39260r = bool;
    }

    /* renamed from: F */
    public final void m51795F(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39247e, str);
        this.f39247e = str;
    }

    /* renamed from: G */
    public final void m51794G(List list) {
        ArrayList arrayList;
        this.f39243a.zzaz().zzg();
        if (!zzg.zza(this.f39262t, list)) {
            this.f39240C = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f39262t = arrayList;
        }
    }

    /* renamed from: H */
    public final void m51793H(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39263u, str);
        this.f39263u = str;
    }

    /* renamed from: I */
    public final boolean m51792I() {
        this.f39243a.zzaz().zzg();
        return this.f39258p;
    }

    /* renamed from: J */
    public final boolean m51791J() {
        this.f39243a.zzaz().zzg();
        return this.f39257o;
    }

    /* renamed from: K */
    public final boolean m51790K() {
        this.f39243a.zzaz().zzg();
        return this.f39240C;
    }

    /* renamed from: L */
    public final long m51789L() {
        this.f39243a.zzaz().zzg();
        return this.f39253k;
    }

    /* renamed from: M */
    public final long m51788M() {
        this.f39243a.zzaz().zzg();
        return this.f39241D;
    }

    /* renamed from: N */
    public final long m51787N() {
        this.f39243a.zzaz().zzg();
        return this.f39267y;
    }

    /* renamed from: O */
    public final long m51786O() {
        this.f39243a.zzaz().zzg();
        return this.f39268z;
    }

    /* renamed from: P */
    public final long m51785P() {
        this.f39243a.zzaz().zzg();
        return this.f39266x;
    }

    /* renamed from: Q */
    public final long m51784Q() {
        this.f39243a.zzaz().zzg();
        return this.f39265w;
    }

    /* renamed from: R */
    public final long m51783R() {
        this.f39243a.zzaz().zzg();
        return this.f39238A;
    }

    /* renamed from: S */
    public final long m51782S() {
        this.f39243a.zzaz().zzg();
        return this.f39264v;
    }

    /* renamed from: T */
    public final long m51781T() {
        this.f39243a.zzaz().zzg();
        return this.f39256n;
    }

    /* renamed from: U */
    public final long m51780U() {
        this.f39243a.zzaz().zzg();
        return this.f39261s;
    }

    /* renamed from: V */
    public final long m51779V() {
        this.f39243a.zzaz().zzg();
        return this.f39242E;
    }

    /* renamed from: W */
    public final long m51778W() {
        this.f39243a.zzaz().zzg();
        return this.f39255m;
    }

    /* renamed from: X */
    public final long m51777X() {
        this.f39243a.zzaz().zzg();
        return this.f39251i;
    }

    /* renamed from: Y */
    public final long m51776Y() {
        this.f39243a.zzaz().zzg();
        return this.f39249g;
    }

    /* renamed from: Z */
    public final long m51775Z() {
        this.f39243a.zzaz().zzg();
        return this.f39250h;
    }

    /* renamed from: a */
    public final String m51774a() {
        this.f39243a.zzaz().zzg();
        return this.f39247e;
    }

    /* renamed from: a0 */
    public final Boolean m51773a0() {
        this.f39243a.zzaz().zzg();
        return this.f39260r;
    }

    /* renamed from: b */
    public final String m51772b() {
        this.f39243a.zzaz().zzg();
        return this.f39263u;
    }

    /* renamed from: b0 */
    public final String m51771b0() {
        this.f39243a.zzaz().zzg();
        return this.f39259q;
    }

    /* renamed from: c */
    public final List m51770c() {
        this.f39243a.zzaz().zzg();
        return this.f39262t;
    }

    /* renamed from: c0 */
    public final String m51769c0() {
        this.f39243a.zzaz().zzg();
        String str = this.f39239B;
        m51740y(null);
        return str;
    }

    /* renamed from: d */
    public final void m51768d() {
        this.f39243a.zzaz().zzg();
        this.f39240C = false;
    }

    /* renamed from: d0 */
    public final String m51767d0() {
        this.f39243a.zzaz().zzg();
        return this.f39244b;
    }

    /* renamed from: e */
    public final void m51766e() {
        this.f39243a.zzaz().zzg();
        long j = this.f39249g + 1;
        if (j > 2147483647L) {
            this.f39243a.zzay().zzk().zzb("Bundle index overflow. appId", zzeo.zzn(this.f39244b));
            j = 0;
        }
        this.f39240C = true;
        this.f39249g = j;
    }

    /* renamed from: e0 */
    public final String m51765e0() {
        this.f39243a.zzaz().zzg();
        return this.f39245c;
    }

    /* renamed from: f */
    public final void m51764f(String str) {
        this.f39243a.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f39240C |= true ^ zzg.zza(this.f39259q, str);
        this.f39259q = str;
    }

    /* renamed from: f0 */
    public final String m51763f0() {
        this.f39243a.zzaz().zzg();
        return this.f39254l;
    }

    /* renamed from: g */
    public final void m51762g(boolean z) {
        boolean z2;
        this.f39243a.zzaz().zzg();
        boolean z3 = this.f39240C;
        if (this.f39258p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f39240C = z3 | z2;
        this.f39258p = z;
    }

    /* renamed from: g0 */
    public final String m51761g0() {
        this.f39243a.zzaz().zzg();
        return this.f39252j;
    }

    /* renamed from: h */
    public final void m51760h(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39245c, str);
        this.f39245c = str;
    }

    /* renamed from: h0 */
    public final String m51759h0() {
        this.f39243a.zzaz().zzg();
        return this.f39248f;
    }

    /* renamed from: i */
    public final void m51758i(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39254l, str);
        this.f39254l = str;
    }

    /* renamed from: i0 */
    public final String m51757i0() {
        this.f39243a.zzaz().zzg();
        return this.f39246d;
    }

    /* renamed from: j */
    public final void m51756j(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39252j, str);
        this.f39252j = str;
    }

    /* renamed from: j0 */
    public final String m51755j0() {
        this.f39243a.zzaz().zzg();
        return this.f39239B;
    }

    /* renamed from: k */
    public final void m51754k(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39253k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39253k = j;
    }

    /* renamed from: l */
    public final void m51753l(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39241D != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39241D = j;
    }

    /* renamed from: m */
    public final void m51752m(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39267y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39267y = j;
    }

    /* renamed from: n */
    public final void m51751n(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39268z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39268z = j;
    }

    /* renamed from: o */
    public final void m51750o(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39266x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39266x = j;
    }

    /* renamed from: p */
    public final void m51749p(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39265w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39265w = j;
    }

    /* renamed from: q */
    public final void m51748q(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39238A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39238A = j;
    }

    /* renamed from: r */
    public final void m51747r(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39264v != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39264v = j;
    }

    /* renamed from: s */
    public final void m51746s(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39256n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39256n = j;
    }

    /* renamed from: t */
    public final void m51745t(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39261s != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39261s = j;
    }

    /* renamed from: u */
    public final void m51744u(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39242E != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39242E = j;
    }

    /* renamed from: v */
    public final void m51743v(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39248f, str);
        this.f39248f = str;
    }

    /* renamed from: w */
    public final void m51742w(String str) {
        this.f39243a.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f39240C |= true ^ zzg.zza(this.f39246d, str);
        this.f39246d = str;
    }

    /* renamed from: x */
    public final void m51741x(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39255m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39255m = j;
    }

    /* renamed from: y */
    public final void m51740y(String str) {
        this.f39243a.zzaz().zzg();
        this.f39240C |= !zzg.zza(this.f39239B, str);
        this.f39239B = str;
    }

    /* renamed from: z */
    public final void m51739z(long j) {
        boolean z;
        this.f39243a.zzaz().zzg();
        boolean z2 = this.f39240C;
        if (this.f39251i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f39240C = z2 | z;
        this.f39251i = j;
    }
}
