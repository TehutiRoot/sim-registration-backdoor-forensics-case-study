package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.O */
/* loaded from: classes3.dex */
public final class C6707O extends AbstractC20753kc2 {

    /* renamed from: e */
    public final /* synthetic */ zzjs f48100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6707O(zzjs zzjsVar, InterfaceC21145ms2 interfaceC21145ms2) {
        super(interfaceC21145ms2);
        this.f48100e = zzjsVar;
    }

    @Override // p000.AbstractC20753kc2
    /* renamed from: c */
    public final void mo28908c() {
        zzjs zzjsVar = this.f48100e;
        zzjsVar.zzg();
        if (!zzjsVar.zzL()) {
            return;
        }
        zzjsVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
        zzjsVar.zzs();
    }
}
