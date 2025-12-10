package th.p047co.dtac.android.dtacone.presenter.topup;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.topup.ShowBalancePresenter_Factory */
/* loaded from: classes8.dex */
public final class ShowBalancePresenter_Factory implements Factory<ShowBalancePresenter> {

    /* renamed from: a */
    public final Provider f86668a;

    /* renamed from: b */
    public final Provider f86669b;

    /* renamed from: c */
    public final Provider f86670c;

    /* renamed from: d */
    public final Provider f86671d;

    /* renamed from: e */
    public final Provider f86672e;

    public ShowBalancePresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        this.f86668a = provider;
        this.f86669b = provider2;
        this.f86670c = provider3;
        this.f86671d = provider4;
        this.f86672e = provider5;
    }

    public static ShowBalancePresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        return new ShowBalancePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ShowBalancePresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, ConfigurationRepository configurationRepository) {
        return new ShowBalancePresenter(rTRApi, rx2ThreadService, serverErrorService, rtrRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public ShowBalancePresenter get() {
        return newInstance((RTRApi) this.f86668a.get(), (Rx2ThreadService) this.f86669b.get(), (ServerErrorService) this.f86670c.get(), (RtrRepository) this.f86671d.get(), (ConfigurationRepository) this.f86672e.get());
    }
}