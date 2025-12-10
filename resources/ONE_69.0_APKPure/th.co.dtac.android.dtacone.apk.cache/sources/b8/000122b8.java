package th.p047co.dtac.android.dtacone.presenter.change_pro_happy;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeProHappyPresenter_Factory implements Factory<ChangeProHappyPresenter> {

    /* renamed from: a */
    public final Provider f85627a;

    /* renamed from: b */
    public final Provider f85628b;

    /* renamed from: c */
    public final Provider f85629c;

    /* renamed from: d */
    public final Provider f85630d;

    public ChangeProHappyPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        this.f85627a = provider;
        this.f85628b = provider2;
        this.f85629c = provider3;
        this.f85630d = provider4;
    }

    public static ChangeProHappyPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        return new ChangeProHappyPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static ChangeProHappyPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, OneErrorService oneErrorService) {
        return new ChangeProHappyPresenter(rTRApiRx2, rx2ThreadService, configurationRepository, oneErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeProHappyPresenter get() {
        return newInstance((RTRApiRx2) this.f85627a.get(), (Rx2ThreadService) this.f85628b.get(), (ConfigurationRepository) this.f85629c.get(), (OneErrorService) this.f85630d.get());
    }
}