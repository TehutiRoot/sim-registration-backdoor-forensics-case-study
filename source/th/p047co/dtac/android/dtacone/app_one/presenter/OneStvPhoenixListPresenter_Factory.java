package th.p047co.dtac.android.dtacone.app_one.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter_Factory */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter_Factory implements Factory<OneStvPhoenixListPresenter> {

    /* renamed from: a */
    public final Provider f82345a;

    public OneStvPhoenixListPresenter_Factory(Provider<RxThreadService> provider) {
        this.f82345a = provider;
    }

    public static OneStvPhoenixListPresenter_Factory create(Provider<RxThreadService> provider) {
        return new OneStvPhoenixListPresenter_Factory(provider);
    }

    public static OneStvPhoenixListPresenter newInstance(RxThreadService rxThreadService) {
        return new OneStvPhoenixListPresenter(rxThreadService);
    }

    @Override // javax.inject.Provider
    public OneStvPhoenixListPresenter get() {
        return newInstance((RxThreadService) this.f82345a.get());
    }
}
