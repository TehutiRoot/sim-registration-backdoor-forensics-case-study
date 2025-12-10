package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    /* renamed from: of */
    public static final ActivityLifecycleObserver m48609of(@NonNull Activity activity) {
        return new zab(S82.m66536a(activity));
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);
}