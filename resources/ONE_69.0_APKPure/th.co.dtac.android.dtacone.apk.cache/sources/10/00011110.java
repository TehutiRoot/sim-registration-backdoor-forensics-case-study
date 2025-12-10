package th.p047co.dtac.android.dtacone.app_one.repository;

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
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepositoryImpl_Factory */
/* loaded from: classes7.dex */
public final class OneChangePasswordRepositoryImpl_Factory implements Factory<OneChangePasswordRepositoryImpl> {

    /* renamed from: a */
    public final Provider f82445a;

    /* renamed from: b */
    public final Provider f82446b;

    public OneChangePasswordRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        this.f82445a = provider;
        this.f82446b = provider2;
    }

    public static OneChangePasswordRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<ConfigurationRepository> provider2) {
        return new OneChangePasswordRepositoryImpl_Factory(provider, provider2);
    }

    public static OneChangePasswordRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, ConfigurationRepository configurationRepository) {
        return new OneChangePasswordRepositoryImpl(rTRApiRx2, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneChangePasswordRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f82445a.get(), (ConfigurationRepository) this.f82446b.get());
    }
}