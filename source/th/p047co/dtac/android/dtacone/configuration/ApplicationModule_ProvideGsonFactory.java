package th.p047co.dtac.android.dtacone.configuration;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideGsonFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideGsonFactory implements Factory<Gson> {

    /* renamed from: a */
    public final ApplicationModule f83106a;

    /* renamed from: b */
    public final Provider f83107b;

    /* renamed from: c */
    public final Provider f83108c;

    public ApplicationModule_ProvideGsonFactory(ApplicationModule applicationModule, Provider<RtrRx2Repository> provider, Provider<PreferencesRepository> provider2) {
        this.f83106a = applicationModule;
        this.f83107b = provider;
        this.f83108c = provider2;
    }

    public static ApplicationModule_ProvideGsonFactory create(ApplicationModule applicationModule, Provider<RtrRx2Repository> provider, Provider<PreferencesRepository> provider2) {
        return new ApplicationModule_ProvideGsonFactory(applicationModule, provider, provider2);
    }

    public static Gson provideGson(ApplicationModule applicationModule, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository) {
        return (Gson) Preconditions.checkNotNullFromProvides(applicationModule.provideGson(rtrRx2Repository, preferencesRepository));
    }

    @Override // javax.inject.Provider
    public Gson get() {
        return provideGson(this.f83106a, (RtrRx2Repository) this.f83107b.get(), (PreferencesRepository) this.f83108c.get());
    }
}
