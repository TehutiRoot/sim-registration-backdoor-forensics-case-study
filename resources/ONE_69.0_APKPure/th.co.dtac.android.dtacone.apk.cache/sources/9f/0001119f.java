package th.p047co.dtac.android.dtacone.app_one.viewmodel.registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel_Factory */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModel_Factory implements Factory<OneRegistrationViewModel> {

    /* renamed from: a */
    public final Provider f82742a;

    /* renamed from: b */
    public final Provider f82743b;

    /* renamed from: c */
    public final Provider f82744c;

    /* renamed from: d */
    public final Provider f82745d;

    public OneRegistrationViewModel_Factory(Provider<OneRegistrationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f82742a = provider;
        this.f82743b = provider2;
        this.f82744c = provider3;
        this.f82745d = provider4;
    }

    public static OneRegistrationViewModel_Factory create(Provider<OneRegistrationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new OneRegistrationViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegistrationViewModel newInstance(OneRegistrationRepository oneRegistrationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, TemporaryCache temporaryCache) {
        return new OneRegistrationViewModel(oneRegistrationRepository, rx2ThreadService, oneErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public OneRegistrationViewModel get() {
        return newInstance((OneRegistrationRepository) this.f82742a.get(), (Rx2ThreadService) this.f82743b.get(), (OneErrorService) this.f82744c.get(), (TemporaryCache) this.f82745d.get());
    }
}