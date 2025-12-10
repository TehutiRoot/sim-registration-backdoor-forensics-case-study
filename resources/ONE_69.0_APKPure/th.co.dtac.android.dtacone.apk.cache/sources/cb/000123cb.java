package th.p047co.dtac.android.dtacone.presenter.inactive_user;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.OwnerDetailPresenter_Factory */
/* loaded from: classes8.dex */
public final class OwnerDetailPresenter_Factory implements Factory<OwnerDetailPresenter> {

    /* renamed from: a */
    public final Provider f85892a;

    /* renamed from: b */
    public final Provider f85893b;

    /* renamed from: c */
    public final Provider f85894c;

    /* renamed from: d */
    public final Provider f85895d;

    /* renamed from: e */
    public final Provider f85896e;

    /* renamed from: f */
    public final Provider f85897f;

    public OwnerDetailPresenter_Factory(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<OneErrorService> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6) {
        this.f85892a = provider;
        this.f85893b = provider2;
        this.f85894c = provider3;
        this.f85895d = provider4;
        this.f85896e = provider5;
        this.f85897f = provider6;
    }

    public static OwnerDetailPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<ServerErrorService> provider2, Provider<OneErrorService> provider3, Provider<Rx2ThreadService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6) {
        return new OwnerDetailPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OwnerDetailPresenter newInstance(RTRApiRx2 rTRApiRx2, ServerErrorService serverErrorService, OneErrorService oneErrorService, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, RtrRx2Repository rtrRx2Repository) {
        return new OwnerDetailPresenter(rTRApiRx2, serverErrorService, oneErrorService, rx2ThreadService, configurationRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OwnerDetailPresenter get() {
        return newInstance((RTRApiRx2) this.f85892a.get(), (ServerErrorService) this.f85893b.get(), (OneErrorService) this.f85894c.get(), (Rx2ThreadService) this.f85895d.get(), (ConfigurationRepository) this.f85896e.get(), (RtrRx2Repository) this.f85897f.get());
    }
}