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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageFactory_Factory */
/* loaded from: classes9.dex */
public final class LoadPreviewImageFactory_Factory implements Factory<LoadPreviewImageFactory> {

    /* renamed from: a */
    public final Provider f106046a;

    /* renamed from: b */
    public final Provider f106047b;

    /* renamed from: c */
    public final Provider f106048c;

    public LoadPreviewImageFactory_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f106046a = provider;
        this.f106047b = provider2;
        this.f106048c = provider3;
    }

    public static LoadPreviewImageFactory_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new LoadPreviewImageFactory_Factory(provider, provider2, provider3);
    }

    public static LoadPreviewImageFactory newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new LoadPreviewImageFactory(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public LoadPreviewImageFactory get() {
        return newInstance((Rx2ThreadService) this.f106046a.get(), (BitmapUtil) this.f106047b.get(), (DrawBitmap) this.f106048c.get());
    }
}