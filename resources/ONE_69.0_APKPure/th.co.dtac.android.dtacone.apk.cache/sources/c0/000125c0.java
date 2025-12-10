package th.p047co.dtac.android.dtacone.presenter.topup;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.topup.TopUpPriceListPresenter_Factory */
/* loaded from: classes8.dex */
public final class TopUpPriceListPresenter_Factory implements Factory<TopUpPriceListPresenter> {

    /* renamed from: a */
    public final Provider f86696a;

    /* renamed from: b */
    public final Provider f86697b;

    /* renamed from: c */
    public final Provider f86698c;

    /* renamed from: d */
    public final Provider f86699d;

    /* renamed from: e */
    public final Provider f86700e;

    public TopUpPriceListPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        this.f86696a = provider;
        this.f86697b = provider2;
        this.f86698c = provider3;
        this.f86699d = provider4;
        this.f86700e = provider5;
    }

    public static TopUpPriceListPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        return new TopUpPriceListPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static TopUpPriceListPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, ConfigurationRepository configurationRepository) {
        return new TopUpPriceListPresenter(rTRApi, rxThreadService, serverErrorService, rtrRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public TopUpPriceListPresenter get() {
        return newInstance((RTRApi) this.f86696a.get(), (RxThreadService) this.f86697b.get(), (ServerErrorService) this.f86698c.get(), (RtrRepository) this.f86699d.get(), (ConfigurationRepository) this.f86700e.get());
    }
}