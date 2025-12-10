package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneDeviceSaleRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneDeviceSaleRepositoryFactory implements Factory<OneDeviceSaleRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83295a;

    /* renamed from: b */
    public final Provider f83296b;

    /* renamed from: c */
    public final Provider f83297c;

    /* renamed from: d */
    public final Provider f83298d;

    /* renamed from: e */
    public final Provider f83299e;

    /* renamed from: f */
    public final Provider f83300f;

    public SingletonRepositoryModule_ProvideOneDeviceSaleRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneDeviceSaleApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        this.f83295a = singletonRepositoryModule;
        this.f83296b = provider;
        this.f83297c = provider2;
        this.f83298d = provider3;
        this.f83299e = provider4;
        this.f83300f = provider5;
    }

    public static SingletonRepositoryModule_ProvideOneDeviceSaleRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneDeviceSaleApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        return new SingletonRepositoryModule_ProvideOneDeviceSaleRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static OneDeviceSaleRepository provideOneDeviceSaleRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OneDeviceSaleApi oneDeviceSaleApi, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return (OneDeviceSaleRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneDeviceSaleRepository(rTRApiRx2, oneDeviceSaleApi, rtrRx2Repository, fileUtil, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleRepository get() {
        return provideOneDeviceSaleRepository(this.f83295a, (RTRApiRx2) this.f83296b.get(), (OneDeviceSaleApi) this.f83297c.get(), (RtrRx2Repository) this.f83298d.get(), (FileUtil) this.f83299e.get(), (ConfigurationRepository) this.f83300f.get());
    }
}
