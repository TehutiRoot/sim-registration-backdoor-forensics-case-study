package th.p047co.dtac.android.dtacone.presenter.stv;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter_Factory */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter_Factory implements Factory<StvPhoenixListPresenter> {

    /* renamed from: a */
    public final Provider f86631a;

    public StvPhoenixListPresenter_Factory(Provider<RxThreadService> provider) {
        this.f86631a = provider;
    }

    public static StvPhoenixListPresenter_Factory create(Provider<RxThreadService> provider) {
        return new StvPhoenixListPresenter_Factory(provider);
    }

    public static StvPhoenixListPresenter newInstance(RxThreadService rxThreadService) {
        return new StvPhoenixListPresenter(rxThreadService);
    }

    @Override // javax.inject.Provider
    public StvPhoenixListPresenter get() {
        return newInstance((RxThreadService) this.f86631a.get());
    }
}