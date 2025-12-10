package th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleRepository_Factory implements Factory<OneDeviceSaleRepository> {

    /* renamed from: a */
    public final Provider f90538a;

    /* renamed from: b */
    public final Provider f90539b;

    /* renamed from: c */
    public final Provider f90540c;

    /* renamed from: d */
    public final Provider f90541d;

    /* renamed from: e */
    public final Provider f90542e;

    public OneDeviceSaleRepository_Factory(Provider<RTRApiRx2> provider, Provider<OneDeviceSaleApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        this.f90538a = provider;
        this.f90539b = provider2;
        this.f90540c = provider3;
        this.f90541d = provider4;
        this.f90542e = provider5;
    }

    public static OneDeviceSaleRepository_Factory create(Provider<RTRApiRx2> provider, Provider<OneDeviceSaleApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneDeviceSaleRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneDeviceSaleRepository newInstance(RTRApiRx2 rTRApiRx2, OneDeviceSaleApi oneDeviceSaleApi, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return new OneDeviceSaleRepository(rTRApiRx2, oneDeviceSaleApi, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleRepository get() {
        return newInstance((RTRApiRx2) this.f90538a.get(), (OneDeviceSaleApi) this.f90539b.get(), (RtrRx2Repository) this.f90540c.get(), (FileUtil) this.f90541d.get(), (ConfigurationRepository) this.f90542e.get());
    }
}