package th.p047co.dtac.android.dtacone.app_one.viewmodel.preference;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel_Factory */
/* loaded from: classes7.dex */
public final class PreferencesViewModel_Factory implements Factory<PreferencesViewModel> {

    /* renamed from: a */
    public final Provider f82617a;

    public PreferencesViewModel_Factory(Provider<PreferencesRepository> provider) {
        this.f82617a = provider;
    }

    public static PreferencesViewModel_Factory create(Provider<PreferencesRepository> provider) {
        return new PreferencesViewModel_Factory(provider);
    }

    public static PreferencesViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new PreferencesViewModel(preferencesRepository);
    }

    @Override // javax.inject.Provider
    public PreferencesViewModel get() {
        return newInstance((PreferencesRepository) this.f82617a.get());
    }
}
