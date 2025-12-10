package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f61292c = new Object();

    /* renamed from: a */
    public volatile Provider f61293a;

    /* renamed from: b */
    public volatile Object f61294b = f61292c;

    public SingleCheck(Provider provider) {
        this.f61293a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        if (!(p instanceof SingleCheck) && !(p instanceof DoubleCheck)) {
            return new SingleCheck((Provider) Preconditions.checkNotNull(p));
        }
        return p;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f61294b;
        if (t == f61292c) {
            Provider provider = this.f61293a;
            if (provider == null) {
                return (T) this.f61294b;
            }
            T t2 = (T) provider.get();
            this.f61294b = t2;
            this.f61293a = null;
            return t2;
        }
        return t;
    }
}