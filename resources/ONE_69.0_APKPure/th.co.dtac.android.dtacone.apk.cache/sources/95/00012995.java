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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.viewModel.OneActivateSimViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneActivateSimViewModel_Factory implements Factory<OneActivateSimViewModel> {

    /* renamed from: a */
    public final Provider f88267a;

    /* renamed from: b */
    public final Provider f88268b;

    /* renamed from: c */
    public final Provider f88269c;

    /* renamed from: d */
    public final Provider f88270d;

    /* renamed from: e */
    public final Provider f88271e;

    public OneActivateSimViewModel_Factory(Provider<OneErrorService> provider, Provider<Rx2ThreadService> provider2, Provider<OneActivateSimRepository> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        this.f88267a = provider;
        this.f88268b = provider2;
        this.f88269c = provider3;
        this.f88270d = provider4;
        this.f88271e = provider5;
    }

    public static OneActivateSimViewModel_Factory create(Provider<OneErrorService> provider, Provider<Rx2ThreadService> provider2, Provider<OneActivateSimRepository> provider3, Provider<RtrRepository> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneActivateSimViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneActivateSimViewModel newInstance(OneErrorService oneErrorService, Rx2ThreadService rx2ThreadService, OneActivateSimRepository oneActivateSimRepository, RtrRepository rtrRepository, ConfigurationRepository configurationRepository) {
        return new OneActivateSimViewModel(oneErrorService, rx2ThreadService, oneActivateSimRepository, rtrRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneActivateSimViewModel get() {
        return newInstance((OneErrorService) this.f88267a.get(), (Rx2ThreadService) this.f88268b.get(), (OneActivateSimRepository) this.f88269c.get(), (RtrRepository) this.f88270d.get(), (ConfigurationRepository) this.f88271e.get());
    }
}