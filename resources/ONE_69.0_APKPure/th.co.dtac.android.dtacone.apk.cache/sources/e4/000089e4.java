package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f44116c = new Object();

    /* renamed from: a */
    public volatile Provider f44117a;

    /* renamed from: b */
    public volatile Object f44118b = f44116c;

    public DoubleCheck(Provider provider) {
        this.f44117a = provider;
    }

    /* renamed from: a */
    public static Object m49124a(Object obj, Object obj2) {
        if (obj != f44116c && obj != obj2) {
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
        T t = (T) this.f44118b;
        Object obj = f44116c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f44118b;
                    if (t == obj) {
                        t = (T) this.f44117a.get();
                        this.f44118b = m49124a(this.f44118b, t);
                        this.f44117a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}