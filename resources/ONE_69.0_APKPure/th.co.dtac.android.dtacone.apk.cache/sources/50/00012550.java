package th.p047co.dtac.android.dtacone.presenter.simActivation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.simActivation.SimActivationConfirmTransactionPresenter_Factory */
/* loaded from: classes8.dex */
public final class SimActivationConfirmTransactionPresenter_Factory implements Factory<SimActivationConfirmTransactionPresenter> {

    /* renamed from: a */
    public final Provider f86511a;

    /* renamed from: b */
    public final Provider f86512b;

    /* renamed from: c */
    public final Provider f86513c;

    /* renamed from: d */
    public final Provider f86514d;

    public SimActivationConfirmTransactionPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        this.f86511a = provider;
        this.f86512b = provider2;
        this.f86513c = provider3;
        this.f86514d = provider4;
    }

    public static SimActivationConfirmTransactionPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        return new SimActivationConfirmTransactionPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static SimActivationConfirmTransactionPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, MrtrErrorService mrtrErrorService) {
        return new SimActivationConfirmTransactionPresenter(rTRApiRx2, rx2ThreadService, configurationRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public SimActivationConfirmTransactionPresenter get() {
        return newInstance((RTRApiRx2) this.f86511a.get(), (Rx2ThreadService) this.f86512b.get(), (ConfigurationRepository) this.f86513c.get(), (MrtrErrorService) this.f86514d.get());
    }
}