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
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideRetrofitRx2Factory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideRetrofitRx2Factory implements Factory<Retrofit> {

    /* renamed from: a */
    public final HttpModule f83179a;

    /* renamed from: b */
    public final Provider f83180b;

    /* renamed from: c */
    public final Provider f83181c;

    public HttpModule_ProvideRetrofitRx2Factory(HttpModule httpModule, Provider<OkHttpClient> provider, Provider<Gson> provider2) {
        this.f83179a = httpModule;
        this.f83180b = provider;
        this.f83181c = provider2;
    }

    public static HttpModule_ProvideRetrofitRx2Factory create(HttpModule httpModule, Provider<OkHttpClient> provider, Provider<Gson> provider2) {
        return new HttpModule_ProvideRetrofitRx2Factory(httpModule, provider, provider2);
    }

    public static Retrofit provideRetrofitRx2(HttpModule httpModule, OkHttpClient okHttpClient, Gson gson) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(httpModule.m19599x(okHttpClient, gson));
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofitRx2(this.f83179a, (OkHttpClient) this.f83180b.get(), (Gson) this.f83181c.get());
    }
}
