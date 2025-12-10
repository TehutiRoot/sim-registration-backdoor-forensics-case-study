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
    public final String f45350a;

    /* renamed from: b */
    public final AtomicInteger f45351b = new AtomicInteger();

    /* renamed from: c */
    public final ThreadFactory f45352c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.f45350a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f45352c.newThread(new RunnableC20634jb2(runnable, 0));
        int andIncrement = this.f45351b.getAndIncrement();
        newThread.setName(this.f45350a + "[" + andIncrement + "]");
        return newThread;
    }
}