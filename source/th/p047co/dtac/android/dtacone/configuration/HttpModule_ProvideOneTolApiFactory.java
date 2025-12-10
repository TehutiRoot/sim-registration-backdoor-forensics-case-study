package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.oneTol.OneTolApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneTolApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneTolApiFactory implements Factory<OneTolApi> {

    /* renamed from: a */
    public final HttpModule f83171a;

    /* renamed from: b */
    public final Provider f83172b;

    public HttpModule_ProvideOneTolApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83171a = httpModule;
        this.f83172b = provider;
    }

    public static HttpModule_ProvideOneTolApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneTolApiFactory(httpModule, provider);
    }

    public static OneTolApi provideOneTolApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneTolApi) Preconditions.checkNotNullFromProvides(httpModule.m19604s(retrofit));
    }

    @Override // javax.inject.Provider
    public OneTolApi get() {
        return provideOneTolApi(this.f83171a, (Retrofit) this.f83172b.get());
    }
}
