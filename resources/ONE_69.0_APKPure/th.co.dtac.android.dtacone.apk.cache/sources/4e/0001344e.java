package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetReminderListUseCase_Factory */
/* loaded from: classes10.dex */
public final class GetReminderListUseCase_Factory implements Factory<GetReminderListUseCase> {

    /* renamed from: a */
    public final Provider f92342a;

    /* renamed from: b */
    public final Provider f92343b;

    public GetReminderListUseCase_Factory(Provider<OneNadOutboundRepository> provider, Provider<ConfigurationRepository> provider2) {
        this.f92342a = provider;
        this.f92343b = provider2;
    }

    public static GetReminderListUseCase_Factory create(Provider<OneNadOutboundRepository> provider, Provider<ConfigurationRepository> provider2) {
        return new GetReminderListUseCase_Factory(provider, provider2);
    }

    public static GetReminderListUseCase newInstance(OneNadOutboundRepository oneNadOutboundRepository, ConfigurationRepository configurationRepository) {
        return new GetReminderListUseCase(oneNadOutboundRepository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public GetReminderListUseCase get() {
        return newInstance((OneNadOutboundRepository) this.f92342a.get(), (ConfigurationRepository) this.f92343b.get());
    }
}