package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    public static final Object f61198c = new Object();

    /* renamed from: a */
    public volatile Provider f61199a;

    /* renamed from: b */
    public volatile Object f61200b = f61198c;

    public DoubleCheck(Provider provider) {
        this.f61199a = provider;
    }

    /* renamed from: a */
    private static Object m31853a(Object obj, Object obj2) {
        if (obj != f61198c && obj != obj2) {
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
        T t = (T) this.f61200b;
        Object obj = f61198c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f61200b;
                    if (t == obj) {
                        t = (T) this.f61199a.get();
                        this.f61200b = m31853a(this.f61200b, t);
                        this.f61199a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
