package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRTRApiPreventRetryFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRTRApiPreventRetryFactory implements Factory<RTRApi> {

    /* renamed from: a */
    public final HttpModule f83175a;

    /* renamed from: b */
    public final Provider f83176b;

    public HttpModule_ProvideRTRApiPreventRetryFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83175a = httpModule;
        this.f83176b = provider;
    }

    public static HttpModule_ProvideRTRApiPreventRetryFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideRTRApiPreventRetryFactory(httpModule, provider);
    }

    public static RTRApi provideRTRApiPreventRetry(HttpModule httpModule, Retrofit retrofit) {
        return (RTRApi) Preconditions.checkNotNullFromProvides(httpModule.m19602u(retrofit));
    }

    @Override // javax.inject.Provider
    public RTRApi get() {
        return provideRTRApiPreventRetry(this.f83175a, (Retrofit) this.f83176b.get());
    }
}
