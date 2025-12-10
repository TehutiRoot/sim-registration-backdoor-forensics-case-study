package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideFileUtilFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideFileUtilFactory implements Factory<FileUtil> {

    /* renamed from: a */
    public final ApplicationModule f83105a;

    public ApplicationModule_ProvideFileUtilFactory(ApplicationModule applicationModule) {
        this.f83105a = applicationModule;
    }

    public static ApplicationModule_ProvideFileUtilFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFileUtilFactory(applicationModule);
    }

    public static FileUtil provideFileUtil(ApplicationModule applicationModule) {
        return (FileUtil) Preconditions.checkNotNullFromProvides(applicationModule.provideFileUtil());
    }

    @Override // javax.inject.Provider
    public FileUtil get() {
        return provideFileUtil(this.f83105a);
    }
}
