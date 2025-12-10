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
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PreviewIdCardPresenter_Factory */
/* loaded from: classes8.dex */
public final class PreviewIdCardPresenter_Factory implements Factory<PreviewIdCardPresenter> {

    /* renamed from: a */
    public final Provider f86242a;

    /* renamed from: b */
    public final Provider f86243b;

    public PreviewIdCardPresenter_Factory(Provider<RxThreadService> provider, Provider<BitmapUtil> provider2) {
        this.f86242a = provider;
        this.f86243b = provider2;
    }

    public static PreviewIdCardPresenter_Factory create(Provider<RxThreadService> provider, Provider<BitmapUtil> provider2) {
        return new PreviewIdCardPresenter_Factory(provider, provider2);
    }

    public static PreviewIdCardPresenter newInstance(RxThreadService rxThreadService, BitmapUtil bitmapUtil) {
        return new PreviewIdCardPresenter(rxThreadService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public PreviewIdCardPresenter get() {
        return newInstance((RxThreadService) this.f86242a.get(), (BitmapUtil) this.f86243b.get());
    }
}