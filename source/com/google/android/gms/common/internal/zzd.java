package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzd extends zzac {

    /* renamed from: a */
    public BaseGmsClient f45179a;

    /* renamed from: b */
    public final int f45180b;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f45179a = baseGmsClient;
        this.f45180b = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.checkNotNull(this.f45179a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f45179a.onPostInitHandler(i, iBinder, bundle, this.f45180b);
        this.f45179a = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int i, @Nullable Bundle bundle) {
        new Exception();
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzk zzkVar) {
        BaseGmsClient baseGmsClient = this.f45179a;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzkVar);
        BaseGmsClient.m48417i(baseGmsClient, zzkVar);
        onPostInitComplete(i, iBinder, zzkVar.f45185a);
    }
}
