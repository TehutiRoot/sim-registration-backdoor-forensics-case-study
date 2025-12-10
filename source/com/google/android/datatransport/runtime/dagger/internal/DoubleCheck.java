package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f44104c = new Object();

    /* renamed from: a */
    public volatile Provider f44105a;

    /* renamed from: b */
    public volatile Object f44106b = f44104c;

    public DoubleCheck(Provider provider) {
        this.f44105a = provider;
    }

    /* renamed from: a */
    public static Object m49127a(Object obj, Object obj2) {
        if (obj != f44104c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((Provider) Preconditions.checkNotNull(p));
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        Preconditions.checkNotNull(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f44106b;
        Object obj = f44104c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f44106b;
                    if (t == obj) {
                        t = (T) this.f44105a.get();
                        this.f44106b = m49127a(this.f44106b, t);
                        this.f44105a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
