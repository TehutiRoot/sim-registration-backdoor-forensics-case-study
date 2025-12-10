package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes3.dex */
public final class RunnableC6338h implements Runnable {

    /* renamed from: a */
    public final C20285ha2 f44846a;

    /* renamed from: b */
    public final /* synthetic */ zap f44847b;

    public RunnableC6338h(zap zapVar, C20285ha2 c20285ha2) {
        this.f44847b = zapVar;
        this.f44846a = c20285ha2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f44847b.zaa) {
            return;
        }
        ConnectionResult m31197b = this.f44846a.m31197b();
        if (m31197b.hasResolution()) {
            zap zapVar = this.f44847b;
            zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(m31197b.getResolution()), this.f44846a.m31198a(), false), 1);
            return;
        }
        zap zapVar2 = this.f44847b;
        if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), m31197b.getErrorCode(), null) != null) {
            zap zapVar3 = this.f44847b;
            zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, m31197b.getErrorCode(), 2, this.f44847b);
        } else if (m31197b.getErrorCode() != 18) {
            this.f44847b.m48455a(m31197b, this.f44846a.m31198a());
        } else {
            zap zapVar4 = this.f44847b;
            Dialog zab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.f44847b;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new C20804ka2(this, zab));
        }
    }
}