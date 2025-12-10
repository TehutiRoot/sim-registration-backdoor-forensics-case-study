package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public class PooledExecutorsProvider {

    /* renamed from: a */
    public static PooledExecutorFactory f45243a;

    /* loaded from: classes3.dex */
    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            try {
                if (f45243a == null) {
                    f45243a = new C6349a();
                }
                pooledExecutorFactory = f45243a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pooledExecutorFactory;
    }
}