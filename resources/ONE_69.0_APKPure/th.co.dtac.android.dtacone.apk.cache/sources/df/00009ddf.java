package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.O */
/* loaded from: classes3.dex */
public final class C6696O extends AbstractC20294hd2 {

    /* renamed from: e */
    public final /* synthetic */ zzjs f48112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6696O(zzjs zzjsVar, InterfaceC20688jt2 interfaceC20688jt2) {
        super(interfaceC20688jt2);
        this.f48112e = zzjsVar;
    }

    @Override // p000.AbstractC20294hd2
    /* renamed from: c */
    public final void mo31189c() {
        zzjs zzjsVar = this.f48112e;
        zzjsVar.zzg();
        if (!zzjsVar.zzL()) {
            return;
        }
        zzjsVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
        zzjsVar.zzs();
    }
}