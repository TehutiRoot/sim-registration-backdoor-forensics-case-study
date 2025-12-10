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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneNadOutboundViewModelFactory_Factory implements Factory<OneNadOutboundViewModelFactory> {

    /* renamed from: a */
    public final Provider f92406a;

    /* renamed from: b */
    public final Provider f92407b;

    /* renamed from: c */
    public final Provider f92408c;

    /* renamed from: d */
    public final Provider f92409d;

    /* renamed from: e */
    public final Provider f92410e;

    /* renamed from: f */
    public final Provider f92411f;

    /* renamed from: g */
    public final Provider f92412g;

    /* renamed from: h */
    public final Provider f92413h;

    /* renamed from: i */
    public final Provider f92414i;

    /* renamed from: j */
    public final Provider f92415j;

    /* renamed from: k */
    public final Provider f92416k;

    /* renamed from: l */
    public final Provider f92417l;

    public OneNadOutboundViewModelFactory_Factory(Provider<OneNadOutboundRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<GetSearchListUseCase> provider5, Provider<GetReminderListUseCase> provider6, Provider<GetInvoiceUseCase> provider7, Provider<BillingDeleteUseCase> provider8, Provider<GetCustomerInfoUseCase> provider9, Provider<CallCustomerUseCase> provider10, Provider<SubmitUseCase> provider11, Provider<CallHistoryUseCase> provider12) {
        this.f92406a = provider;
        this.f92407b = provider2;
        this.f92408c = provider3;
        this.f92409d = provider4;
        this.f92410e = provider5;
        this.f92411f = provider6;
        this.f92412g = provider7;
        this.f92413h = provider8;
        this.f92414i = provider9;
        this.f92415j = provider10;
        this.f92416k = provider11;
        this.f92417l = provider12;
    }

    public static OneNadOutboundViewModelFactory_Factory create(Provider<OneNadOutboundRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<ConfigurationRepository> provider4, Provider<GetSearchListUseCase> provider5, Provider<GetReminderListUseCase> provider6, Provider<GetInvoiceUseCase> provider7, Provider<BillingDeleteUseCase> provider8, Provider<GetCustomerInfoUseCase> provider9, Provider<CallCustomerUseCase> provider10, Provider<SubmitUseCase> provider11, Provider<CallHistoryUseCase> provider12) {
        return new OneNadOutboundViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static OneNadOutboundViewModelFactory newInstance(OneNadOutboundRepository oneNadOutboundRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, GetSearchListUseCase getSearchListUseCase, GetReminderListUseCase getReminderListUseCase, GetInvoiceUseCase getInvoiceUseCase, BillingDeleteUseCase billingDeleteUseCase, GetCustomerInfoUseCase getCustomerInfoUseCase, CallCustomerUseCase callCustomerUseCase, SubmitUseCase submitUseCase, CallHistoryUseCase callHistoryUseCase) {
        return new OneNadOutboundViewModelFactory(oneNadOutboundRepository, rx2ThreadService, oneErrorService, configurationRepository, getSearchListUseCase, getReminderListUseCase, getInvoiceUseCase, billingDeleteUseCase, getCustomerInfoUseCase, callCustomerUseCase, submitUseCase, callHistoryUseCase);
    }

    @Override // javax.inject.Provider
    public OneNadOutboundViewModelFactory get() {
        return newInstance((OneNadOutboundRepository) this.f92406a.get(), (Rx2ThreadService) this.f92407b.get(), (OneErrorService) this.f92408c.get(), (ConfigurationRepository) this.f92409d.get(), (GetSearchListUseCase) this.f92410e.get(), (GetReminderListUseCase) this.f92411f.get(), (GetInvoiceUseCase) this.f92412g.get(), (BillingDeleteUseCase) this.f92413h.get(), (GetCustomerInfoUseCase) this.f92414i.get(), (CallCustomerUseCase) this.f92415j.get(), (SubmitUseCase) this.f92416k.get(), (CallHistoryUseCase) this.f92417l.get());
    }
}