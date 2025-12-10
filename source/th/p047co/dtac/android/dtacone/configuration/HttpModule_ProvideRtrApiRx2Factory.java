package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRtrApiRx2Factory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRtrApiRx2Factory implements Factory<RTRApiRx2> {

    /* renamed from: a */
    public final HttpModule f83188a;

    /* renamed from: b */
    public final Provider f83189b;

    public HttpModule_ProvideRtrApiRx2Factory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83188a = httpModule;
        this.f83189b = provider;
    }

    public static HttpModule_ProvideRtrApiRx2Factory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideRtrApiRx2Factory(httpModule, provider);
    }

    public static RTRApiRx2 provideRtrApiRx2(HttpModule httpModule, Retrofit retrofit) {
        return (RTRApiRx2) Preconditions.checkNotNullFromProvides(httpModule.m19597z(retrofit));
    }

    @Override // javax.inject.Provider
    public RTRApiRx2 get() {
        return provideRtrApiRx2(this.f83188a, (Retrofit) this.f83189b.get());
    }
}
