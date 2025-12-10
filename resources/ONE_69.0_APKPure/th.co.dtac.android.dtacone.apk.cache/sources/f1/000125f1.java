package th.p047co.dtac.android.dtacone.presenter.withDevice;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.WithDeviceConfirmPresenter_Factory */
/* loaded from: classes8.dex */
public final class WithDeviceConfirmPresenter_Factory implements Factory<WithDeviceConfirmPresenter> {

    /* renamed from: a */
    public final Provider f86766a;

    /* renamed from: b */
    public final Provider f86767b;

    /* renamed from: c */
    public final Provider f86768c;

    /* renamed from: d */
    public final Provider f86769d;

    /* renamed from: e */
    public final Provider f86770e;

    public WithDeviceConfirmPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<BitmapUtil> provider3, Provider<FileUtil> provider4, Provider<ServerErrorService> provider5) {
        this.f86766a = provider;
        this.f86767b = provider2;
        this.f86768c = provider3;
        this.f86769d = provider4;
        this.f86770e = provider5;
    }

    public static WithDeviceConfirmPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<BitmapUtil> provider3, Provider<FileUtil> provider4, Provider<ServerErrorService> provider5) {
        return new WithDeviceConfirmPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static WithDeviceConfirmPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, FileUtil fileUtil, ServerErrorService serverErrorService) {
        return new WithDeviceConfirmPresenter(rTRApiRx2, rx2ThreadService, bitmapUtil, fileUtil, serverErrorService);
    }

    @Override // javax.inject.Provider
    public WithDeviceConfirmPresenter get() {
        return newInstance((RTRApiRx2) this.f86766a.get(), (Rx2ThreadService) this.f86767b.get(), (BitmapUtil) this.f86768c.get(), (FileUtil) this.f86769d.get(), (ServerErrorService) this.f86770e.get());
    }
}