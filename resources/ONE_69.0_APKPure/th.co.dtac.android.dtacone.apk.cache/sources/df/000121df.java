package th.p047co.dtac.android.dtacone.presenter.bitmap;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapWithWaterMarkPresenter_Factory */
/* loaded from: classes8.dex */
public final class SaveBitmapWithWaterMarkPresenter_Factory implements Factory<SaveBitmapWithWaterMarkPresenter> {

    /* renamed from: a */
    public final Provider f85328a;

    /* renamed from: b */
    public final Provider f85329b;

    /* renamed from: c */
    public final Provider f85330c;

    public SaveBitmapWithWaterMarkPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f85328a = provider;
        this.f85329b = provider2;
        this.f85330c = provider3;
    }

    public static SaveBitmapWithWaterMarkPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new SaveBitmapWithWaterMarkPresenter_Factory(provider, provider2, provider3);
    }

    public static SaveBitmapWithWaterMarkPresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new SaveBitmapWithWaterMarkPresenter(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public SaveBitmapWithWaterMarkPresenter get() {
        return newInstance((Rx2ThreadService) this.f85328a.get(), (BitmapUtil) this.f85329b.get(), (DrawBitmap) this.f85330c.get());
    }
}