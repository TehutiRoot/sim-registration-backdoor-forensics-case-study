package th.p047co.dtac.android.dtacone.view.appOne.activateSim.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneActivateSimViewModelFactory_Factory implements Factory<OneActivateSimViewModelFactory> {

    /* renamed from: a */
    public final Provider f88262a;

    /* renamed from: b */
    public final Provider f88263b;

    /* renamed from: c */
    public final Provider f88264c;

    /* renamed from: d */
    public final Provider f88265d;

    /* renamed from: e */
    public final Provider f88266e;

    public OneActivateSimViewModelFactory_Factory(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<OneActivateSimRepository> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        this.f88262a = provider;
        this.f88263b = provider2;
        this.f88264c = provider3;
        this.f88265d = provider4;
        this.f88266e = provider5;
    }

    public static OneActivateSimViewModelFactory_Factory create(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<OneActivateSimRepository> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneActivateSimViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneActivateSimViewModelFactory newInstance(Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, OneActivateSimRepository oneActivateSimRepository, RtrRepository rtrRepository, ConfigurationRepository configurationRepository) {
        return new OneActivateSimViewModelFactory(rx2ThreadService, oneErrorService, oneActivateSimRepository, rtrRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneActivateSimViewModelFactory get() {
        return newInstance((Rx2ThreadService) this.f88262a.get(), (OneErrorService) this.f88263b.get(), (OneActivateSimRepository) this.f88264c.get(), (RtrRepository) this.f88265d.get(), (ConfigurationRepository) this.f88266e.get());
    }
}