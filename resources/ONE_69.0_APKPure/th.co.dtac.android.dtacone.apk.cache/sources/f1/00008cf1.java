package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes3.dex */
public class HandlerExecutor implements Executor {

    /* renamed from: a */
    public final Handler f45347a;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.f45347a = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f45347a.post(runnable);
    }
}