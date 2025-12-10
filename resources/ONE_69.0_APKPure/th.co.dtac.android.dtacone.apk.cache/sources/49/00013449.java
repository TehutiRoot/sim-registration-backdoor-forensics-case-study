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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetCustomerInfoUseCase_Factory */
/* loaded from: classes10.dex */
public final class GetCustomerInfoUseCase_Factory implements Factory<GetCustomerInfoUseCase> {

    /* renamed from: a */
    public final Provider f92337a;

    public GetCustomerInfoUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92337a = provider;
    }

    public static GetCustomerInfoUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new GetCustomerInfoUseCase_Factory(provider);
    }

    public static GetCustomerInfoUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new GetCustomerInfoUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public GetCustomerInfoUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92337a.get());
    }
}