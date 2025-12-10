package th.p047co.dtac.android.dtacone.configuration;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvidePreferencesRepositoryFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvidePreferencesRepositoryFactory implements Factory<PreferencesRepository> {

    /* renamed from: a */
    public final AndroidModule f83080a;

    /* renamed from: b */
    public final Provider f83081b;

    public AndroidModule_ProvidePreferencesRepositoryFactory(AndroidModule androidModule, Provider<SharedPreferences> provider) {
        this.f83080a = androidModule;
        this.f83081b = provider;
    }

    public static AndroidModule_ProvidePreferencesRepositoryFactory create(AndroidModule androidModule, Provider<SharedPreferences> provider) {
        return new AndroidModule_ProvidePreferencesRepositoryFactory(androidModule, provider);
    }

    public static PreferencesRepository providePreferencesRepository(AndroidModule androidModule, SharedPreferences sharedPreferences) {
        return (PreferencesRepository) Preconditions.checkNotNullFromProvides(androidModule.m19628q(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public PreferencesRepository get() {
        return providePreferencesRepository(this.f83080a, (SharedPreferences) this.f83081b.get());
    }
}
