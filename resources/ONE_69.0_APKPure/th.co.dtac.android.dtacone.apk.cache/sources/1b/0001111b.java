package th.p047co.dtac.android.dtacone.app_one.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneStvRepositoryImpl_Factory */
/* loaded from: classes7.dex */
public final class OneStvRepositoryImpl_Factory implements Factory<OneStvRepositoryImpl> {

    /* renamed from: a */
    public final Provider f82460a;

    /* renamed from: b */
    public final Provider f82461b;

    /* renamed from: c */
    public final Provider f82462c;

    /* renamed from: d */
    public final Provider f82463d;

    public OneStvRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4) {
        this.f82460a = provider;
        this.f82461b = provider2;
        this.f82462c = provider3;
        this.f82463d = provider4;
    }

    public static OneStvRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<PreferencesViewModel> provider4) {
        return new OneStvRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static OneStvRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel) {
        return new OneStvRepositoryImpl(rTRApiRx2, rtrRx2Repository, configurationRepository, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneStvRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f82460a.get(), (RtrRx2Repository) this.f82461b.get(), (ConfigurationRepository) this.f82462c.get(), (PreferencesViewModel) this.f82463d.get());
    }
}