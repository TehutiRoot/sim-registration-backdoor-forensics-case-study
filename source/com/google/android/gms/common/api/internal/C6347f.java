package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes3.dex */
public final class C6347f extends TaskApiCall {

    /* renamed from: d */
    public final /* synthetic */ TaskApiCall.Builder f44831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6347f(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f44831d = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        RemoteCall remoteCall;
        remoteCall = this.f44831d.f44808a;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
