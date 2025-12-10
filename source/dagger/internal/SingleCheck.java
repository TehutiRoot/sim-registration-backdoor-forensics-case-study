package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f61212c = new Object();

    /* renamed from: a */
    public volatile Provider f61213a;

    /* renamed from: b */
    public volatile Object f61214b = f61212c;

    public SingleCheck(Provider provider) {
        this.f61213a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        if (!(p instanceof SingleCheck) && !(p instanceof DoubleCheck)) {
            return new SingleCheck((Provider) Preconditions.checkNotNull(p));
        }
        return p;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f61214b;
        if (t == f61212c) {
            Provider provider = this.f61213a;
            if (provider == null) {
                return (T) this.f61214b;
            }
            T t2 = (T) provider.get();
            this.f61214b = t2;
            this.f61213a = null;
            return t2;
        }
        return t;
    }
}
