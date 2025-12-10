package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.data.cache.database.LanguageDbHelper;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideMultiLanguageHelperFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideMultiLanguageHelperFactory implements Factory<LanguageDbHelper> {

    /* renamed from: a */
    public final AndroidModule f83076a;

    public AndroidModule_ProvideMultiLanguageHelperFactory(AndroidModule androidModule) {
        this.f83076a = androidModule;
    }

    public static AndroidModule_ProvideMultiLanguageHelperFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideMultiLanguageHelperFactory(androidModule);
    }

    public static LanguageDbHelper provideMultiLanguageHelper(AndroidModule androidModule) {
        return (LanguageDbHelper) Preconditions.checkNotNullFromProvides(androidModule.m19630o());
    }

    @Override // javax.inject.Provider
    public LanguageDbHelper get() {
        return provideMultiLanguageHelper(this.f83076a);
    }
}
