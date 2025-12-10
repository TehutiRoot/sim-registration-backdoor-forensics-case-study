package th.p047co.dtac.android.dtacone.presenter.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.login.IntroductionPresenter_Factory */
/* loaded from: classes8.dex */
public final class IntroductionPresenter_Factory implements Factory<IntroductionPresenter> {

    /* renamed from: a */
    public final Provider f85914a;

    /* renamed from: b */
    public final Provider f85915b;

    /* renamed from: c */
    public final Provider f85916c;

    /* renamed from: d */
    public final Provider f85917d;

    /* renamed from: e */
    public final Provider f85918e;

    public IntroductionPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesRepository> provider3, Provider<RtrRepository> provider4, Provider<ServerErrorService> provider5) {
        this.f85914a = provider;
        this.f85915b = provider2;
        this.f85916c = provider3;
        this.f85917d = provider4;
        this.f85918e = provider5;
    }

    public static IntroductionPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesRepository> provider3, Provider<RtrRepository> provider4, Provider<ServerErrorService> provider5) {
        return new IntroductionPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static IntroductionPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, PreferencesRepository preferencesRepository, RtrRepository rtrRepository, ServerErrorService serverErrorService) {
        return new IntroductionPresenter(rTRApiRx2, rx2ThreadService, preferencesRepository, rtrRepository, serverErrorService);
    }

    @Override // javax.inject.Provider
    public IntroductionPresenter get() {
        return newInstance((RTRApiRx2) this.f85914a.get(), (Rx2ThreadService) this.f85915b.get(), (PreferencesRepository) this.f85916c.get(), (RtrRepository) this.f85917d.get(), (ServerErrorService) this.f85918e.get());
    }
}