package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneConsentAndESignApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneConsentAndESignApiFactory implements Factory<OneConsentAndESignApi> {

    /* renamed from: a */
    public final HttpModule f83161a;

    /* renamed from: b */
    public final Provider f83162b;

    public HttpModule_ProvideOneConsentAndESignApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83161a = httpModule;
        this.f83162b = provider;
    }

    public static HttpModule_ProvideOneConsentAndESignApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneConsentAndESignApiFactory(httpModule, provider);
    }

    public static OneConsentAndESignApi provideOneConsentAndESignApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneConsentAndESignApi) Preconditions.checkNotNullFromProvides(httpModule.m19609n(retrofit));
    }

    @Override // javax.inject.Provider
    public OneConsentAndESignApi get() {
        return provideOneConsentAndESignApi(this.f83161a, (Retrofit) this.f83162b.get());
    }
}
