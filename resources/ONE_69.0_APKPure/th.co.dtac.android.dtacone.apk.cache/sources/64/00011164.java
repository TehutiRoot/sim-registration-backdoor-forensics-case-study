package th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel_Factory */
/* loaded from: classes7.dex */
public final class OneChangePasswordViewModel_Factory implements Factory<OneChangePasswordViewModel> {

    /* renamed from: a */
    public final Provider f82679a;

    /* renamed from: b */
    public final Provider f82680b;

    /* renamed from: c */
    public final Provider f82681c;

    public OneChangePasswordViewModel_Factory(Provider<OneChangePasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f82679a = provider;
        this.f82680b = provider2;
        this.f82681c = provider3;
    }

    public static OneChangePasswordViewModel_Factory create(Provider<OneChangePasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneChangePasswordViewModel_Factory(provider, provider2, provider3);
    }

    public static OneChangePasswordViewModel newInstance(OneChangePasswordRepository oneChangePasswordRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangePasswordViewModel(oneChangePasswordRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangePasswordViewModel get() {
        return newInstance((OneChangePasswordRepository) this.f82679a.get(), (Rx2ThreadService) this.f82680b.get(), (OneErrorService) this.f82681c.get());
    }
}