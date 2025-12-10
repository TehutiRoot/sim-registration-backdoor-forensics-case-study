package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f61278c = new Object();

    /* renamed from: a */
    public volatile Provider f61279a;

    /* renamed from: b */
    public volatile Object f61280b = f61278c;

    public DoubleCheck(Provider provider) {
        this.f61279a = provider;
    }

    /* renamed from: a */
    private static Object m31804a(Object obj, Object obj2) {
        if (obj != f61278c && obj != obj2) {
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
        T t = (T) this.f61280b;
        Object obj = f61278c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f61280b;
                    if (t == obj) {
                        t = (T) this.f61279a.get();
                        this.f61280b = m31804a(this.f61280b, t);
                        this.f61279a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}