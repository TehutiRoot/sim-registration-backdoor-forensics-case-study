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
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRTRApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRTRApiFactory implements Factory<RTRApi> {

    /* renamed from: a */
    public final HttpModule f83173a;

    /* renamed from: b */
    public final Provider f83174b;

    public HttpModule_ProvideRTRApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83173a = httpModule;
        this.f83174b = provider;
    }

    public static HttpModule_ProvideRTRApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideRTRApiFactory(httpModule, provider);
    }

    public static RTRApi provideRTRApi(HttpModule httpModule, Retrofit retrofit) {
        return (RTRApi) Preconditions.checkNotNullFromProvides(httpModule.m19603t(retrofit));
    }

    @Override // javax.inject.Provider
    public RTRApi get() {
        return provideRTRApi(this.f83173a, (Retrofit) this.f83174b.get());
    }
}
