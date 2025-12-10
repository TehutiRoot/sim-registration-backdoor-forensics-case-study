package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideMultiPartFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideMultiPartFactory implements Factory<MultiPartService> {

    /* renamed from: a */
    public final HttpModule f83133a;

    /* renamed from: b */
    public final Provider f83134b;

    public HttpModule_ProvideMultiPartFactory(HttpModule httpModule, Provider<CompressImage> provider) {
        this.f83133a = httpModule;
        this.f83134b = provider;
    }

    public static HttpModule_ProvideMultiPartFactory create(HttpModule httpModule, Provider<CompressImage> provider) {
        return new HttpModule_ProvideMultiPartFactory(httpModule, provider);
    }

    public static MultiPartService provideMultiPart(HttpModule httpModule, CompressImage compressImage) {
        return (MultiPartService) Preconditions.checkNotNullFromProvides(httpModule.m19614i(compressImage));
    }

    @Override // javax.inject.Provider
    public MultiPartService get() {
        return provideMultiPart(this.f83133a, (CompressImage) this.f83134b.get());
    }
}
