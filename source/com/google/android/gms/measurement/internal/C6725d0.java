package com.google.android.gms.measurement.internal;

import android.os.Handler;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* renamed from: com.google.android.gms.measurement.internal.d0 */
/* loaded from: classes3.dex */
public final class C6725d0 {

    /* renamed from: a */
    public RunnableC6723c0 f48158a;

    /* renamed from: b */
    public final /* synthetic */ zzki f48159b;

    public C6725d0(zzki zzkiVar) {
        this.f48159b = zzkiVar;
    }

    /* renamed from: a */
    public final void m46378a(long j) {
        Handler handler;
        this.f48158a = new RunnableC6723c0(this, this.f48159b.zzs.zzav().currentTimeMillis(), j);
        handler = this.f48159b.f48442b;
        handler.postDelayed(this.f48158a, BuyDolAddBankAccountFragment.WAIT_MILLI);
    }

    /* renamed from: b */
    public final void m46377b() {
        Handler handler;
        this.f48159b.zzg();
        RunnableC6723c0 runnableC6723c0 = this.f48158a;
        if (runnableC6723c0 != null) {
            handler = this.f48159b.f48442b;
            handler.removeCallbacks(runnableC6723c0);
        }
        this.f48159b.zzs.zzm().f1413p.zza(false);
    }
}
