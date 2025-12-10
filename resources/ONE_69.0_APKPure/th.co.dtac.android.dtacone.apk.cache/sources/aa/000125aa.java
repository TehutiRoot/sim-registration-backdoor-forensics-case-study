package th.p047co.dtac.android.dtacone.presenter.stv;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPresenterImpl_Factory */
/* loaded from: classes8.dex */
public final class StvPresenterImpl_Factory implements Factory<StvPresenterImpl> {

    /* renamed from: a */
    public final Provider f86653a;

    /* renamed from: b */
    public final Provider f86654b;

    /* renamed from: c */
    public final Provider f86655c;

    /* renamed from: d */
    public final Provider f86656d;

    public StvPresenterImpl_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        this.f86653a = provider;
        this.f86654b = provider2;
        this.f86655c = provider3;
        this.f86656d = provider4;
    }

    public static StvPresenterImpl_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        return new StvPresenterImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static StvPresenterImpl newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        return new StvPresenterImpl(rTRApi, rxThreadService, serverErrorService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public StvPresenterImpl get() {
        return newInstance((RTRApi) this.f86653a.get(), (RxThreadService) this.f86654b.get(), (ServerErrorService) this.f86655c.get(), (RtrRepository) this.f86656d.get());
    }
}