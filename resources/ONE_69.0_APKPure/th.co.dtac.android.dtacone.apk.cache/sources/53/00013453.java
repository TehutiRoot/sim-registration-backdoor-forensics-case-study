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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.SubmitUseCase_Factory */
/* loaded from: classes10.dex */
public final class SubmitUseCase_Factory implements Factory<SubmitUseCase> {

    /* renamed from: a */
    public final Provider f92347a;

    public SubmitUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92347a = provider;
    }

    public static SubmitUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new SubmitUseCase_Factory(provider);
    }

    public static SubmitUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new SubmitUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public SubmitUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92347a.get());
    }
}