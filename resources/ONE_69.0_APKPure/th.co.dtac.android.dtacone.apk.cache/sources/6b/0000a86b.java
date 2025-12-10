package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.Executor;

@GwtIncompatible
/* loaded from: classes4.dex */
public final class RemovalListeners {
    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: tw1
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.m41117d(executor, removalListener, removalNotification);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ void m41117d(Executor executor, final RemovalListener removalListener, final RemovalNotification removalNotification) {
        executor.execute(new Runnable() { // from class: uw1
            @Override // java.lang.Runnable
            public final void run() {
                RemovalListener.this.onRemoval(removalNotification);
            }
        });
    }
}