package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOneDeviceSaleTrueApiFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOneDeviceSaleTrueApiFactory implements Factory<OneDeviceSaleTrueApi> {

    /* renamed from: a */
    public final HttpModule f83165a;

    /* renamed from: b */
    public final Provider f83166b;

    public HttpModule_ProvideOneDeviceSaleTrueApiFactory(HttpModule httpModule, Provider<Retrofit> provider) {
        this.f83165a = httpModule;
        this.f83166b = provider;
    }

    public static HttpModule_ProvideOneDeviceSaleTrueApiFactory create(HttpModule httpModule, Provider<Retrofit> provider) {
        return new HttpModule_ProvideOneDeviceSaleTrueApiFactory(httpModule, provider);
    }

    public static OneDeviceSaleTrueApi provideOneDeviceSaleTrueApi(HttpModule httpModule, Retrofit retrofit) {
        return (OneDeviceSaleTrueApi) Preconditions.checkNotNullFromProvides(httpModule.m19607p(retrofit));
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueApi get() {
        return provideOneDeviceSaleTrueApi(this.f83165a, (Retrofit) this.f83166b.get());
    }
}
