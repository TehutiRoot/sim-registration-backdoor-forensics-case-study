package th.p047co.dtac.android.dtacone.repository.device_sale;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository_Factory */
/* loaded from: classes8.dex */
public final class DeviceSaleRepository_Factory implements Factory<DeviceSaleRepository> {

    /* renamed from: a */
    public final Provider f86842a;

    /* renamed from: b */
    public final Provider f86843b;

    /* renamed from: c */
    public final Provider f86844c;

    /* renamed from: d */
    public final Provider f86845d;

    public DeviceSaleRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        this.f86842a = provider;
        this.f86843b = provider2;
        this.f86844c = provider3;
        this.f86845d = provider4;
    }

    public static DeviceSaleRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        return new DeviceSaleRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static DeviceSaleRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return new DeviceSaleRepository(rTRApiRx2, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Override // javax.inject.Provider
    public DeviceSaleRepository get() {
        return newInstance((RTRApiRx2) this.f86842a.get(), (RtrRx2Repository) this.f86843b.get(), (FileUtil) this.f86844c.get(), (ConfigurationRepository) this.f86845d.get());
    }
}