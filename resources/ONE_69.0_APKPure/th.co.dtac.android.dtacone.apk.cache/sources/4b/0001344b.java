package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetInvoiceUseCase_Factory */
/* loaded from: classes10.dex */
public final class GetInvoiceUseCase_Factory implements Factory<GetInvoiceUseCase> {

    /* renamed from: a */
    public final Provider f92339a;

    public GetInvoiceUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92339a = provider;
    }

    public static GetInvoiceUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new GetInvoiceUseCase_Factory(provider);
    }

    public static GetInvoiceUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new GetInvoiceUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public GetInvoiceUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92339a.get());
    }
}