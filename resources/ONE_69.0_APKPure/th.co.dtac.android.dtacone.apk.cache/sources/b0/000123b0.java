package th.p047co.dtac.android.dtacone.presenter.image;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.image.PreviewImagePresenter_Factory */
/* loaded from: classes8.dex */
public final class PreviewImagePresenter_Factory implements Factory<PreviewImagePresenter> {

    /* renamed from: a */
    public final Provider f85859a;

    /* renamed from: b */
    public final Provider f85860b;

    /* renamed from: c */
    public final Provider f85861c;

    public PreviewImagePresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        this.f85859a = provider;
        this.f85860b = provider2;
        this.f85861c = provider3;
    }

    public static PreviewImagePresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2, Provider<DrawBitmap> provider3) {
        return new PreviewImagePresenter_Factory(provider, provider2, provider3);
    }

    public static PreviewImagePresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new PreviewImagePresenter(rx2ThreadService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public PreviewImagePresenter get() {
        return newInstance((Rx2ThreadService) this.f85859a.get(), (BitmapUtil) this.f85860b.get(), (DrawBitmap) this.f85861c.get());
    }
}