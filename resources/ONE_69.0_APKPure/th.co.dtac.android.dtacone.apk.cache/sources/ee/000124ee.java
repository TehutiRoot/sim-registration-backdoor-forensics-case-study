package th.p047co.dtac.android.dtacone.presenter.reports;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrWithholdTaxPhotoPresenter_Factory */
/* loaded from: classes8.dex */
public final class RtrWithholdTaxPhotoPresenter_Factory implements Factory<RtrWithholdTaxPhotoPresenter> {

    /* renamed from: a */
    public final Provider f86383a;

    /* renamed from: b */
    public final Provider f86384b;

    /* renamed from: c */
    public final Provider f86385c;

    public RtrWithholdTaxPhotoPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86383a = provider;
        this.f86384b = provider2;
        this.f86385c = provider3;
    }

    public static RtrWithholdTaxPhotoPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RtrWithholdTaxPhotoPresenter_Factory(provider, provider2, provider3);
    }

    public static RtrWithholdTaxPhotoPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new RtrWithholdTaxPhotoPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RtrWithholdTaxPhotoPresenter get() {
        return newInstance((RTRApiRx2) this.f86383a.get(), (Rx2ThreadService) this.f86384b.get(), (ServerErrorService) this.f86385c.get());
    }
}