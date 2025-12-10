package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* loaded from: classes3.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: a */
    public final String f45336a;

    /* renamed from: b */
    public final ThreadFactory f45337b = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.f45336a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f45337b.newThread(new RunnableC21091ma2(runnable, 0));
        newThread.setName(this.f45336a);
        return newThread;
    }
}
