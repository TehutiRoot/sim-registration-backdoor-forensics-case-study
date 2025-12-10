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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel_Factory */
/* loaded from: classes9.dex */
public final class ConsentNonTelcoViewModel_Factory implements Factory<ConsentNonTelcoViewModel> {

    /* renamed from: a */
    public final Provider f105234a;

    /* renamed from: b */
    public final Provider f105235b;

    /* renamed from: c */
    public final Provider f105236c;

    public ConsentNonTelcoViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f105234a = provider;
        this.f105235b = provider2;
        this.f105236c = provider3;
    }

    public static ConsentNonTelcoViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ConsentNonTelcoViewModel_Factory(provider, provider2, provider3);
    }

    public static ConsentNonTelcoViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ConsentNonTelcoViewModel(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ConsentNonTelcoViewModel get() {
        return newInstance((RTRApiRx2) this.f105234a.get(), (Rx2ThreadService) this.f105235b.get(), (ServerErrorService) this.f105236c.get());
    }
}