package th.p047co.dtac.android.dtacone.presenter.simActivation;

import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.simActivation.SimActivationScanBarcodePresenter_Factory */
/* loaded from: classes8.dex */
public final class SimActivationScanBarcodePresenter_Factory implements Factory<SimActivationScanBarcodePresenter> {

    /* renamed from: a */
    public final Provider f86524a;

    /* renamed from: b */
    public final Provider f86525b;

    /* renamed from: c */
    public final Provider f86526c;

    /* renamed from: d */
    public final Provider f86527d;

    /* renamed from: e */
    public final Provider f86528e;

    public SimActivationScanBarcodePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<RtrRx2Repository> provider4, Provider<RxPermissions> provider5) {
        this.f86524a = provider;
        this.f86525b = provider2;
        this.f86526c = provider3;
        this.f86527d = provider4;
        this.f86528e = provider5;
    }

    public static SimActivationScanBarcodePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<RtrRx2Repository> provider4, Provider<RxPermissions> provider5) {
        return new SimActivationScanBarcodePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SimActivationScanBarcodePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, RtrRx2Repository rtrRx2Repository, RxPermissions rxPermissions) {
        return new SimActivationScanBarcodePresenter(rTRApiRx2, rx2ThreadService, mrtrErrorService, rtrRx2Repository, rxPermissions);
    }

    @Override // javax.inject.Provider
    public SimActivationScanBarcodePresenter get() {
        return newInstance((RTRApiRx2) this.f86524a.get(), (Rx2ThreadService) this.f86525b.get(), (MrtrErrorService) this.f86526c.get(), (RtrRx2Repository) this.f86527d.get(), (RxPermissions) this.f86528e.get());
    }
}