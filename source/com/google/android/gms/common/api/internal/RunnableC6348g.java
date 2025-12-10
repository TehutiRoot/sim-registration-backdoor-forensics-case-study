package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes3.dex */
public final class RunnableC6348g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Result f44832a;

    /* renamed from: b */
    public final /* synthetic */ zada f44833b;

    public RunnableC6348g(zada zadaVar, Result result) {
        this.f44833b = zadaVar;
        this.f44832a = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        N82 n82;
        N82 n822;
        WeakReference weakReference2;
        GoogleApiClient googleApiClient;
        ResultTransform resultTransform;
        N82 n823;
        N82 n824;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                resultTransform = this.f44833b.f44933a;
                PendingResult onSuccess = ((ResultTransform) Preconditions.checkNotNull(resultTransform)).onSuccess(this.f44832a);
                zada zadaVar = this.f44833b;
                n823 = zadaVar.f44940h;
                n824 = zadaVar.f44940h;
                n823.sendMessage(n824.obtainMessage(0, onSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.f44833b;
                zada.m48462m(this.f44832a);
                weakReference3 = this.f44833b.f44939g;
                googleApiClient = (GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.f44833b;
                n82 = zadaVar3.f44940h;
                n822 = zadaVar3.f44940h;
                n82.sendMessage(n822.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.f44833b;
                zada.m48462m(this.f44832a);
                weakReference2 = this.f44833b.f44939g;
                googleApiClient = (GoogleApiClient) weakReference2.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.f44833b);
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.f44833b;
            zada.m48462m(this.f44832a);
            weakReference = this.f44833b.f44939g;
            GoogleApiClient googleApiClient2 = (GoogleApiClient) weakReference.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.f44833b);
            }
            throw th2;
        }
    }
}
