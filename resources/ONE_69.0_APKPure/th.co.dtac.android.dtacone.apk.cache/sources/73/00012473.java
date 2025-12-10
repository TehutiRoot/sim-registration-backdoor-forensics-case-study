package th.p047co.dtac.android.dtacone.presenter.prepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPreviewOptionalImagePresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidPreviewOptionalImagePresenter_Factory implements Factory<PrepaidPreviewOptionalImagePresenter> {

    /* renamed from: a */
    public final Provider f86191a;

    /* renamed from: b */
    public final Provider f86192b;

    public PrepaidPreviewOptionalImagePresenter_Factory(Provider<RxThreadService> provider, Provider<BitmapUtil> provider2) {
        this.f86191a = provider;
        this.f86192b = provider2;
    }

    public static PrepaidPreviewOptionalImagePresenter_Factory create(Provider<RxThreadService> provider, Provider<BitmapUtil> provider2) {
        return new PrepaidPreviewOptionalImagePresenter_Factory(provider, provider2);
    }

    public static PrepaidPreviewOptionalImagePresenter newInstance(RxThreadService rxThreadService, BitmapUtil bitmapUtil) {
        return new PrepaidPreviewOptionalImagePresenter(rxThreadService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public PrepaidPreviewOptionalImagePresenter get() {
        return newInstance((RxThreadService) this.f86191a.get(), (BitmapUtil) this.f86192b.get());
    }
}