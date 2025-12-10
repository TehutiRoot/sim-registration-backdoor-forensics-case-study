package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.zelory.compressor.Compressor;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideCompressorFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideCompressorFactory implements Factory<Compressor> {

    /* renamed from: a */
    public final ApplicationModule f83094a;

    /* renamed from: b */
    public final Provider f83095b;

    public ApplicationModule_ProvideCompressorFactory(ApplicationModule applicationModule, Provider<Application> provider) {
        this.f83094a = applicationModule;
        this.f83095b = provider;
    }

    public static ApplicationModule_ProvideCompressorFactory create(ApplicationModule applicationModule, Provider<Application> provider) {
        return new ApplicationModule_ProvideCompressorFactory(applicationModule, provider);
    }

    public static Compressor provideCompressor(ApplicationModule applicationModule, Application application) {
        return (Compressor) Preconditions.checkNotNullFromProvides(applicationModule.provideCompressor(application));
    }

    @Override // javax.inject.Provider
    public Compressor get() {
        return provideCompressor(this.f83094a, (Application) this.f83095b.get());
    }
}
