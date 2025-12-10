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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneCommissionReportViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneCommissionReportViewModel_Factory implements Factory<OneCommissionReportViewModel> {

    /* renamed from: a */
    public final Provider f96727a;

    /* renamed from: b */
    public final Provider f96728b;

    /* renamed from: c */
    public final Provider f96729c;

    public OneCommissionReportViewModel_Factory(Provider<OneCommissionReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesViewModel> provider3) {
        this.f96727a = provider;
        this.f96728b = provider2;
        this.f96729c = provider3;
    }

    public static OneCommissionReportViewModel_Factory create(Provider<OneCommissionReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<PreferencesViewModel> provider3) {
        return new OneCommissionReportViewModel_Factory(provider, provider2, provider3);
    }

    public static OneCommissionReportViewModel newInstance(OneCommissionReportRepository oneCommissionReportRepository, Rx2ThreadService rx2ThreadService, PreferencesViewModel preferencesViewModel) {
        return new OneCommissionReportViewModel(oneCommissionReportRepository, rx2ThreadService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneCommissionReportViewModel get() {
        return newInstance((OneCommissionReportRepository) this.f96727a.get(), (Rx2ThreadService) this.f96728b.get(), (PreferencesViewModel) this.f96729c.get());
    }
}