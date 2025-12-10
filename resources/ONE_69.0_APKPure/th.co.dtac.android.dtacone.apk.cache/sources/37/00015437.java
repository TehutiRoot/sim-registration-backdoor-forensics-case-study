package th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco;

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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ConsentNonTelcoViewModelFactory_Factory implements Factory<ConsentNonTelcoViewModelFactory> {

    /* renamed from: a */
    public final Provider f105231a;

    /* renamed from: b */
    public final Provider f105232b;

    /* renamed from: c */
    public final Provider f105233c;

    public ConsentNonTelcoViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f105231a = provider;
        this.f105232b = provider2;
        this.f105233c = provider3;
    }

    public static ConsentNonTelcoViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ConsentNonTelcoViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static ConsentNonTelcoViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ConsentNonTelcoViewModelFactory(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ConsentNonTelcoViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f105231a.get(), (Rx2ThreadService) this.f105232b.get(), (ServerErrorService) this.f105233c.get());
    }
}