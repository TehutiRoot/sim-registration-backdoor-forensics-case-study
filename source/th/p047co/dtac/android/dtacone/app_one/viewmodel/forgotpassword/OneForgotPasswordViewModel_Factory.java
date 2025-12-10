package th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel_Factory */
/* loaded from: classes7.dex */
public final class OneForgotPasswordViewModel_Factory implements Factory<OneForgotPasswordViewModel> {

    /* renamed from: a */
    public final Provider f82612a;

    /* renamed from: b */
    public final Provider f82613b;

    /* renamed from: c */
    public final Provider f82614c;

    /* renamed from: d */
    public final Provider f82615d;

    public OneForgotPasswordViewModel_Factory(Provider<OneForgotPasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f82612a = provider;
        this.f82613b = provider2;
        this.f82614c = provider3;
        this.f82615d = provider4;
    }

    public static OneForgotPasswordViewModel_Factory create(Provider<OneForgotPasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new OneForgotPasswordViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneForgotPasswordViewModel newInstance(OneForgotPasswordRepository oneForgotPasswordRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, TemporaryCache temporaryCache) {
        return new OneForgotPasswordViewModel(oneForgotPasswordRepository, rx2ThreadService, oneErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public OneForgotPasswordViewModel get() {
        return newInstance((OneForgotPasswordRepository) this.f82612a.get(), (Rx2ThreadService) this.f82613b.get(), (OneErrorService) this.f82614c.get(), (TemporaryCache) this.f82615d.get());
    }
}
