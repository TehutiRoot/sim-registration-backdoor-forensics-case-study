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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.BillingDeleteUseCase_Factory */
/* loaded from: classes10.dex */
public final class BillingDeleteUseCase_Factory implements Factory<BillingDeleteUseCase> {

    /* renamed from: a */
    public final Provider f92331a;

    public BillingDeleteUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92331a = provider;
    }

    public static BillingDeleteUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new BillingDeleteUseCase_Factory(provider);
    }

    public static BillingDeleteUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new BillingDeleteUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public BillingDeleteUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92331a.get());
    }
}