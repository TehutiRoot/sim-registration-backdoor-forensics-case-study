package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.d */
/* loaded from: classes3.dex */
public final class C6396d extends AbstractC18171Oe2 {
    @Override // p000.AbstractC18171Oe2
    /* renamed from: a */
    public final int mo48300a(Map.Entry entry) {
        return ((zzcg.C6423a) entry.getKey()).f45560b;
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: b */
    public final C20934lf2 mo48299b(Object obj) {
        return ((zzcg.zzd) obj).zzjv;
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: c */
    public final void mo48298c(Object obj, C20934lf2 c20934lf2) {
        ((zzcg.zzd) obj).zzjv = c20934lf2;
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: d */
    public final void mo48297d(InterfaceC19588dp2 interfaceC19588dp2, Map.Entry entry) {
        zzcg.C6423a c6423a = (zzcg.C6423a) entry.getKey();
        switch (AbstractC18875Ze2.f8090a[c6423a.f45561c.ordinal()]) {
            case 1:
                interfaceC19588dp2.mo31646m(c6423a.f45560b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC19588dp2.mo31645n(c6423a.f45560b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC19588dp2.mo31671D(c6423a.f45560b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC19588dp2.mo31647l(c6423a.f45560b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC19588dp2.mo31642q(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC19588dp2.mo31650i(c6423a.f45560b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC19588dp2.mo31641r(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC19588dp2.mo31651h(c6423a.f45560b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC19588dp2.mo31636w(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC19588dp2.mo31664K(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC19588dp2.mo31672C(c6423a.f45560b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC19588dp2.mo31673B(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC19588dp2.mo31653f(c6423a.f45560b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC19588dp2.mo31642q(c6423a.f45560b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC19588dp2.mo31662M(c6423a.f45560b, (zzbb) entry.getValue());
                return;
            case 16:
                interfaceC19588dp2.mo31670E(c6423a.f45560b, (String) entry.getValue());
                return;
            case 17:
                interfaceC19588dp2.mo31660O(c6423a.f45560b, entry.getValue(), C23013xk2.m400a().m399b(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC19588dp2.mo31659P(c6423a.f45560b, entry.getValue(), C23013xk2.m400a().m399b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: e */
    public final C20934lf2 mo48296e(Object obj) {
        C20934lf2 mo48299b = mo48299b(obj);
        if (mo48299b.m26445c()) {
            C20934lf2 c20934lf2 = (C20934lf2) mo48299b.clone();
            mo48298c(obj, c20934lf2);
            return c20934lf2;
        }
        return mo48299b;
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: f */
    public final void mo48295f(Object obj) {
        mo48299b(obj).m26428t();
    }

    @Override // p000.AbstractC18171Oe2
    /* renamed from: g */
    public final boolean mo48294g(zzdo zzdoVar) {
        return zzdoVar instanceof zzcg.zzd;
    }
}
