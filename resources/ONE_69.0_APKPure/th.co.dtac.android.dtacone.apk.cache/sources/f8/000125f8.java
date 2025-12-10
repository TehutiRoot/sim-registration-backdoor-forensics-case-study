package th.p047co.dtac.android.dtacone.presenter.withDevice;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.WithDeviceInputUssdPresenter_Factory */
/* loaded from: classes8.dex */
public final class WithDeviceInputUssdPresenter_Factory implements Factory<WithDeviceInputUssdPresenter> {

    /* renamed from: a */
    public final Provider f86777a;

    /* renamed from: b */
    public final Provider f86778b;

    /* renamed from: c */
    public final Provider f86779c;

    public WithDeviceInputUssdPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86777a = provider;
        this.f86778b = provider2;
        this.f86779c = provider3;
    }

    public static WithDeviceInputUssdPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new WithDeviceInputUssdPresenter_Factory(provider, provider2, provider3);
    }

    public static WithDeviceInputUssdPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new WithDeviceInputUssdPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public WithDeviceInputUssdPresenter get() {
        return newInstance((RTRApiRx2) this.f86777a.get(), (Rx2ThreadService) this.f86778b.get(), (ServerErrorService) this.f86779c.get());
    }
}