package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.realm.RealmConfiguration;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideDefaultRealmConfigurationFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideDefaultRealmConfigurationFactory implements Factory<RealmConfiguration> {

    /* renamed from: a */
    public final AndroidModule f83071a;

    public AndroidModule_ProvideDefaultRealmConfigurationFactory(AndroidModule androidModule) {
        this.f83071a = androidModule;
    }

    public static AndroidModule_ProvideDefaultRealmConfigurationFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideDefaultRealmConfigurationFactory(androidModule);
    }

    public static RealmConfiguration provideDefaultRealmConfiguration(AndroidModule androidModule) {
        return (RealmConfiguration) Preconditions.checkNotNullFromProvides(androidModule.m19635j());
    }

    @Override // javax.inject.Provider
    public RealmConfiguration get() {
        return provideDefaultRealmConfiguration(this.f83071a);
    }
}
