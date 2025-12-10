package th.p047co.dtac.android.dtacone.data.cache.preference;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.data.cache.preference.PreferencesRepository_Factory */
/* loaded from: classes7.dex */
public final class PreferencesRepository_Factory implements Factory<PreferencesRepository> {

    /* renamed from: a */
    public final Provider f83524a;

    public PreferencesRepository_Factory(Provider<SharedPreferences> provider) {
        this.f83524a = provider;
    }

    public static PreferencesRepository_Factory create(Provider<SharedPreferences> provider) {
        return new PreferencesRepository_Factory(provider);
    }

    public static PreferencesRepository newInstance(SharedPreferences sharedPreferences) {
        return new PreferencesRepository(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public PreferencesRepository get() {
        return newInstance((SharedPreferences) this.f83524a.get());
    }
}