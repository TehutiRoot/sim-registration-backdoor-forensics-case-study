package th.p047co.dtac.android.dtacone.app_one.presenter;

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
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter_Factory */
/* loaded from: classes7.dex */
public final class OneSaveBitmapWithWaterMarkPresenter_Factory implements Factory<OneSaveBitmapWithWaterMarkPresenter> {

    /* renamed from: a */
    public final Provider f82339a;

    /* renamed from: b */
    public final Provider f82340b;

    /* renamed from: c */
    public final Provider f82341c;

    public OneSaveBitmapWithWaterMarkPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f82339a = provider;
        this.f82340b = provider2;
        this.f82341c = provider3;
    }

    public static OneSaveBitmapWithWaterMarkPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new OneSaveBitmapWithWaterMarkPresenter_Factory(provider, provider2, provider3);
    }

    public static OneSaveBitmapWithWaterMarkPresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new OneSaveBitmapWithWaterMarkPresenter(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public OneSaveBitmapWithWaterMarkPresenter get() {
        return newInstance((Rx2ThreadService) this.f82339a.get(), (BitmapUtil) this.f82340b.get(), (DrawBitmap) this.f82341c.get());
    }
}
