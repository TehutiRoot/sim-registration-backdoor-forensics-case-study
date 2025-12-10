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
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModelFactory_Factory */
/* loaded from: classes7.dex */
public final class OneChangePasswordViewModelFactory_Factory implements Factory<OneChangePasswordViewModelFactory> {

    /* renamed from: a */
    public final Provider f82584a;

    /* renamed from: b */
    public final Provider f82585b;

    /* renamed from: c */
    public final Provider f82586c;

    public OneChangePasswordViewModelFactory_Factory(Provider<OneChangePasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f82584a = provider;
        this.f82585b = provider2;
        this.f82586c = provider3;
    }

    public static OneChangePasswordViewModelFactory_Factory create(Provider<OneChangePasswordRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneChangePasswordViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneChangePasswordViewModelFactory newInstance(OneChangePasswordRepository oneChangePasswordRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangePasswordViewModelFactory(oneChangePasswordRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangePasswordViewModelFactory get() {
        return newInstance((OneChangePasswordRepository) this.f82584a.get(), (Rx2ThreadService) this.f82585b.get(), (OneErrorService) this.f82586c.get());
    }
}
