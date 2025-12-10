package p000;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzdo;

/* renamed from: Dl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17514Dl2 implements InterfaceC18613Uj2 {

    /* renamed from: a */
    public final zzdo f1106a;

    /* renamed from: b */
    public final String f1107b;

    /* renamed from: c */
    public final C17839Il2 f1108c;

    public C17514Dl2(zzdo zzdoVar, String str, Object[] objArr) {
        this.f1106a = zzdoVar;
        this.f1107b = str;
        this.f1108c = new C17839Il2(zzdoVar.getClass(), str, objArr);
    }

    @Override // p000.InterfaceC18613Uj2
    /* renamed from: a */
    public final int mo66098a() {
        int i;
        i = this.f1108c.f2781d;
        if ((i & 1) == 1) {
            return zzcg.zzg.zzkl;
        }
        return zzcg.zzg.zzkm;
    }

    @Override // p000.InterfaceC18613Uj2
    /* renamed from: b */
    public final boolean mo66097b() {
        int i;
        i = this.f1108c.f2781d;
        if ((i & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18613Uj2
    /* renamed from: c */
    public final zzdo mo66096c() {
        return this.f1106a;
    }

    /* renamed from: d */
    public final int m68786d() {
        int i;
        i = this.f1108c.f2782e;
        return i;
    }

    /* renamed from: e */
    public final C17839Il2 m68785e() {
        return this.f1108c;
    }

    /* renamed from: f */
    public final int m68784f() {
        int i;
        i = this.f1108c.f2785h;
        return i;
    }

    /* renamed from: g */
    public final int m68783g() {
        int i;
        i = this.f1108c.f2786i;
        return i;
    }

    /* renamed from: h */
    public final int m68782h() {
        int i;
        i = this.f1108c.f2787j;
        return i;
    }

    /* renamed from: i */
    public final int m68781i() {
        int i;
        i = this.f1108c.f2790m;
        return i;
    }

    /* renamed from: j */
    public final int[] m68780j() {
        int[] iArr;
        iArr = this.f1108c.f2791n;
        return iArr;
    }

    /* renamed from: k */
    public final int m68779k() {
        int i;
        i = this.f1108c.f2789l;
        return i;
    }

    /* renamed from: l */
    public final int m68778l() {
        int i;
        i = this.f1108c.f2788k;
        return i;
    }
}