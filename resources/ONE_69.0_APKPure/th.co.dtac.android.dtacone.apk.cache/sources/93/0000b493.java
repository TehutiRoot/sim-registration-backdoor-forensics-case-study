package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes4.dex */
public abstract class LazyInstanceMap<K, V> {

    /* renamed from: a */
    public final Map f56925a = new HashMap();

    @NonNull
    @KeepForSdk
    public abstract V create(@NonNull K k);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k) {
        synchronized (this.f56925a) {
            try {
                if (this.f56925a.containsKey(k)) {
                    return (V) this.f56925a.get(k);
                }
                V create = create(k);
                this.f56925a.put(k, create);
                return create;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}