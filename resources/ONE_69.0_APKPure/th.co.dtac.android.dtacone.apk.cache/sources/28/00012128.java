package th.p047co.dtac.android.dtacone.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.ConsentPresenter_Factory */
/* loaded from: classes8.dex */
public final class ConsentPresenter_Factory implements Factory<ConsentPresenter> {

    /* renamed from: a */
    public final Provider f85198a;

    /* renamed from: b */
    public final Provider f85199b;

    /* renamed from: c */
    public final Provider f85200c;

    /* renamed from: d */
    public final Provider f85201d;

    public ConsentPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4) {
        this.f85198a = provider;
        this.f85199b = provider2;
        this.f85200c = provider3;
        this.f85201d = provider4;
    }

    public static ConsentPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4) {
        return new ConsentPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static ConsentPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, PreferencesRepository preferencesRepository) {
        return new ConsentPresenter(rTRApi, rxThreadService, serverErrorService, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public ConsentPresenter get() {
        return newInstance((RTRApi) this.f85198a.get(), (RxThreadService) this.f85199b.get(), (ServerErrorService) this.f85200c.get(), (PreferencesRepository) this.f85201d.get());
    }
}