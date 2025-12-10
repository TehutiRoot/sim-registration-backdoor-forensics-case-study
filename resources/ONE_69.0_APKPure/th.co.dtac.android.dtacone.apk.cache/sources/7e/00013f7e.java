package th.p047co.dtac.android.dtacone.view.appOne.staff.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneStaffRepositoryImpl_Factory implements Factory<OneStaffRepositoryImpl> {

    /* renamed from: a */
    public final Provider f97464a;

    /* renamed from: b */
    public final Provider f97465b;

    public OneStaffRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        this.f97464a = provider;
        this.f97465b = provider2;
    }

    public static OneStaffRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        return new OneStaffRepositoryImpl_Factory(provider, provider2);
    }

    public static OneStaffRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository) {
        return new OneStaffRepositoryImpl(rTRApiRx2, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneStaffRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f97464a.get(), (ConfigurationRepository) this.f97465b.get());
    }
}