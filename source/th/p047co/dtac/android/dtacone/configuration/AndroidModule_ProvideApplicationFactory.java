package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideApplicationFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideApplicationFactory implements Factory<Application> {

    /* renamed from: a */
    public final AndroidModule f83057a;

    public AndroidModule_ProvideApplicationFactory(AndroidModule androidModule) {
        this.f83057a = androidModule;
    }

    public static AndroidModule_ProvideApplicationFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideApplicationFactory(androidModule);
    }

    public static Application provideApplication(AndroidModule androidModule) {
        return (Application) Preconditions.checkNotNullFromProvides(androidModule.m19642c());
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.f83057a);
    }
}
