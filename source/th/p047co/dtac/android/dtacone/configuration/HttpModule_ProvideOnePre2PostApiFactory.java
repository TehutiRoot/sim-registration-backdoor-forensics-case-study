package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOnePre2PostApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOnePre2PostApiFactory implements Factory<OnePre2PostApi> {

    /* renamed from: a */
    public final HttpModule f83169a;

    /* renamed from: b */
    public final Provider f83170b;

    public HttpModule_ProvideOnePre2PostApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83169a = httpModule;
        this.f83170b = provider;
    }

    public static HttpModule_ProvideOnePre2PostApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOnePre2PostApiFactory(httpModule, provider);
    }

    public static OnePre2PostApi provideOnePre2PostApi(HttpModule httpModule, Retrofit retrofit) {
        return (OnePre2PostApi) Preconditions.checkNotNullFromProvides(httpModule.m19605r(retrofit));
    }

    @Override // javax.inject.Provider
    public OnePre2PostApi get() {
        return provideOnePre2PostApi(this.f83169a, (Retrofit) this.f83170b.get());
    }
}
