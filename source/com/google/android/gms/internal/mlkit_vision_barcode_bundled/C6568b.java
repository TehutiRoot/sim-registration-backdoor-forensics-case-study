package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b */
/* loaded from: classes3.dex */
public final class C6568b extends AbstractC20602jj2 {
    @Override // p000.AbstractC20602jj2
    /* renamed from: a */
    public final int mo29142a(Map.Entry entry) {
        return ((C22497uk2) entry.getKey()).f107447a;
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: b */
    public final C23182yj2 mo29141b(Object obj) {
        return ((zzdz) obj).zza;
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: c */
    public final C23182yj2 mo29140c(Object obj) {
        return ((zzdz) obj).m46882k();
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: d */
    public final Object mo29139d(zzdo zzdoVar, zzfo zzfoVar, int i) {
        return zzdoVar.zzb(zzfoVar, i);
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: e */
    public final void mo29138e(Object obj) {
        ((zzdz) obj).zza.m198g();
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: f */
    public final void mo29137f(InterfaceC19090av2 interfaceC19090av2, Map.Entry entry) {
        C22497uk2 c22497uk2 = (C22497uk2) entry.getKey();
        zzho zzhoVar = zzho.zza;
        switch (c22497uk2.f107448b.ordinal()) {
            case 0:
                interfaceC19090av2.mo52101f(c22497uk2.f107447a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                interfaceC19090av2.mo52100g(c22497uk2.f107447a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                interfaceC19090av2.mo52096k(c22497uk2.f107447a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                interfaceC19090av2.mo52112E(c22497uk2.f107447a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC19090av2.mo52084w(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                interfaceC19090av2.mo52098i(c22497uk2.f107447a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                interfaceC19090av2.mo52090q(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                interfaceC19090av2.mo52099h(c22497uk2.f107447a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                interfaceC19090av2.mo52092o(c22497uk2.f107447a, (String) entry.getValue());
                return;
            case 9:
                interfaceC19090av2.mo52083x(c22497uk2.f107447a, entry.getValue(), Bp2.m68857a().m68856b(entry.getValue().getClass()));
                return;
            case 10:
                interfaceC19090av2.mo52087t(c22497uk2.f107447a, entry.getValue(), Bp2.m68857a().m68856b(entry.getValue().getClass()));
                return;
            case 11:
                interfaceC19090av2.mo52109H(c22497uk2.f107447a, (zzdb) entry.getValue());
                return;
            case 12:
                interfaceC19090av2.mo52082y(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC19090av2.mo52084w(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                interfaceC19090av2.mo52110G(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC19090av2.mo52107J(c22497uk2.f107447a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                interfaceC19090av2.mo52086u(c22497uk2.f107447a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                interfaceC19090av2.mo52088s(c22497uk2.f107447a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC20602jj2
    /* renamed from: g */
    public final boolean mo29136g(zzfo zzfoVar) {
        return zzfoVar instanceof zzdz;
    }
}
