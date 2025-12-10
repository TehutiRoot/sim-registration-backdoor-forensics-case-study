package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes3.dex */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: a */
    public final String f45338a;

    /* renamed from: b */
    public final AtomicInteger f45339b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f45340c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.f45338a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f45340c.newThread(new RunnableC21091ma2(runnable, 0));
        int andIncrement = this.f45339b.getAndIncrement();
        newThread.setName(this.f45338a + "[" + andIncrement + "]");
        return newThread;
    }
}
