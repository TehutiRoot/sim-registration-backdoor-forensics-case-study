package th.p047co.dtac.android.dtacone.viewmodel.image;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageViewModel_Factory */
/* loaded from: classes9.dex */
public final class LoadPreviewImageViewModel_Factory implements Factory<LoadPreviewImageViewModel> {

    /* renamed from: a */
    public final Provider f106055a;

    /* renamed from: b */
    public final Provider f106056b;

    /* renamed from: c */
    public final Provider f106057c;

    public LoadPreviewImageViewModel_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f106055a = provider;
        this.f106056b = provider2;
        this.f106057c = provider3;
    }

    public static LoadPreviewImageViewModel_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new LoadPreviewImageViewModel_Factory(provider, provider2, provider3);
    }

    public static LoadPreviewImageViewModel newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new LoadPreviewImageViewModel(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public LoadPreviewImageViewModel get() {
        return newInstance((Rx2ThreadService) this.f106055a.get(), (BitmapUtil) this.f106056b.get(), (DrawBitmap) this.f106057c.get());
    }
}