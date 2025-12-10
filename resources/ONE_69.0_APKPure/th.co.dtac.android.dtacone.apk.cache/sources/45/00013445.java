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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.CallCustomerUseCase_Factory */
/* loaded from: classes10.dex */
public final class CallCustomerUseCase_Factory implements Factory<CallCustomerUseCase> {

    /* renamed from: a */
    public final Provider f92333a;

    public CallCustomerUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92333a = provider;
    }

    public static CallCustomerUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new CallCustomerUseCase_Factory(provider);
    }

    public static CallCustomerUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new CallCustomerUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public CallCustomerUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92333a.get());
    }
}