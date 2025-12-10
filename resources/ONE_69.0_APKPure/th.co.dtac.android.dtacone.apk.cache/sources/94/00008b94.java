package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes3.dex */
public final class RunnableC6337g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Result f44844a;

    /* renamed from: b */
    public final /* synthetic */ zada f44845b;

    public RunnableC6337g(zada zadaVar, Result result) {
        this.f44845b = zadaVar;
        this.f44844a = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        K92 k92;
        K92 k922;
        WeakReference weakReference2;
        GoogleApiClient googleApiClient;
        ResultTransform resultTransform;
        K92 k923;
        K92 k924;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                resultTransform = this.f44845b.f44945a;
                PendingResult onSuccess = ((ResultTransform) Preconditions.checkNotNull(resultTransform)).onSuccess(this.f44844a);
                zada zadaVar = this.f44845b;
                k923 = zadaVar.f44952h;
                k924 = zadaVar.f44952h;
                k923.sendMessage(k924.obtainMessage(0, onSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.f44845b;
                zada.m48459m(this.f44844a);
                weakReference3 = this.f44845b.f44951g;
                googleApiClient = (GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.f44845b;
                k92 = zadaVar3.f44952h;
                k922 = zadaVar3.f44952h;
                k92.sendMessage(k922.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.f44845b;
                zada.m48459m(this.f44844a);
                weakReference2 = this.f44845b.f44951g;
                googleApiClient = (GoogleApiClient) weakReference2.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.f44845b);
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.f44845b;
            zada.m48459m(this.f44844a);
            weakReference = this.f44845b.f44951g;
            GoogleApiClient googleApiClient2 = (GoogleApiClient) weakReference.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.f44845b);
            }
            throw th2;
        }
    }
}