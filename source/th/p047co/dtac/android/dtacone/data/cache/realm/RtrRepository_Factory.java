package th.p047co.dtac.android.dtacone.data.cache.realm;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.realm.RealmConfiguration;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RtrRepository_Factory */
/* loaded from: classes7.dex */
public final class RtrRepository_Factory implements Factory<RtrRepository> {

    /* renamed from: a */
    public final Provider f83443a;

    /* renamed from: b */
    public final Provider f83444b;

    public RtrRepository_Factory(Provider<RealmConfiguration> provider, Provider<PreferencesViewModel> provider2) {
        this.f83443a = provider;
        this.f83444b = provider2;
    }

    public static RtrRepository_Factory create(Provider<RealmConfiguration> provider, Provider<PreferencesViewModel> provider2) {
        return new RtrRepository_Factory(provider, provider2);
    }

    public static RtrRepository newInstance(RealmConfiguration realmConfiguration, PreferencesViewModel preferencesViewModel) {
        return new RtrRepository(realmConfiguration, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public RtrRepository get() {
        return newInstance((RealmConfiguration) this.f83443a.get(), (PreferencesViewModel) this.f83444b.get());
    }
}
