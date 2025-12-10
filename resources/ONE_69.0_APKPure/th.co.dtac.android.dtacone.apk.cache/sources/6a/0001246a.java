package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.content.Context;
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
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidCardValidationPresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidCardValidationPresenter_Factory implements Factory<PrepaidCardValidationPresenter> {

    /* renamed from: a */
    public final Provider f86176a;

    /* renamed from: b */
    public final Provider f86177b;

    /* renamed from: c */
    public final Provider f86178c;

    /* renamed from: d */
    public final Provider f86179d;

    public PrepaidCardValidationPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<Context> provider4) {
        this.f86176a = provider;
        this.f86177b = provider2;
        this.f86178c = provider3;
        this.f86179d = provider4;
    }

    public static PrepaidCardValidationPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<Context> provider4) {
        return new PrepaidCardValidationPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static PrepaidCardValidationPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, Context context) {
        return new PrepaidCardValidationPresenter(rTRApi, rxThreadService, serverErrorService, context);
    }

    @Override // javax.inject.Provider
    public PrepaidCardValidationPresenter get() {
        return newInstance((RTRApi) this.f86176a.get(), (RxThreadService) this.f86177b.get(), (ServerErrorService) this.f86178c.get(), (Context) this.f86179d.get());
    }
}