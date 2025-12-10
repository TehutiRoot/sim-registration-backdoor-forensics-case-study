package th.p047co.dtac.android.dtacone.presenter.balance;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.balance.BalancePresenter_Factory */
/* loaded from: classes8.dex */
public final class BalancePresenter_Factory implements Factory<BalancePresenter> {

    /* renamed from: a */
    public final Provider f85279a;

    /* renamed from: b */
    public final Provider f85280b;

    /* renamed from: c */
    public final Provider f85281c;

    public BalancePresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f85279a = provider;
        this.f85280b = provider2;
        this.f85281c = provider3;
    }

    public static BalancePresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new BalancePresenter_Factory(provider, provider2, provider3);
    }

    public static BalancePresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new BalancePresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public BalancePresenter get() {
        return newInstance((RTRApi) this.f85279a.get(), (ServerErrorService) this.f85280b.get(), (RxThreadService) this.f85281c.get());
    }
}