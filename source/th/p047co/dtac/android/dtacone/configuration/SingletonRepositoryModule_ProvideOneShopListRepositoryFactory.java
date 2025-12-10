package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneShopListRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneShopListRepositoryFactory implements Factory<OneShopListRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83378a;

    /* renamed from: b */
    public final Provider f83379b;

    public SingletonRepositoryModule_ProvideOneShopListRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83378a = singletonRepositoryModule;
        this.f83379b = provider;
    }

    public static SingletonRepositoryModule_ProvideOneShopListRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new SingletonRepositoryModule_ProvideOneShopListRepositoryFactory(singletonRepositoryModule, provider);
    }

    public static OneShopListRepository provideOneShopListRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneShopListRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneShopListRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneShopListRepository get() {
        return provideOneShopListRepository(this.f83378a, (RTRApiRx2) this.f83379b.get());
    }
}
