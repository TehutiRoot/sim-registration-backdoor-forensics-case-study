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
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModelFactory_Factory */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModelFactory_Factory implements Factory<OneRegistrationViewModelFactory> {

    /* renamed from: a */
    public final Provider f82646a;

    /* renamed from: b */
    public final Provider f82647b;

    /* renamed from: c */
    public final Provider f82648c;

    /* renamed from: d */
    public final Provider f82649d;

    public OneRegistrationViewModelFactory_Factory(Provider<OneRegistrationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f82646a = provider;
        this.f82647b = provider2;
        this.f82648c = provider3;
        this.f82649d = provider4;
    }

    public static OneRegistrationViewModelFactory_Factory create(Provider<OneRegistrationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new OneRegistrationViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegistrationViewModelFactory newInstance(OneRegistrationRepository oneRegistrationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, TemporaryCache temporaryCache) {
        return new OneRegistrationViewModelFactory(oneRegistrationRepository, rx2ThreadService, oneErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public OneRegistrationViewModelFactory get() {
        return newInstance((OneRegistrationRepository) this.f82646a.get(), (Rx2ThreadService) this.f82647b.get(), (OneErrorService) this.f82648c.get(), (TemporaryCache) this.f82649d.get());
    }
}
