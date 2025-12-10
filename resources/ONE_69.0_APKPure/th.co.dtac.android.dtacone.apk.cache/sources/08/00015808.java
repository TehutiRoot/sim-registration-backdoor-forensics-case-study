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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.RetailerViewModel_Factory */
/* loaded from: classes9.dex */
public final class RetailerViewModel_Factory implements Factory<RetailerViewModel> {

    /* renamed from: a */
    public final Provider f106210a;

    /* renamed from: b */
    public final Provider f106211b;

    /* renamed from: c */
    public final Provider f106212c;

    public RetailerViewModel_Factory(Provider<LoginRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        this.f106210a = provider;
        this.f106211b = provider2;
        this.f106212c = provider3;
    }

    public static RetailerViewModel_Factory create(Provider<LoginRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        return new RetailerViewModel_Factory(provider, provider2, provider3);
    }

    public static RetailerViewModel newInstance(LoginRepository loginRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new RetailerViewModel(loginRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public RetailerViewModel get() {
        return newInstance((LoginRepository) this.f106210a.get(), (Rx2ThreadService) this.f106211b.get(), (MrtrErrorService) this.f106212c.get());
    }
}