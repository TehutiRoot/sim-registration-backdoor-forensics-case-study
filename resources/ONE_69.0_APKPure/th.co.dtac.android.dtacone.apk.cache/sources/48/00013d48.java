package th.p047co.dtac.android.dtacone.view.appOne.rectify.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneRectifyRepositoryImpl_Factory implements Factory<OneRectifyRepositoryImpl> {

    /* renamed from: a */
    public final Provider f96156a;

    /* renamed from: b */
    public final Provider f96157b;

    /* renamed from: c */
    public final Provider f96158c;

    public OneRectifyRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3) {
        this.f96156a = provider;
        this.f96157b = provider2;
        this.f96158c = provider3;
    }

    public static OneRectifyRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3) {
        return new OneRectifyRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static OneRectifyRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel) {
        return new OneRectifyRepositoryImpl(rTRApiRx2, configurationRepository, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneRectifyRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f96156a.get(), (ConfigurationRepository) this.f96157b.get(), (PreferencesViewModel) this.f96158c.get());
    }
}