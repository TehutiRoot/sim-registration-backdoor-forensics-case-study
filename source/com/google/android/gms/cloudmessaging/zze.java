package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class zze implements Executor {
    public static final /* synthetic */ zze zza = new zze();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
