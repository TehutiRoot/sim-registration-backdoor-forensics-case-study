package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.app.Application;
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
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.BitmapPresenter_Factory */
/* loaded from: classes8.dex */
public final class BitmapPresenter_Factory implements Factory<BitmapPresenter> {

    /* renamed from: a */
    public final Provider f85288a;

    /* renamed from: b */
    public final Provider f85289b;

    /* renamed from: c */
    public final Provider f85290c;

    /* renamed from: d */
    public final Provider f85291d;

    public BitmapPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<Application> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        this.f85288a = provider;
        this.f85289b = provider2;
        this.f85290c = provider3;
        this.f85291d = provider4;
    }

    public static BitmapPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<Application> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        return new BitmapPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static BitmapPresenter newInstance(Rx2ThreadService rx2ThreadService, Application application, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new BitmapPresenter(rx2ThreadService, application, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public BitmapPresenter get() {
        return newInstance((Rx2ThreadService) this.f85288a.get(), (Application) this.f85289b.get(), (BitmapUtil) this.f85290c.get(), (DrawBitmap) this.f85291d.get());
    }
}