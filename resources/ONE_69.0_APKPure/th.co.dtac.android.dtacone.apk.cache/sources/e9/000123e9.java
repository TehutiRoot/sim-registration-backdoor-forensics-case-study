package th.p047co.dtac.android.dtacone.presenter.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.login.NewRequestOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class NewRequestOtpPresenter_Factory implements Factory<NewRequestOtpPresenter> {

    /* renamed from: a */
    public final Provider f85959a;

    /* renamed from: b */
    public final Provider f85960b;

    /* renamed from: c */
    public final Provider f85961c;

    /* renamed from: d */
    public final Provider f85962d;

    public NewRequestOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f85959a = provider;
        this.f85960b = provider2;
        this.f85961c = provider3;
        this.f85962d = provider4;
    }

    public static NewRequestOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new NewRequestOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static NewRequestOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, TemporaryCache temporaryCache) {
        return new NewRequestOtpPresenter(rTRApiRx2, rx2ThreadService, oneErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public NewRequestOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85959a.get(), (Rx2ThreadService) this.f85960b.get(), (OneErrorService) this.f85961c.get(), (TemporaryCache) this.f85962d.get());
    }
}