package th.p047co.dtac.android.dtacone.presenter.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.profile.ConfirmProfilePicturePresenter_Factory */
/* loaded from: classes8.dex */
public final class ConfirmProfilePicturePresenter_Factory implements Factory<ConfirmProfilePicturePresenter> {

    /* renamed from: a */
    public final Provider f86262a;

    /* renamed from: b */
    public final Provider f86263b;

    /* renamed from: c */
    public final Provider f86264c;

    /* renamed from: d */
    public final Provider f86265d;

    /* renamed from: e */
    public final Provider f86266e;

    public ConfirmProfilePicturePresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<MultiPartService> provider3, Provider<PreferencesRepository> provider4, Provider<Rx2ThreadService> provider5) {
        this.f86262a = provider;
        this.f86263b = provider2;
        this.f86264c = provider3;
        this.f86265d = provider4;
        this.f86266e = provider5;
    }

    public static ConfirmProfilePicturePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<MultiPartService> provider3, Provider<PreferencesRepository> provider4, Provider<Rx2ThreadService> provider5) {
        return new ConfirmProfilePicturePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ConfirmProfilePicturePresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, MultiPartService multiPartService, PreferencesRepository preferencesRepository, Rx2ThreadService rx2ThreadService) {
        return new ConfirmProfilePicturePresenter(rTRApiRx2, serverErrorService, multiPartService, preferencesRepository, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public ConfirmProfilePicturePresenter get() {
        return newInstance((RTRApiRx2) this.f86262a.get(), (ServerErrorService) this.f86263b.get(), (MultiPartService) this.f86264c.get(), (PreferencesRepository) this.f86265d.get(), (Rx2ThreadService) this.f86266e.get());
    }
}