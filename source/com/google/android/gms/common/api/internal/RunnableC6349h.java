package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes3.dex */
public final class RunnableC6349h implements Runnable {

    /* renamed from: a */
    public final C20680k92 f44834a;

    /* renamed from: b */
    public final /* synthetic */ zap f44835b;

    public RunnableC6349h(zap zapVar, C20680k92 c20680k92) {
        this.f44835b = zapVar;
        this.f44834a = c20680k92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f44835b.zaa) {
            return;
        }
        ConnectionResult m28986b = this.f44834a.m28986b();
        if (m28986b.hasResolution()) {
            zap zapVar = this.f44835b;
            zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(m28986b.getResolution()), this.f44834a.m28987a(), false), 1);
            return;
        }
        zap zapVar2 = this.f44835b;
        if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), m28986b.getErrorCode(), null) != null) {
            zap zapVar3 = this.f44835b;
            zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, m28986b.getErrorCode(), 2, this.f44835b);
        } else if (m28986b.getErrorCode() != 18) {
            this.f44835b.m48458a(m28986b, this.f44834a.m28987a());
        } else {
            zap zapVar4 = this.f44835b;
            Dialog zab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.f44835b;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new C21196n92(this, zab));
        }
    }
}
