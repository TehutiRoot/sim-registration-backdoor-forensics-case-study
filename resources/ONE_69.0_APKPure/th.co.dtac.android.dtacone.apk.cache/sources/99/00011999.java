package th.p047co.dtac.android.dtacone.manager.compressor;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.zelory.compressor.Compressor;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.compressor.CompressImage_Factory */
/* loaded from: classes7.dex */
public final class CompressImage_Factory implements Factory<CompressImage> {

    /* renamed from: a */
    public final Provider f85014a;

    /* renamed from: b */
    public final Provider f85015b;

    /* renamed from: c */
    public final Provider f85016c;

    public CompressImage_Factory(Provider<FileUtil> provider, Provider<Rx2ThreadService> provider2, Provider<Compressor> provider3) {
        this.f85014a = provider;
        this.f85015b = provider2;
        this.f85016c = provider3;
    }

    public static CompressImage_Factory create(Provider<FileUtil> provider, Provider<Rx2ThreadService> provider2, Provider<Compressor> provider3) {
        return new CompressImage_Factory(provider, provider2, provider3);
    }

    public static CompressImage newInstance(FileUtil fileUtil, Rx2ThreadService rx2ThreadService, Compressor compressor) {
        return new CompressImage(fileUtil, rx2ThreadService, compressor);
    }

    @Override // javax.inject.Provider
    public CompressImage get() {
        return newInstance((FileUtil) this.f85014a.get(), (Rx2ThreadService) this.f85015b.get(), (Compressor) this.f85016c.get());
    }
}