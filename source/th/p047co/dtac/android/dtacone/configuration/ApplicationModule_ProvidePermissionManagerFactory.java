package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.manager.PermissionManager;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvidePermissionManagerFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvidePermissionManagerFactory implements Factory<PermissionManager> {

    /* renamed from: a */
    public final ApplicationModule f83110a;

    public ApplicationModule_ProvidePermissionManagerFactory(ApplicationModule applicationModule) {
        this.f83110a = applicationModule;
    }

    public static ApplicationModule_ProvidePermissionManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidePermissionManagerFactory(applicationModule);
    }

    public static PermissionManager providePermissionManager(ApplicationModule applicationModule) {
        return (PermissionManager) Preconditions.checkNotNullFromProvides(applicationModule.providePermissionManager());
    }

    @Override // javax.inject.Provider
    public PermissionManager get() {
        return providePermissionManager(this.f83110a);
    }
}
