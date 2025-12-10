package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideBitmapFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideBitmapFactory implements Factory<BitmapUtil> {

    /* renamed from: a */
    public final ApplicationModule f83088a;

    /* renamed from: b */
    public final Provider f83089b;

    public ApplicationModule_ProvideBitmapFactory(ApplicationModule applicationModule, Provider<FileUtil> provider) {
        this.f83088a = applicationModule;
        this.f83089b = provider;
    }

    public static ApplicationModule_ProvideBitmapFactory create(ApplicationModule applicationModule, Provider<FileUtil> provider) {
        return new ApplicationModule_ProvideBitmapFactory(applicationModule, provider);
    }

    public static BitmapUtil provideBitmap(ApplicationModule applicationModule, FileUtil fileUtil) {
        return (BitmapUtil) Preconditions.checkNotNullFromProvides(applicationModule.provideBitmap(fileUtil));
    }

    @Override // javax.inject.Provider
    public BitmapUtil get() {
        return provideBitmap(this.f83088a, (FileUtil) this.f83089b.get());
    }
}
