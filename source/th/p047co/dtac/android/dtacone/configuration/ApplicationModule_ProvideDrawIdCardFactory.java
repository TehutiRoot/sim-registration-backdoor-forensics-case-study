package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideDrawIdCardFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideDrawIdCardFactory implements Factory<DrawBitmap> {

    /* renamed from: a */
    public final ApplicationModule f83097a;

    /* renamed from: b */
    public final Provider f83098b;

    public ApplicationModule_ProvideDrawIdCardFactory(ApplicationModule applicationModule, Provider<BitmapUtil> provider) {
        this.f83097a = applicationModule;
        this.f83098b = provider;
    }

    public static ApplicationModule_ProvideDrawIdCardFactory create(ApplicationModule applicationModule, Provider<BitmapUtil> provider) {
        return new ApplicationModule_ProvideDrawIdCardFactory(applicationModule, provider);
    }

    public static DrawBitmap provideDrawIdCard(ApplicationModule applicationModule, BitmapUtil bitmapUtil) {
        return (DrawBitmap) Preconditions.checkNotNullFromProvides(applicationModule.provideDrawIdCard(bitmapUtil));
    }

    @Override // javax.inject.Provider
    public DrawBitmap get() {
        return provideDrawIdCard(this.f83097a, (BitmapUtil) this.f83098b.get());
    }
}
