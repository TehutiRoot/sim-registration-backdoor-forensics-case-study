package th.p047co.dtac.android.dtacone.configuration;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideContextFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {

    /* renamed from: a */
    public final ApplicationModule f83096a;

    public ApplicationModule_ProvideContextFactory(ApplicationModule applicationModule) {
        this.f83096a = applicationModule;
    }

    public static ApplicationModule_ProvideContextFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideContextFactory(applicationModule);
    }

    public static Context provideContext(ApplicationModule applicationModule) {
        return (Context) Preconditions.checkNotNullFromProvides(applicationModule.provideContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.f83096a);
    }
}
