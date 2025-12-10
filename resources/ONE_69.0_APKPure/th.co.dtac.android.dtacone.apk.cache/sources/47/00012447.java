package th.p047co.dtac.android.dtacone.presenter.postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.postpaid_registration.PostpaidConfigPresenter_Factory */
/* loaded from: classes8.dex */
public final class PostpaidConfigPresenter_Factory implements Factory<PostpaidConfigPresenter> {

    /* renamed from: a */
    public final Provider f86127a;

    /* renamed from: b */
    public final Provider f86128b;

    /* renamed from: c */
    public final Provider f86129c;

    /* renamed from: d */
    public final Provider f86130d;

    public PostpaidConfigPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4) {
        this.f86127a = provider;
        this.f86128b = provider2;
        this.f86129c = provider3;
        this.f86130d = provider4;
    }

    public static PostpaidConfigPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4) {
        return new PostpaidConfigPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static PostpaidConfigPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, PreferencesRepository preferencesRepository) {
        return new PostpaidConfigPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public PostpaidConfigPresenter get() {
        return newInstance((RTRApiRx2) this.f86127a.get(), (Rx2ThreadService) this.f86128b.get(), (ServerErrorService) this.f86129c.get(), (PreferencesRepository) this.f86130d.get());
    }
}