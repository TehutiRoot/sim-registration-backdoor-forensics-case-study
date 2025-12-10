package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public class PooledExecutorsProvider {

    /* renamed from: a */
    public static PooledExecutorFactory f45231a;

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
                if (f45231a == null) {
                    f45231a = new C6360a();
                }
                pooledExecutorFactory = f45231a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pooledExecutorFactory;
    }
}
