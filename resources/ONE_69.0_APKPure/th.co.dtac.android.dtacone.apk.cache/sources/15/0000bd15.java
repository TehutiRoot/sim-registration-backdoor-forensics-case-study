package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ne */
/* loaded from: classes5.dex */
public abstract class AbstractC9605ne<T> {
    private static final Object ThreeDS2ServiceInstance = new Object();
    private volatile T ThreeDS2Service = (T) ThreeDS2ServiceInstance;

    public abstract T ThreeDS2Service();

    public T ThreeDS2ServiceInstance() {
        T t = this.ThreeDS2Service;
        Object obj = ThreeDS2ServiceInstance;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.ThreeDS2Service;
                    if (t == obj) {
                        t = ThreeDS2Service();
                        this.ThreeDS2Service = t;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t;
    }
}