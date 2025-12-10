package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.zelory.compressor.Compressor;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideCompressImageFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideCompressImageFactory implements Factory<CompressImage> {

    /* renamed from: a */
    public final ApplicationModule f83090a;

    /* renamed from: b */
    public final Provider f83091b;

    /* renamed from: c */
    public final Provider f83092c;

    /* renamed from: d */
    public final Provider f83093d;

    public ApplicationModule_ProvideCompressImageFactory(ApplicationModule applicationModule, Provider<FileUtil> provider, Provider<Rx2ThreadService> provider2, Provider<Compressor> provider3) {
        this.f83090a = applicationModule;
        this.f83091b = provider;
        this.f83092c = provider2;
        this.f83093d = provider3;
    }

    public static ApplicationModule_ProvideCompressImageFactory create(ApplicationModule applicationModule, Provider<FileUtil> provider, Provider<Rx2ThreadService> provider2, Provider<Compressor> provider3) {
        return new ApplicationModule_ProvideCompressImageFactory(applicationModule, provider, provider2, provider3);
    }

    public static CompressImage provideCompressImage(ApplicationModule applicationModule, FileUtil fileUtil, Rx2ThreadService rx2ThreadService, Compressor compressor) {
        return (CompressImage) Preconditions.checkNotNullFromProvides(applicationModule.provideCompressImage(fileUtil, rx2ThreadService, compressor));
    }

    @Override // javax.inject.Provider
    public CompressImage get() {
        return provideCompressImage(this.f83090a, (FileUtil) this.f83091b.get(), (Rx2ThreadService) this.f83092c.get(), (Compressor) this.f83093d.get());
    }
}
