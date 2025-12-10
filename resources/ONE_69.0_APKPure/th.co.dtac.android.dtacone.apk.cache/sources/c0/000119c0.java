package th.p047co.dtac.android.dtacone.manager.multipart;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.multipart.MultiPartService_Factory */
/* loaded from: classes7.dex */
public final class MultiPartService_Factory implements Factory<MultiPartService> {

    /* renamed from: a */
    public final Provider f85081a;

    public MultiPartService_Factory(Provider<CompressImage> provider) {
        this.f85081a = provider;
    }

    public static MultiPartService_Factory create(Provider<CompressImage> provider) {
        return new MultiPartService_Factory(provider);
    }

    public static MultiPartService newInstance(CompressImage compressImage) {
        return new MultiPartService(compressImage);
    }

    @Override // javax.inject.Provider
    public MultiPartService get() {
        return newInstance((CompressImage) this.f85081a.get());
    }
}