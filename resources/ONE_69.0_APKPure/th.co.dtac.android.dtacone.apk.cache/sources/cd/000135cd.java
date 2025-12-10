package th.p047co.dtac.android.dtacone.view.appOne.online_activation.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.repository.OneOnlineActivationRepository_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineActivationRepository_Factory implements Factory<OneOnlineActivationRepository> {

    /* renamed from: a */
    public final Provider f93010a;

    /* renamed from: b */
    public final Provider f93011b;

    /* renamed from: c */
    public final Provider f93012c;

    public OneOnlineActivationRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        this.f93010a = provider;
        this.f93011b = provider2;
        this.f93012c = provider3;
    }

    public static OneOnlineActivationRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3) {
        return new OneOnlineActivationRepository_Factory(provider, provider2, provider3);
    }

    public static OneOnlineActivationRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository) {
        return new OneOnlineActivationRepository(rTRApiRx2, rtrRx2Repository, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneOnlineActivationRepository get() {
        return newInstance((RTRApiRx2) this.f93010a.get(), (RtrRx2Repository) this.f93011b.get(), (ConfigurationRepository) this.f93012c.get());
    }
}