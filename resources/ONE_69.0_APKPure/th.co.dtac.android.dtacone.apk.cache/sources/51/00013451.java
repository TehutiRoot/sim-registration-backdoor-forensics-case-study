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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetSearchListUseCase_Factory */
/* loaded from: classes10.dex */
public final class GetSearchListUseCase_Factory implements Factory<GetSearchListUseCase> {

    /* renamed from: a */
    public final Provider f92345a;

    public GetSearchListUseCase_Factory(Provider<OneNadOutboundRepository> provider) {
        this.f92345a = provider;
    }

    public static GetSearchListUseCase_Factory create(Provider<OneNadOutboundRepository> provider) {
        return new GetSearchListUseCase_Factory(provider);
    }

    public static GetSearchListUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository) {
        return new GetSearchListUseCase(oneNadOutboundRepository);
    }

    @Override // javax.inject.Provider
    public GetSearchListUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92345a.get());
    }
}