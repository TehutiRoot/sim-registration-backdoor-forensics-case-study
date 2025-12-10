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
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModelFactory_Factory */
/* loaded from: classes7.dex */
public final class OneForgotPasswordViewModelFactory_Factory implements Factory<OneForgotPasswordViewModelFactory> {

    /* renamed from: a */
    public final Provider f82608a;

    /* renamed from: b */
    public final Provider f82609b;

    /* renamed from: c */
    public final Provider f82610c;

    /* renamed from: d */
    public final Provider f82611d;

    public OneForgotPasswordViewModelFactory_Factory(Provider<OneForgotPasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f82608a = provider;
        this.f82609b = provider2;
        this.f82610c = provider3;
        this.f82611d = provider4;
    }

    public static OneForgotPasswordViewModelFactory_Factory create(Provider<OneForgotPasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new OneForgotPasswordViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneForgotPasswordViewModelFactory newInstance(OneForgotPasswordRepository oneForgotPasswordRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, TemporaryCache temporaryCache) {
        return new OneForgotPasswordViewModelFactory(oneForgotPasswordRepository, rx2ThreadService, oneErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public OneForgotPasswordViewModelFactory get() {
        return newInstance((OneForgotPasswordRepository) this.f82608a.get(), (Rx2ThreadService) this.f82609b.get(), (OneErrorService) this.f82610c.get(), (TemporaryCache) this.f82611d.get());
    }
}
