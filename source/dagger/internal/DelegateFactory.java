package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a */
    public Provider f61197a;

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        Preconditions.checkNotNull(provider2);
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.f61197a == null) {
            delegateFactory.f61197a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Provider m31854a() {
        return (Provider) Preconditions.checkNotNull(this.f61197a);
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider provider = this.f61197a;
        if (provider != null) {
            return (T) provider.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public void setDelegatedProvider(Provider<T> provider) {
        setDelegate(this, provider);
    }
}
