package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

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
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository_Factory */
/* loaded from: classes7.dex */
public final class RtrRx2Repository_Factory implements Factory<RtrRx2Repository> {

    /* renamed from: a */
    public final Provider f83457a;

    /* renamed from: b */
    public final Provider f83458b;

    public RtrRx2Repository_Factory(Provider<RealmConfiguration> provider, Provider<PreferencesViewModel> provider2) {
        this.f83457a = provider;
        this.f83458b = provider2;
    }

    public static RtrRx2Repository_Factory create(Provider<RealmConfiguration> provider, Provider<PreferencesViewModel> provider2) {
        return new RtrRx2Repository_Factory(provider, provider2);
    }

    public static RtrRx2Repository newInstance(RealmConfiguration realmConfiguration, PreferencesViewModel preferencesViewModel) {
        return new RtrRx2Repository(realmConfiguration, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public RtrRx2Repository get() {
        return newInstance((RealmConfiguration) this.f83457a.get(), (PreferencesViewModel) this.f83458b.get());
    }
}
