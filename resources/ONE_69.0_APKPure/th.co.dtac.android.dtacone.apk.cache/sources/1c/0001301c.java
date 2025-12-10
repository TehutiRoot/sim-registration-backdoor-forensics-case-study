package th.p047co.dtac.android.dtacone.view.appOne.eSign.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneConsentAndESignRepositoryImpl_Factory implements Factory<OneConsentAndESignRepositoryImpl> {

    /* renamed from: a */
    public final Provider f90790a;

    public OneConsentAndESignRepositoryImpl_Factory(Provider<OneConsentAndESignApi> provider) {
        this.f90790a = provider;
    }

    public static OneConsentAndESignRepositoryImpl_Factory create(Provider<OneConsentAndESignApi> provider) {
        return new OneConsentAndESignRepositoryImpl_Factory(provider);
    }

    public static OneConsentAndESignRepositoryImpl newInstance(OneConsentAndESignApi oneConsentAndESignApi) {
        return new OneConsentAndESignRepositoryImpl(oneConsentAndESignApi);
    }

    @Override // javax.inject.Provider
    public OneConsentAndESignRepositoryImpl get() {
        return newInstance((OneConsentAndESignApi) this.f90790a.get());
    }
}