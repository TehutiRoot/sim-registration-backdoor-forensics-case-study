package p000;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzdo;

/* renamed from: Gk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17677Gk2 implements InterfaceC18759Xi2 {

    /* renamed from: a */
    public final zzdo f1994a;

    /* renamed from: b */
    public final String f1995b;

    /* renamed from: c */
    public final C17997Lk2 f1996c;

    public C17677Gk2(zzdo zzdoVar, String str, Object[] objArr) {
        this.f1994a = zzdoVar;
        this.f1995b = str;
        this.f1996c = new C17997Lk2(zzdoVar.getClass(), str, objArr);
    }

    @Override // p000.InterfaceC18759Xi2
    /* renamed from: a */
    public final int mo65441a() {
        int i;
        i = this.f1996c.f3559d;
        if ((i & 1) == 1) {
            return zzcg.zzg.zzkl;
        }
        return zzcg.zzg.zzkm;
    }

    @Override // p000.InterfaceC18759Xi2
    /* renamed from: b */
    public final boolean mo65440b() {
        int i;
        i = this.f1996c.f3559d;
        if ((i & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18759Xi2
    /* renamed from: c */
    public final zzdo mo65439c() {
        return this.f1994a;
    }

    /* renamed from: d */
    public final int m68197d() {
        int i;
        i = this.f1996c.f3560e;
        return i;
    }

    /* renamed from: e */
    public final C17997Lk2 m68196e() {
        return this.f1996c;
    }

    /* renamed from: f */
    public final int m68195f() {
        int i;
        i = this.f1996c.f3563h;
        return i;
    }

    /* renamed from: g */
    public final int m68194g() {
        int i;
        i = this.f1996c.f3564i;
        return i;
    }

    /* renamed from: h */
    public final int m68193h() {
        int i;
        i = this.f1996c.f3565j;
        return i;
    }

    /* renamed from: i */
    public final int m68192i() {
        int i;
        i = this.f1996c.f3568m;
        return i;
    }

    /* renamed from: j */
    public final int[] m68191j() {
        int[] iArr;
        iArr = this.f1996c.f3569n;
        return iArr;
    }

    /* renamed from: k */
    public final int m68190k() {
        int i;
        i = this.f1996c.f3567l;
        return i;
    }

    /* renamed from: l */
    public final int m68189l() {
        int i;
        i = this.f1996c.f3566k;
        return i;
    }
}
