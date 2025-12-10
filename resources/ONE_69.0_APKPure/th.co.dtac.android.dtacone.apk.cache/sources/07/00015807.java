package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.RetailerViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class RetailerViewModelFactory_Factory implements Factory<RetailerViewModelFactory> {

    /* renamed from: a */
    public final Provider f106207a;

    /* renamed from: b */
    public final Provider f106208b;

    /* renamed from: c */
    public final Provider f106209c;

    public RetailerViewModelFactory_Factory(Provider<LoginRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        this.f106207a = provider;
        this.f106208b = provider2;
        this.f106209c = provider3;
    }

    public static RetailerViewModelFactory_Factory create(Provider<LoginRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        return new RetailerViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static RetailerViewModelFactory newInstance(LoginRepository loginRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new RetailerViewModelFactory(loginRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public RetailerViewModelFactory get() {
        return newInstance((LoginRepository) this.f106207a.get(), (Rx2ThreadService) this.f106208b.get(), (MrtrErrorService) this.f106209c.get());
    }
}