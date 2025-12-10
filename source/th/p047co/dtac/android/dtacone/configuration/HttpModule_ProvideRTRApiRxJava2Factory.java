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
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRTRApiRxJava2Factory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRTRApiRxJava2Factory implements Factory<RTRApi> {

    /* renamed from: a */
    public final HttpModule f83177a;

    /* renamed from: b */
    public final Provider f83178b;

    public HttpModule_ProvideRTRApiRxJava2Factory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83177a = httpModule;
        this.f83178b = provider;
    }

    public static HttpModule_ProvideRTRApiRxJava2Factory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideRTRApiRxJava2Factory(httpModule, provider);
    }

    public static RTRApi provideRTRApiRxJava2(HttpModule httpModule, Retrofit retrofit) {
        return (RTRApi) Preconditions.checkNotNullFromProvides(httpModule.m19601v(retrofit));
    }

    @Override // javax.inject.Provider
    public RTRApi get() {
        return provideRTRApiRxJava2(this.f83177a, (Retrofit) this.f83178b.get());
    }
}
