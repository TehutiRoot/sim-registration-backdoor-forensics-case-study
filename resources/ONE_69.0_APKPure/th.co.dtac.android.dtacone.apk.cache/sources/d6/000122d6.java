package th.p047co.dtac.android.dtacone.presenter.change_sim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimReasonPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimReasonPresenter_Factory implements Factory<ChangeSimReasonPresenter> {

    /* renamed from: a */
    public final Provider f85669a;

    /* renamed from: b */
    public final Provider f85670b;

    /* renamed from: c */
    public final Provider f85671c;

    /* renamed from: d */
    public final Provider f85672d;

    /* renamed from: e */
    public final Provider f85673e;

    /* renamed from: f */
    public final Provider f85674f;

    public ChangeSimReasonPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrChangeSimRepository> provider6) {
        this.f85669a = provider;
        this.f85670b = provider2;
        this.f85671c = provider3;
        this.f85672d = provider4;
        this.f85673e = provider5;
        this.f85674f = provider6;
    }

    public static ChangeSimReasonPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<MrtrChangeSimRepository> provider6) {
        return new ChangeSimReasonPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChangeSimReasonPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, MrtrChangeSimRepository mrtrChangeSimRepository) {
        return new ChangeSimReasonPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, preferencesRepository, configurationRepository, mrtrChangeSimRepository);
    }

    @Override // javax.inject.Provider
    public ChangeSimReasonPresenter get() {
        return newInstance((RTRApiRx2) this.f85669a.get(), (Rx2ThreadService) this.f85670b.get(), (ServerErrorService) this.f85671c.get(), (PreferencesRepository) this.f85672d.get(), (ConfigurationRepository) this.f85673e.get(), (MrtrChangeSimRepository) this.f85674f.get());
    }
}