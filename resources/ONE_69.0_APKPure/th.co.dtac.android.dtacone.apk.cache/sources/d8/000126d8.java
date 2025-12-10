package th.p047co.dtac.android.dtacone.util.appOne.image;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.appOne.image.ImageUtil_Factory */
/* loaded from: classes8.dex */
public final class ImageUtil_Factory implements Factory<ImageUtil> {

    /* renamed from: a */
    public final Provider f87110a;

    /* renamed from: b */
    public final Provider f87111b;

    public ImageUtil_Factory(Provider<CompressImage> provider, Provider<FileUtil> provider2) {
        this.f87110a = provider;
        this.f87111b = provider2;
    }

    public static ImageUtil_Factory create(Provider<CompressImage> provider, Provider<FileUtil> provider2) {
        return new ImageUtil_Factory(provider, provider2);
    }

    public static ImageUtil newInstance(CompressImage compressImage, FileUtil fileUtil) {
        return new ImageUtil(compressImage, fileUtil);
    }

    @Override // javax.inject.Provider
    public ImageUtil get() {
        return newInstance((CompressImage) this.f87110a.get(), (FileUtil) this.f87111b.get());
    }
}