package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes3.dex */
public final class C6334d extends RegisterListenerMethod {

    /* renamed from: e */
    public final /* synthetic */ RegistrationMethods.Builder f44841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6334d(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.f44841e = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        RemoteCall remoteCall;
        remoteCall = this.f44841e.f44809a;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}