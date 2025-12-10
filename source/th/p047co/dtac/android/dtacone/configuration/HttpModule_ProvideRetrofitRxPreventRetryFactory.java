package th.p047co.dtac.android.dtacone.configuration;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRetrofitRxPreventRetryFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRetrofitRxPreventRetryFactory implements Factory<Retrofit> {

    /* renamed from: a */
    public final HttpModule f83185a;

    /* renamed from: b */
    public final Provider f83186b;

    /* renamed from: c */
    public final Provider f83187c;

    public HttpModule_ProvideRetrofitRxPreventRetryFactory(HttpModule httpModule, Provider<Gson> provider, Provider<OkHttpClient> provider2) {
        this.f83185a = httpModule;
        this.f83186b = provider;
        this.f83187c = provider2;
    }

    public static HttpModule_ProvideRetrofitRxPreventRetryFactory create(HttpModule httpModule, Provider<Gson> provider, Provider<OkHttpClient> provider2) {
        return new HttpModule_ProvideRetrofitRxPreventRetryFactory(httpModule, provider, provider2);
    }

    public static Retrofit provideRetrofitRxPreventRetry(HttpModule httpModule, Gson gson, OkHttpClient okHttpClient) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(httpModule.m19598y(gson, okHttpClient));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofitRxPreventRetry(this.f83185a, (Gson) this.f83186b.get(), (OkHttpClient) this.f83187c.get());
    }
}
