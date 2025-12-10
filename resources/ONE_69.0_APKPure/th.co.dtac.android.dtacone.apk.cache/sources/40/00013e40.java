package th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.report.repository.OneProfitReportRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneProfitReportViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneProfitReportViewModelFactory_Factory implements Factory<OneProfitReportViewModelFactory> {

    /* renamed from: a */
    public final Provider f96747a;

    /* renamed from: b */
    public final Provider f96748b;

    /* renamed from: c */
    public final Provider f96749c;

    /* renamed from: d */
    public final Provider f96750d;

    public OneProfitReportViewModelFactory_Factory(Provider<OneProfitReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<PreferencesViewModel> provider4) {
        this.f96747a = provider;
        this.f96748b = provider2;
        this.f96749c = provider3;
        this.f96750d = provider4;
    }

    public static OneProfitReportViewModelFactory_Factory create(Provider<OneProfitReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<PreferencesViewModel> provider4) {
        return new OneProfitReportViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneProfitReportViewModelFactory newInstance(OneProfitReportRepository oneProfitReportRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneProfitReportViewModelFactory(oneProfitReportRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneProfitReportViewModelFactory get() {
        return newInstance((OneProfitReportRepository) this.f96747a.get(), (Rx2ThreadService) this.f96748b.get(), (OneErrorService) this.f96749c.get(), (PreferencesViewModel) this.f96750d.get());
    }
}