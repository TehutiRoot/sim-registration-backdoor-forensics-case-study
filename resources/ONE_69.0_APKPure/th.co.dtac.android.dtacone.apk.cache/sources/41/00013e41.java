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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneProfitReportViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneProfitReportViewModel_Factory implements Factory<OneProfitReportViewModel> {

    /* renamed from: a */
    public final Provider f96751a;

    /* renamed from: b */
    public final Provider f96752b;

    /* renamed from: c */
    public final Provider f96753c;

    /* renamed from: d */
    public final Provider f96754d;

    public OneProfitReportViewModel_Factory(Provider<OneProfitReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<PreferencesViewModel> provider4) {
        this.f96751a = provider;
        this.f96752b = provider2;
        this.f96753c = provider3;
        this.f96754d = provider4;
    }

    public static OneProfitReportViewModel_Factory create(Provider<OneProfitReportRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<PreferencesViewModel> provider4) {
        return new OneProfitReportViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneProfitReportViewModel newInstance(OneProfitReportRepository oneProfitReportRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneProfitReportViewModel(oneProfitReportRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneProfitReportViewModel get() {
        return newInstance((OneProfitReportRepository) this.f96751a.get(), (Rx2ThreadService) this.f96752b.get(), (OneErrorService) this.f96753c.get(), (PreferencesViewModel) this.f96754d.get());
    }
}