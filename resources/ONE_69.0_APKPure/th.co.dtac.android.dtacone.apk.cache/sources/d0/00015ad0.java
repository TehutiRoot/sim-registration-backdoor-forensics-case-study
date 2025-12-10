package th.p047co.dtac.android.dtacone.viewmodel.self_update;

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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.self_update.SelfUpdateViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class SelfUpdateViewModelFactory_Factory implements Factory<SelfUpdateViewModelFactory> {

    /* renamed from: a */
    public final Provider f107054a;

    /* renamed from: b */
    public final Provider f107055b;

    /* renamed from: c */
    public final Provider f107056c;

    public SelfUpdateViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f107054a = provider;
        this.f107055b = provider2;
        this.f107056c = provider3;
    }

    public static SelfUpdateViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new SelfUpdateViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static SelfUpdateViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new SelfUpdateViewModelFactory(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public SelfUpdateViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f107054a.get(), (Rx2ThreadService) this.f107055b.get(), (ServerErrorService) this.f107056c.get());
    }
}