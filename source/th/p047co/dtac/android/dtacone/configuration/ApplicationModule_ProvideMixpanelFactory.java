package th.p047co.dtac.android.dtacone.configuration;

import com.mixpanel.android.mpmetrics.MixpanelAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideMixpanelFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideMixpanelFactory implements Factory<MixpanelAPI> {

    /* renamed from: a */
    public final ApplicationModule f83109a;

    public ApplicationModule_ProvideMixpanelFactory(ApplicationModule applicationModule) {
        this.f83109a = applicationModule;
    }

    public static ApplicationModule_ProvideMixpanelFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideMixpanelFactory(applicationModule);
    }

    public static MixpanelAPI provideMixpanel(ApplicationModule applicationModule) {
        return (MixpanelAPI) Preconditions.checkNotNullFromProvides(applicationModule.provideMixpanel());
    }

    @Override // javax.inject.Provider
    public MixpanelAPI get() {
        return provideMixpanel(this.f83109a);
    }
}
