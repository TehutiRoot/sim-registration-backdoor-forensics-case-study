package th.p047co.dtac.android.dtacone.presenter.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter_Factory */
/* loaded from: classes8.dex */
public final class ProfilePicturePresenter_Factory implements Factory<ProfilePicturePresenter> {

    /* renamed from: a */
    public final Provider f86272a;

    /* renamed from: b */
    public final Provider f86273b;

    /* renamed from: c */
    public final Provider f86274c;

    public ProfilePicturePresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        this.f86272a = provider;
        this.f86273b = provider2;
        this.f86274c = provider3;
    }

    public static ProfilePicturePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3) {
        return new ProfilePicturePresenter_Factory(provider, provider2, provider3);
    }

    public static ProfilePicturePresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, Rx2ThreadService rx2ThreadService) {
        return new ProfilePicturePresenter(rTRApiRx2, serverErrorService, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public ProfilePicturePresenter get() {
        return newInstance((RTRApiRx2) this.f86272a.get(), (ServerErrorService) this.f86273b.get(), (Rx2ThreadService) this.f86274c.get());
    }
}