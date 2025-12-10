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
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRetrofitRxFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRetrofitRxFactory implements Factory<Retrofit> {

    /* renamed from: a */
    public final HttpModule f83182a;

    /* renamed from: b */
    public final Provider f83183b;

    /* renamed from: c */
    public final Provider f83184c;

    public HttpModule_ProvideRetrofitRxFactory(HttpModule httpModule, Provider<OkHttpClient> provider, Provider<Gson> provider2) {
        this.f83182a = httpModule;
        this.f83183b = provider;
        this.f83184c = provider2;
    }

    public static HttpModule_ProvideRetrofitRxFactory create(HttpModule httpModule, Provider<OkHttpClient> provider, Provider<Gson> provider2) {
        return new HttpModule_ProvideRetrofitRxFactory(httpModule, provider, provider2);
    }

    public static Retrofit provideRetrofitRx(HttpModule httpModule, OkHttpClient okHttpClient, Gson gson) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(httpModule.m19600w(okHttpClient, gson));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofitRx(this.f83182a, (OkHttpClient) this.f83183b.get(), (Gson) this.f83184c.get());
    }
}
