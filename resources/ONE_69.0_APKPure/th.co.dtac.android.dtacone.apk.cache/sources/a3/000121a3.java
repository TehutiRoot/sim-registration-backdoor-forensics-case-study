package th.p047co.dtac.android.dtacone.presenter.bitmap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter_Factory */
/* loaded from: classes8.dex */
public final class CompressSaveBitmapPresenter_Factory implements Factory<CompressSaveBitmapPresenter> {

    /* renamed from: a */
    public final Provider f85296a;

    /* renamed from: b */
    public final Provider f85297b;

    public CompressSaveBitmapPresenter_Factory(Provider<BitmapUtil> provider, Provider<Rx2ThreadService> provider2) {
        this.f85296a = provider;
        this.f85297b = provider2;
    }

    public static CompressSaveBitmapPresenter_Factory create(Provider<BitmapUtil> provider, Provider<Rx2ThreadService> provider2) {
        return new CompressSaveBitmapPresenter_Factory(provider, provider2);
    }

    public static CompressSaveBitmapPresenter newInstance(BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService) {
        return new CompressSaveBitmapPresenter(bitmapUtil, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public CompressSaveBitmapPresenter get() {
        return newInstance((BitmapUtil) this.f85296a.get(), (Rx2ThreadService) this.f85297b.get());
    }
}