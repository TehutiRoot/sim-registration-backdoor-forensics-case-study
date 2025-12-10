package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.BillingDeleteUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.CallCustomerUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.CallHistoryUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetCustomerInfoUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetInvoiceUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetReminderListUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetSearchListUseCase;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.SubmitUseCase;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneNadOutboundViewModel_Factory implements Factory<OneNadOutboundViewModel> {

    /* renamed from: a */
    public final Provider f92418a;

    /* renamed from: b */
    public final Provider f92419b;

    /* renamed from: c */
    public final Provider f92420c;

    /* renamed from: d */
    public final Provider f92421d;

    /* renamed from: e */
    public final Provider f92422e;

    /* renamed from: f */
    public final Provider f92423f;

    /* renamed from: g */
    public final Provider f92424g;

    /* renamed from: h */
    public final Provider f92425h;

    /* renamed from: i */
    public final Provider f92426i;

    /* renamed from: j */
    public final Provider f92427j;

    /* renamed from: k */
    public final Provider f92428k;

    /* renamed from: l */
    public final Provider f92429l;

    public OneNadOutboundViewModel_Factory(Provider<OneNadOutboundRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<GetSearchListUseCase> provider5, Provider<GetReminderListUseCase> provider6, Provider<GetInvoiceUseCase> provider7, Provider<BillingDeleteUseCase> provider8, Provider<GetCustomerInfoUseCase> provider9, Provider<CallCustomerUseCase> provider10, Provider<SubmitUseCase> provider11, Provider<CallHistoryUseCase> provider12) {
        this.f92418a = provider;
        this.f92419b = provider2;
        this.f92420c = provider3;
        this.f92421d = provider4;
        this.f92422e = provider5;
        this.f92423f = provider6;
        this.f92424g = provider7;
        this.f92425h = provider8;
        this.f92426i = provider9;
        this.f92427j = provider10;
        this.f92428k = provider11;
        this.f92429l = provider12;
    }

    public static OneNadOutboundViewModel_Factory create(Provider<OneNadOutboundRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<GetSearchListUseCase> provider5, Provider<GetReminderListUseCase> provider6, Provider<GetInvoiceUseCase> provider7, Provider<BillingDeleteUseCase> provider8, Provider<GetCustomerInfoUseCase> provider9, Provider<CallCustomerUseCase> provider10, Provider<SubmitUseCase> provider11, Provider<CallHistoryUseCase> provider12) {
        return new OneNadOutboundViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static OneNadOutboundViewModel newInstance(OneNadOutboundRepository oneNadOutboundRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, GetSearchListUseCase getSearchListUseCase, GetReminderListUseCase getReminderListUseCase, GetInvoiceUseCase getInvoiceUseCase, BillingDeleteUseCase billingDeleteUseCase, GetCustomerInfoUseCase getCustomerInfoUseCase, CallCustomerUseCase callCustomerUseCase, SubmitUseCase submitUseCase, CallHistoryUseCase callHistoryUseCase) {
        return new OneNadOutboundViewModel(oneNadOutboundRepository, rx2ThreadService, oneErrorService, configurationRepository, getSearchListUseCase, getReminderListUseCase, getInvoiceUseCase, billingDeleteUseCase, getCustomerInfoUseCase, callCustomerUseCase, submitUseCase, callHistoryUseCase);
    }

    @Override // javax.inject.Provider
    public OneNadOutboundViewModel get() {
        return newInstance((OneNadOutboundRepository) this.f92418a.get(), (Rx2ThreadService) this.f92419b.get(), (OneErrorService) this.f92420c.get(), (ConfigurationRepository) this.f92421d.get(), (GetSearchListUseCase) this.f92422e.get(), (GetReminderListUseCase) this.f92423f.get(), (GetInvoiceUseCase) this.f92424g.get(), (BillingDeleteUseCase) this.f92425h.get(), (GetCustomerInfoUseCase) this.f92426i.get(), (CallCustomerUseCase) this.f92427j.get(), (SubmitUseCase) this.f92428k.get(), (CallHistoryUseCase) this.f92429l.get());
    }
}