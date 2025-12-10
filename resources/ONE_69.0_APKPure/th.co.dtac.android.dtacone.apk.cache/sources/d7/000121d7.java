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
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter_Factory */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter_Factory implements Factory<SaveBitmapPresenter> {

    /* renamed from: a */
    public final Provider f85320a;

    /* renamed from: b */
    public final Provider f85321b;

    /* renamed from: c */
    public final Provider f85322c;

    public SaveBitmapPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f85320a = provider;
        this.f85321b = provider2;
        this.f85322c = provider3;
    }

    public static SaveBitmapPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new SaveBitmapPresenter_Factory(provider, provider2, provider3);
    }

    public static SaveBitmapPresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new SaveBitmapPresenter(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public SaveBitmapPresenter get() {
        return newInstance((Rx2ThreadService) this.f85320a.get(), (BitmapUtil) this.f85321b.get(), (DrawBitmap) this.f85322c.get());
    }
}