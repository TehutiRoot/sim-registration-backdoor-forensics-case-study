package th.p047co.dtac.android.dtacone.presenter.topup;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.topup.TopUpPresenterImpl_Factory */
/* loaded from: classes8.dex */
public final class TopUpPresenterImpl_Factory implements Factory<TopUpPresenterImpl> {

    /* renamed from: a */
    public final Provider f86681a;

    /* renamed from: b */
    public final Provider f86682b;

    /* renamed from: c */
    public final Provider f86683c;

    /* renamed from: d */
    public final Provider f86684d;

    /* renamed from: e */
    public final Provider f86685e;

    /* renamed from: f */
    public final Provider f86686f;

    public TopUpPresenterImpl_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<TemporaryCache> provider5, Provider<ConfigurationRepository> provider6) {
        this.f86681a = provider;
        this.f86682b = provider2;
        this.f86683c = provider3;
        this.f86684d = provider4;
        this.f86685e = provider5;
        this.f86686f = provider6;
    }

    public static TopUpPresenterImpl_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<TemporaryCache> provider5, Provider<ConfigurationRepository> provider6) {
        return new TopUpPresenterImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static TopUpPresenterImpl newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, TemporaryCache temporaryCache, ConfigurationRepository configurationRepository) {
        return new TopUpPresenterImpl(rTRApi, rxThreadService, serverErrorService, rtrRepository, temporaryCache, configurationRepository);
    }

    @Override // javax.inject.Provider
    public TopUpPresenterImpl get() {
        return newInstance((RTRApi) this.f86681a.get(), (RxThreadService) this.f86682b.get(), (ServerErrorService) this.f86683c.get(), (RtrRepository) this.f86684d.get(), (TemporaryCache) this.f86685e.get(), (ConfigurationRepository) this.f86686f.get());
    }
}