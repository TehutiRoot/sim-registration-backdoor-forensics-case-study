package com.google.android.gms.internal.firebase_ml;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzqa<K, V> {

    /* renamed from: a */
    public final Map f45970a = new HashMap();

    public abstract V create(K k);

    public final V get(K k) {
        synchronized (this.f45970a) {
            try {
                if (this.f45970a.containsKey(k)) {
                    return (V) this.f45970a.get(k);
                }
                V create = create(k);
                this.f45970a.put(k, create);
                return create;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}