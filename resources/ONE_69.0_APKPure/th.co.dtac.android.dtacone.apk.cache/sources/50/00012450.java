package th.p047co.dtac.android.dtacone.presenter.prepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter_Factory */
/* loaded from: classes8.dex */
public final class CameraIdCardPresenter_Factory implements Factory<CameraIdCardPresenter> {

    /* renamed from: a */
    public final Provider f86141a;

    /* renamed from: b */
    public final Provider f86142b;

    /* renamed from: c */
    public final Provider f86143c;

    public CameraIdCardPresenter_Factory(Provider<RxBus<Object>> provider, Provider<RxThreadService> provider2, Provider<BitmapUtil> provider3) {
        this.f86141a = provider;
        this.f86142b = provider2;
        this.f86143c = provider3;
    }

    public static CameraIdCardPresenter_Factory create(Provider<RxBus<Object>> provider, Provider<RxThreadService> provider2, Provider<BitmapUtil> provider3) {
        return new CameraIdCardPresenter_Factory(provider, provider2, provider3);
    }

    public static CameraIdCardPresenter newInstance(RxBus<Object> rxBus, RxThreadService rxThreadService, BitmapUtil bitmapUtil) {
        return new CameraIdCardPresenter(rxBus, rxThreadService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public CameraIdCardPresenter get() {
        return newInstance((RxBus) this.f86141a.get(), (RxThreadService) this.f86142b.get(), (BitmapUtil) this.f86143c.get());
    }
}