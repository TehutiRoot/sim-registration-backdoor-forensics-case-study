package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes3.dex */
public final class C6355c implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ PendingResult f45132a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f45133b;

    /* renamed from: c */
    public final /* synthetic */ PendingResultUtil.ResultConverter f45134c;

    /* renamed from: d */
    public final /* synthetic */ zas f45135d;

    public C6355c(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.f45132a = pendingResult;
        this.f45133b = taskCompletionSource;
        this.f45134c = resultConverter;
        this.f45135d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.f45133b.setResult(this.f45134c.convert(this.f45132a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f45133b.setException(ApiExceptionUtil.fromStatus(status));
    }
}
