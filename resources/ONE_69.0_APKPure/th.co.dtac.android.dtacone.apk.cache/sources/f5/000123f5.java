package th.p047co.dtac.android.dtacone.presenter.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.login.NewVerifyOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class NewVerifyOtpPresenter_Factory implements Factory<NewVerifyOtpPresenter> {

    /* renamed from: a */
    public final Provider f85970a;

    /* renamed from: b */
    public final Provider f85971b;

    /* renamed from: c */
    public final Provider f85972c;

    /* renamed from: d */
    public final Provider f85973d;

    public NewVerifyOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f85970a = provider;
        this.f85971b = provider2;
        this.f85972c = provider3;
        this.f85973d = provider4;
    }

    public static NewVerifyOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new NewVerifyOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static NewVerifyOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new NewVerifyOtpPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public NewVerifyOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85970a.get(), (Rx2ThreadService) this.f85971b.get(), (ServerErrorService) this.f85972c.get(), (TemporaryCache) this.f85973d.get());
    }
}