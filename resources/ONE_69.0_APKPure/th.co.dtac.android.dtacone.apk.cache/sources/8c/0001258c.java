package th.p047co.dtac.android.dtacone.presenter.stv;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvConfirmPresenterImpl_Factory */
/* loaded from: classes8.dex */
public final class StvConfirmPresenterImpl_Factory implements Factory<StvConfirmPresenterImpl> {

    /* renamed from: a */
    public final Provider f86622a;

    /* renamed from: b */
    public final Provider f86623b;

    /* renamed from: c */
    public final Provider f86624c;

    /* renamed from: d */
    public final Provider f86625d;

    /* renamed from: e */
    public final Provider f86626e;

    /* renamed from: f */
    public final Provider f86627f;

    public StvConfirmPresenterImpl_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<TemporaryCache> provider5, Provider<ConfigurationRepository> provider6) {
        this.f86622a = provider;
        this.f86623b = provider2;
        this.f86624c = provider3;
        this.f86625d = provider4;
        this.f86626e = provider5;
        this.f86627f = provider6;
    }

    public static StvConfirmPresenterImpl_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<TemporaryCache> provider5, Provider<ConfigurationRepository> provider6) {
        return new StvConfirmPresenterImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static StvConfirmPresenterImpl newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, TemporaryCache temporaryCache, ConfigurationRepository configurationRepository) {
        return new StvConfirmPresenterImpl(rTRApi, rxThreadService, serverErrorService, rtrRepository, temporaryCache, configurationRepository);
    }

    @Override // javax.inject.Provider
    public StvConfirmPresenterImpl get() {
        return newInstance((RTRApi) this.f86622a.get(), (RxThreadService) this.f86623b.get(), (ServerErrorService) this.f86624c.get(), (RtrRepository) this.f86625d.get(), (TemporaryCache) this.f86626e.get(), (ConfigurationRepository) this.f86627f.get());
    }
}