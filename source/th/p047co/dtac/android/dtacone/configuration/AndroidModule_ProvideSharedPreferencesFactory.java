package th.p047co.dtac.android.dtacone.configuration;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideSharedPreferencesFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {

    /* renamed from: a */
    public final AndroidModule f83082a;

    public AndroidModule_ProvideSharedPreferencesFactory(AndroidModule androidModule) {
        this.f83082a = androidModule;
    }

    public static AndroidModule_ProvideSharedPreferencesFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideSharedPreferencesFactory(androidModule);
    }

    public static SharedPreferences provideSharedPreferences(AndroidModule androidModule) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(androidModule.m19627r());
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return provideSharedPreferences(this.f83082a);
    }
}
