package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes4.dex */
public class ExecutorSelector {

    /* renamed from: a */
    public final Provider f56912a;

    public ExecutorSelector(@NonNull Provider provider) {
        this.f56912a = provider;
    }

    @NonNull
    @KeepForSdk
    public Executor getExecutorToUse(@Nullable Executor executor) {
        if (executor != null) {
            return executor;
        }
        return (Executor) this.f56912a.get();
    }
}
