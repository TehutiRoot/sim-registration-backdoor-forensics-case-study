package th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneCommissionReportRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneCommissionReportViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneCommissionReportViewModelFactory_Factory implements Factory<OneCommissionReportViewModelFactory> {

    /* renamed from: a */
    public final Provider f96724a;

    /* renamed from: b */
    public final Provider f96725b;

    /* renamed from: c */
    public final Provider f96726c;

    public OneCommissionReportViewModelFactory_Factory(Provider<OneCommissionReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesViewModel> provider3) {
        this.f96724a = provider;
        this.f96725b = provider2;
        this.f96726c = provider3;
    }

    public static OneCommissionReportViewModelFactory_Factory create(Provider<OneCommissionReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesViewModel> provider3) {
        return new OneCommissionReportViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneCommissionReportViewModelFactory newInstance(OneCommissionReportRepository oneCommissionReportRepository, Rx2ThreadService rx2ThreadService, PreferencesViewModel preferencesViewModel) {
        return new OneCommissionReportViewModelFactory(oneCommissionReportRepository, rx2ThreadService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneCommissionReportViewModelFactory get() {
        return newInstance((OneCommissionReportRepository) this.f96724a.get(), (Rx2ThreadService) this.f96725b.get(), (PreferencesViewModel) this.f96726c.get());
    }
}