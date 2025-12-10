package th.p047co.dtac.android.dtacone.presenter.self_update;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.UpdateRtrAddressPresenter_Factory */
/* loaded from: classes8.dex */
public final class UpdateRtrAddressPresenter_Factory implements Factory<UpdateRtrAddressPresenter> {

    /* renamed from: a */
    public final Provider f86428a;

    /* renamed from: b */
    public final Provider f86429b;

    /* renamed from: c */
    public final Provider f86430c;

    /* renamed from: d */
    public final Provider f86431d;

    public UpdateRtrAddressPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        this.f86428a = provider;
        this.f86429b = provider2;
        this.f86430c = provider3;
        this.f86431d = provider4;
    }

    public static UpdateRtrAddressPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        return new UpdateRtrAddressPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static UpdateRtrAddressPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        return new UpdateRtrAddressPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public UpdateRtrAddressPresenter get() {
        return newInstance((RTRApiRx2) this.f86428a.get(), (Rx2ThreadService) this.f86429b.get(), (ServerErrorService) this.f86430c.get(), (RtrRepository) this.f86431d.get());
    }
}