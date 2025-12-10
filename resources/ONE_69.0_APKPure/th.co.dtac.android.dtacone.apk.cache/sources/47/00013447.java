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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.CallHistoryUseCase_Factory */
/* loaded from: classes10.dex */
public final class CallHistoryUseCase_Factory implements Factory<CallHistoryUseCase> {

    /* renamed from: a */
    public final Provider f92335a;

    public CallHistoryUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92335a = provider;
    }

    public static CallHistoryUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new CallHistoryUseCase_Factory(provider);
    }

    public static CallHistoryUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new CallHistoryUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public CallHistoryUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92335a.get());
    }
}