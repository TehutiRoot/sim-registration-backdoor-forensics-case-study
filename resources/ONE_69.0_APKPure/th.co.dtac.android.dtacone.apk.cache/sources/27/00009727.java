package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b */
/* loaded from: classes3.dex */
public final class C6557b extends AbstractC20142gk2 {
    @Override // p000.AbstractC20142gk2
    /* renamed from: a */
    public final int mo31336a(Map.Entry entry) {
        return ((C22048rl2) entry.getKey()).f77614a;
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: b */
    public final C22737vk2 mo31335b(Object obj) {
        return ((zzdz) obj).zza;
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: c */
    public final C22737vk2 mo31334c(Object obj) {
        return ((zzdz) obj).m46874k();
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: d */
    public final Object mo31333d(zzdo zzdoVar, zzfo zzfoVar, int i) {
        return zzdoVar.zzb(zzfoVar, i);
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: e */
    public final void mo31332e(Object obj) {
        ((zzdz) obj).zza.m862g();
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: f */
    public final void mo31331f(Xv2 xv2, Map.Entry entry) {
        C22048rl2 c22048rl2 = (C22048rl2) entry.getKey();
        zzho zzhoVar = zzho.zza;
        switch (c22048rl2.f77615b.ordinal()) {
            case 0:
                xv2.mo65546f(c22048rl2.f77614a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                xv2.mo65545g(c22048rl2.f77614a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                xv2.mo65541k(c22048rl2.f77614a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                xv2.mo65557E(c22048rl2.f77614a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                xv2.mo65529w(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                xv2.mo65543i(c22048rl2.f77614a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                xv2.mo65535q(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                xv2.mo65544h(c22048rl2.f77614a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                xv2.mo65537o(c22048rl2.f77614a, (String) entry.getValue());
                return;
            case 9:
                xv2.mo65528x(c22048rl2.f77614a, entry.getValue(), C23274yq2.m239a().m238b(entry.getValue().getClass()));
                return;
            case 10:
                xv2.mo65532t(c22048rl2.f77614a, entry.getValue(), C23274yq2.m239a().m238b(entry.getValue().getClass()));
                return;
            case 11:
                xv2.mo65554H(c22048rl2.f77614a, (zzdb) entry.getValue());
                return;
            case 12:
                xv2.mo65527y(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                xv2.mo65529w(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                xv2.mo65555G(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                xv2.mo65552J(c22048rl2.f77614a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                xv2.mo65531u(c22048rl2.f77614a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                xv2.mo65533s(c22048rl2.f77614a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC20142gk2
    /* renamed from: g */
    public final boolean mo31330g(zzfo zzfoVar) {
        return zzfoVar instanceof zzdz;
    }
}