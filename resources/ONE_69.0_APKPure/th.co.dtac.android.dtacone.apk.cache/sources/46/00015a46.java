package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.GetAuthorizationByRTRViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class GetAuthorizationByRTRViewModelFactory_Factory implements Factory<GetAuthorizationByRTRViewModelFactory> {

    /* renamed from: a */
    public final Provider f106834a;

    /* renamed from: b */
    public final Provider f106835b;

    public GetAuthorizationByRTRViewModelFactory_Factory(Provider<MrtrPrepaidReregistRepository> provider, Provider<Rx2ThreadService> provider2) {
        this.f106834a = provider;
        this.f106835b = provider2;
    }

    public static GetAuthorizationByRTRViewModelFactory_Factory create(Provider<MrtrPrepaidReregistRepository> provider, Provider<Rx2ThreadService> provider2) {
        return new GetAuthorizationByRTRViewModelFactory_Factory(provider, provider2);
    }

    public static GetAuthorizationByRTRViewModelFactory newInstance(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository, Rx2ThreadService rx2ThreadService) {
        return new GetAuthorizationByRTRViewModelFactory(mrtrPrepaidReregistRepository, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public GetAuthorizationByRTRViewModelFactory get() {
        return newInstance((MrtrPrepaidReregistRepository) this.f106834a.get(), (Rx2ThreadService) this.f106835b.get());
    }
}