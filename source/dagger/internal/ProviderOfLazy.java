package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ProviderOfLazy<T> implements Provider<Lazy<T>> {

    /* renamed from: a */
    public final Provider f61205a;

    public ProviderOfLazy(Provider provider) {
        this.f61205a = provider;
    }

    public static <T> Provider<Lazy<T>> create(Provider<T> provider) {
        return new ProviderOfLazy((Provider) Preconditions.checkNotNull(provider));
    }

    @Override // javax.inject.Provider
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.f61205a);
    }
}
