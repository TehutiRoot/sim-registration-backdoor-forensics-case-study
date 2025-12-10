package com.google.android.gms.common.api.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zab extends ActivityLifecycleObserver {

    /* renamed from: a */
    public final WeakReference f44865a;

    public zab(V72 v72) {
        this.f44865a = new WeakReference(v72);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @CanIgnoreReturnValue
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        V72 v72 = (V72) this.f44865a.get();
        if (v72 != null) {
            v72.m65906c(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
