package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes3.dex */
public final class C6335e extends UnregisterListenerMethod {

    /* renamed from: b */
    public final /* synthetic */ RegistrationMethods.Builder f44842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6335e(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.f44842b = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        RemoteCall remoteCall;
        remoteCall = this.f44842b.f44810b;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}