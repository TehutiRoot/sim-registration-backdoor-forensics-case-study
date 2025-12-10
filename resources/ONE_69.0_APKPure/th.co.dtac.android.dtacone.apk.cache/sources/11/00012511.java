package th.p047co.dtac.android.dtacone.presenter.self_update;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.SelfUpdateConsentPresenter_Factory */
/* loaded from: classes8.dex */
public final class SelfUpdateConsentPresenter_Factory implements Factory<SelfUpdateConsentPresenter> {

    /* renamed from: a */
    public final Provider f86418a;

    /* renamed from: b */
    public final Provider f86419b;

    /* renamed from: c */
    public final Provider f86420c;

    /* renamed from: d */
    public final Provider f86421d;

    public SelfUpdateConsentPresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3, Provider<TemporaryCache> provider4) {
        this.f86418a = provider;
        this.f86419b = provider2;
        this.f86420c = provider3;
        this.f86421d = provider4;
    }

    public static SelfUpdateConsentPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<Rx2ThreadService> provider3, Provider<TemporaryCache> provider4) {
        return new SelfUpdateConsentPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static SelfUpdateConsentPresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, Rx2ThreadService rx2ThreadService, TemporaryCache temporaryCache) {
        return new SelfUpdateConsentPresenter(rTRApiRx2, serverErrorService, rx2ThreadService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public SelfUpdateConsentPresenter get() {
        return newInstance((RTRApiRx2) this.f86418a.get(), (ServerErrorService) this.f86419b.get(), (Rx2ThreadService) this.f86420c.get(), (TemporaryCache) this.f86421d.get());
    }
}