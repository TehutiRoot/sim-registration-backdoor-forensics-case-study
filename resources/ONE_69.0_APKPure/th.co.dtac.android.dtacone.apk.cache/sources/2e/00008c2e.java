package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes3.dex */
public final class C6344c implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ PendingResult f45144a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f45145b;

    /* renamed from: c */
    public final /* synthetic */ PendingResultUtil.ResultConverter f45146c;

    /* renamed from: d */
    public final /* synthetic */ zas f45147d;

    public C6344c(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.f45144a = pendingResult;
        this.f45145b = taskCompletionSource;
        this.f45146c = resultConverter;
        this.f45147d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.f45145b.setResult(this.f45146c.convert(this.f45144a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f45145b.setException(ApiExceptionUtil.fromStatus(status));
    }
}