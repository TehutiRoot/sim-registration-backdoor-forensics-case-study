package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideDeviceSaleRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideDeviceSaleRepositoryFactory implements Factory<DeviceSaleRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83227a;

    /* renamed from: b */
    public final Provider f83228b;

    /* renamed from: c */
    public final Provider f83229c;

    /* renamed from: d */
    public final Provider f83230d;

    /* renamed from: e */
    public final Provider f83231e;

    public SingletonRepositoryModule_ProvideDeviceSaleRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        this.f83227a = singletonRepositoryModule;
        this.f83228b = provider;
        this.f83229c = provider2;
        this.f83230d = provider3;
        this.f83231e = provider4;
    }

    public static SingletonRepositoryModule_ProvideDeviceSaleRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        return new SingletonRepositoryModule_ProvideDeviceSaleRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4);
    }

    public static DeviceSaleRepository provideDeviceSaleRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return (DeviceSaleRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideDeviceSaleRepository(rTRApiRx2, rtrRx2Repository, fileUtil, configurationRepository));
    }

    @Override // javax.inject.Provider
    public DeviceSaleRepository get() {
        return provideDeviceSaleRepository(this.f83227a, (RTRApiRx2) this.f83228b.get(), (RtrRx2Repository) this.f83229c.get(), (FileUtil) this.f83230d.get(), (ConfigurationRepository) this.f83231e.get());
    }
}
