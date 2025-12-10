package dagger.internal;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* renamed from: a */
    public Provider f61277a;

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        Preconditions.checkNotNull(provider2);
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.f61277a == null) {
            delegateFactory.f61277a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Provider m31805a() {
        return (Provider) Preconditions.checkNotNull(this.f61277a);
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider provider = this.f61277a;
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